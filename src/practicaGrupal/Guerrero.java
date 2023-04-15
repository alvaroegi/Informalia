/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author David_2
 */
public class Guerrero extends Personaje implements Serializable{
    private int HabCC;
    private int HabDist;
    
    
    public Guerrero(Guerrero otro){
        super(otro);
        this.HabCC=otro.HabCC;
        this.HabDist=otro.HabDist;
    }
    
    public Guerrero(RegistroJuego reg, String name, String raza){
        super(reg,name,raza);
        HabCC = (int)(Math.random()*5+1);
        HabDist = (int)(Math.random()*5+1);
        reg.AnyadirPersonaje(this);
    }
    
    public int getHabCC(){
        return HabCC;
    }
    
    public int getHabDist(){
        return HabDist;
    }
    
    @Override
    public int Atacar(){
        int dados = getRecursoActivo().getBonusOfen();
        
        if (((Arma)getRecursoActivo()).getRango()==0){
            dados= dados + getFuerza() + HabCC;
        } else{
            dados= dados + getDestreza() + HabDist;
        }
        int exitos=0;
        for(int i=0;i<dados;i++){
           int num= (int)(Math.random()*6+1);           
           if (num>=5){
               exitos= exitos +1;
           }        
        }
        return exitos;
    }
    
    @Override
    public int Defender(){
        int dados = getRecursoActivo().getBonusDefen();
        int exitos = 0;
        if (((Arma)getRecursoActivo()).getRango()==0){
            dados= dados + getFuerza() + HabCC;
        } else{
            dados= dados + getDestreza() + HabDist;
        }
        
        for(int i=0;i<dados;i++){
           int num= (int)(Math.random()*6+1);           
           if (num>=5){
               exitos= exitos +1;
           }        
        }
        return exitos;
    }
    
    @Override
    public int Astucia(){
        int dados = getRecursoActivo().getBonusAstu();
        if ( ((Arma)getRecursoActivo()).getRango()==0){
            dados= dados + getFuerza() + HabCC;
        } else{
            dados= dados + getDestreza() + HabDist;
        }
        int exitos=0;
        for(int i=0;i<dados;i++){
           int num= (int)(Math.random()*6+1);           
           if (num>=5){
               exitos= exitos +1;
           }        
        }
        return exitos;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Habilidad a cuerpo: " + HabCC + " " + "Habilidad distancia: " + HabDist;
    }
    
}
