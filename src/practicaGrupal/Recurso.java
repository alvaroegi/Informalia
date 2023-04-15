/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David_2
 */
public class Recurso implements Serializable {
    private String nombre;
    private String ID;
    private int BonusOfen;
    private int BonusDefen;
    private int BonusAstu;
    private boolean EnUso;
        
    public Recurso(String name, RegistroJuego reg){
        nombre=name;
        EnUso=false;
        
        ArrayList <Recurso> rec= reg.getListaRecursos();
        if(rec.isEmpty()){
            ID="AA0";
        }else{
            String id1 = rec.get(rec.size()-1).getID();
            ID=aumentarID(id1);
        }
        BonusDefen = (int)(Math.random()*5+1);
        BonusOfen = (int)(Math.random()*5+1);
        BonusAstu = (int)(Math.random()*5+1);
        
    }
    
    public Recurso(Recurso otro) {
        this.nombre = otro.nombre;
        this.ID = otro.ID;
        this.BonusOfen = otro.BonusOfen;
        this.BonusDefen = otro.BonusDefen;
        this.BonusAstu = otro.BonusAstu;
        this.EnUso = otro.EnUso;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getID(){
        return ID;
    }
    
    public int getBonusOfen(){
        return BonusOfen;
    }
    
    public int getBonusDefen(){
        return BonusDefen;
    }
    
    public int getBonusAstu(){
        return BonusAstu;
    }
    
    public boolean getEnUso(){
        return EnUso;
    }
    
    public void setNombre(String nuevo_nombre){
        this.nombre=nuevo_nombre;
    }
    
    public void setEnUso(boolean nuevo){
        this.EnUso=nuevo;
    }

    @Override
    public String toString() {
        return nombre + "\t " + ID + " " + "Ataque: " + BonusOfen + " " + "Defensa: " + BonusDefen + " " + "Astucia: " + BonusAstu;
    }
    
    private String aumentarID(String id){   
        char idC[] = id.toCharArray();
        if(idC[2]=='9'){
            if(idC[1]=='Z'){
                int i = (int)(id.charAt(0));
                i++;
                idC[0]=(char)i;
                idC[1]='A';
                idC[2]='0';
            }
            else{
                int j = (int)(id.charAt(1));
                j++;
                idC[1]= (char)j;
                idC[2]='0';
            }
            
        }
        else{
            int t =(int)id.charAt(2);
            t++;
            idC[2]=(char)t;
        }
        id="";
        for(int k=0;k<3;k++){
            
            id=id+idC[k];
        }
        return id;
    }
    
    
}
