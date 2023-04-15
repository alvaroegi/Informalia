/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

/**
 *
 * @author Alvaro
 */
public class Explorador extends Personaje implements Serializable {
    private int HabArma;
    private int PoderMag;
    
    public Explorador (Explorador otro){
        super(otro);
        this.HabArma = otro.HabArma;
        this.PoderMag = otro.PoderMag;
    }
    public Explorador(RegistroJuego reg, String name, String raza){
        super(reg,name,raza);
        HabArma = (int)(Math.random()*5 + 1);
        PoderMag = (int)(Math.random()*5 + 1);
        reg.AnyadirPersonaje(this);
    }
    
    public int getHabArma(){
        return HabArma;
    }
    
    public int getPoderMag(){
        return PoderMag;
    }
    
    @Override
    public int Atacar(){
        //Sumar bonus ofensivo + valor atributo arma + hbarma o podermag
        Recurso RecActivo = this.getRecursoActivo();
        int bonOfensivo = RecActivo.getBonusOfen();
        
        int AtrRec = 0;
        int HabExpl = 0;
        if (RecActivo instanceof Arma) {
            HabExpl = HabArma;
            Arma a = (Arma)(RecActivo);
            if ((a.getRango() == 0)){
                AtrRec = this.getFuerza();
            } else {
                AtrRec = this.getDestreza();
            }
        } else if (RecActivo instanceof Conjuro){
            HabExpl = PoderMag;
            AtrRec = this.getInteligencia();
        }
        
        int valorAtaque = bonOfensivo + AtrRec + HabExpl;
        int contador = 0;
        for (int i = 0; i < valorAtaque; i++){
            int valor = (int)(Math.random()*6 + 1);
            if (valor >= 5){
                ++contador;
            }
        }
        return contador;
    }
    
    @Override
    public int Defender(){
        //Poder defensivo + valor atributo asociado (igual que ataque)
        Recurso RecActivo = this.getRecursoActivo();
        int bonDefensivo = RecActivo.getBonusDefen();
        
        int AtrRec = 0;
        int HabExpl = 0;
        if (RecActivo instanceof Arma) {
            HabExpl = HabArma;
            Arma a = (Arma)(RecActivo);
            if (a.getRango() == 0){
                AtrRec = this.getFuerza();
            } else {
                AtrRec = this.getDestreza();
            }
        } else if (RecActivo instanceof Conjuro){
            HabExpl = PoderMag;
            AtrRec = this.getInteligencia();
        }
        
        int valorDefensa = bonDefensivo + AtrRec + HabExpl;
        int contador = 0;
        for (int i = 0; i < valorDefensa; i++){
            int valor = (int)(Math.random()*6 + 1);
            if (valor >= 5){
                ++contador;
            }
        }
        return contador;        
    }
    
    @Override 
    public int Astucia(){
        Recurso RecActivo = this.getRecursoActivo();
        int bonAstucia = RecActivo.getBonusAstu();
        
        int AtrRec = 0;
        int HabExpl = 0;
        if (RecActivo instanceof Arma) {
            HabExpl = HabArma;
            Arma a = (Arma)(RecActivo);
            if (a.getRango() == 0){
                AtrRec = this.getFuerza();
            } else {
                AtrRec = this.getDestreza();
            }
        } else if (RecActivo instanceof Conjuro){
            HabExpl = PoderMag;
            AtrRec = this.getInteligencia();
        }
        
        int valorAstucia = bonAstucia + AtrRec + HabExpl;
        int contador = 0;
        for (int i = 0; i < valorAstucia; i++){
            int valor = (int)(Math.random()*6 + 1);
            if (valor >= 5){
                ++contador;
            }
        }
        return contador; 
    }

   @Override
   public String toString() {
       return super.toString() + " " + "Poder mágico: " + PoderMag + " " + "Habilidad armas: " + HabArma;
   }
    
}
