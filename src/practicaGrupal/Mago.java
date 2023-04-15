/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author alemg
 */
public class Mago extends Personaje implements Serializable{
    private int PoderMag;
   
    public Mago(Mago otro) {
        super(otro);
        this.PoderMag = otro.PoderMag;
    }
    
    public Mago (RegistroJuego reg, String name, String raza) {
        super(reg,name,raza);
        PoderMag = (int)(Math.random()*5+1);
        reg.AnyadirPersonaje(this);
    }
    
    public int getPoderMag() {
        return PoderMag;
    }
    
    public void setPoderMag(int nuevo) {
        PoderMag = nuevo;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + "Poder Mágico: " + PoderMag;
    }
    
    @Override
    public int Atacar() {
        int dado;
        int exitos = 0;
        int valorAtaque = this.getRecursoActivo().getBonusOfen() + this.getInteligencia() + this.PoderMag;
        for(int i=0; i<valorAtaque; i++) {
            dado = (int)(Math.random()*6+1);
            if (dado>=5) {
                exitos++;
            }
        }
        return exitos;
    }
    
    @Override
    public int Defender() {
        int dado;
        int exitos = 0;
        int valorDefensa = this.getRecursoActivo().getBonusDefen() + this.getInteligencia() + this.PoderMag;
        for(int i=0; i<valorDefensa; i++) {
            dado = (int)(Math.random()*6+1);
            if (dado>=5) {
                exitos++;
            }
        }
        return exitos;
    }
    
    @Override
    public int Astucia() {
        int dado;
        int exitos = 0;
        int valorAstucia = this.getRecursoActivo().getBonusAstu() + this.getInteligencia() + this.PoderMag;
        for(int i=0; i<valorAstucia; i++) {
            dado = (int)(Math.random()*6+1);
            if (dado>=5) {
                exitos++;
            }
        }
        return exitos;
    }
    
}