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
public class Arma extends Recurso implements Serializable{
    private int manejo;
    private int rango;
    
    
    public Arma(String nombre,RegistroJuego reg,int r,int m){
        super(nombre,reg);
        rango=r;
        manejo=m;
        reg.AnyadirRecurso(this);     
    }

    public Arma(Arma otro){
        super(otro);
        this.manejo=otro.manejo;
        this.rango=otro.rango;
    }
        
    
    public int getManejo(){
        return manejo;
    }
    
    public int getRango(){
        return rango;
    }
}
  