/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;
import java.util.*;
import java.io.Serializable;
/**
 *
 * @author Alvaro
 */
public class Combate implements Serializable{
    private String Fecha;
    private int NumRondas;
    private ArrayList<Personaje> PersInvolucrados;
    private Personaje PersGanador;
    
    public Combate(Personaje pers1, Personaje pers2, int numRondas, String fecha, RegistroJuego reg){
        ArrayList<Personaje> a = new ArrayList<Personaje>();
        PersInvolucrados = a;
        PersInvolucrados.add(pers1);
        PersInvolucrados.add(pers2);
        if (pers1.getVitalidad()>pers2.getVitalidad()) {
            PersGanador = pers1;
        } else {
            PersGanador = pers2;
        }
        NumRondas = numRondas;
        Fecha = fecha;
        reg.AnyadirCombate(this);
    }
    
    public String getFecha(){
        return Fecha;
    }
    
    public int getNumRondas(){
        return NumRondas;
    }
    
    public ArrayList getPersInvolucrados(){
        ArrayList<Personaje> copia = new ArrayList<Personaje>();
        for (int i = 0; i < PersInvolucrados.size(); i++){
            Personaje p = PersInvolucrados.get(i);
            copia.add(p);
        }
        return copia;
    }
    
    public Personaje getGanador(){
        return PersGanador;
    }

    @Override
    public String toString() {
        return "Jugador 1: " + PersInvolucrados.get(0) + "\n" + "Jugador 2: " + PersInvolucrados.get(1) + "\n" + "Numero de Rondas: " + NumRondas + "\n" + "El ganador es: " + PersGanador + "\n" +"Fecha: " + Fecha;
    }
    
    
}
