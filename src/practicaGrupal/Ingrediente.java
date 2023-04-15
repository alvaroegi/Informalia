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
public class Ingrediente implements Serializable{
    private String Nombre;
    private double Cantidad;
    
    private ArrayList crearListaIngredientes(){
        ArrayList<String> a = new ArrayList<String>();
        a.add("Carne disecada");
        a.add("Cienpiés");
        a.add("Huesos de cráneos de animal");
        a.add("Sal");
        a.add("Aceite");
        a.add("Anca de rana");
        a.add("Lavanda");
        a.add("Pata de conejo");
        a.add("Pétalos de rosa");
        a.add("Cúrcuma");
        a.add("Canela");
        a.add("Plumas");
        a.add("Escamas");
        a.add("Aleta de tiburón");
        a.add("Dientes de tigre");
        a.add("Semillas de girasol");
        return a;
    }
    public Ingrediente(){
        ArrayList<String> a = crearListaIngredientes();
        int size = a.size();
        int b = (int)(Math.random()*size);
        Nombre = a.get(b);
        Cantidad = Math.random()*2;       
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public double getCantidad(){
        return Cantidad;
    }
}
