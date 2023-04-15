/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author Alvaro
 */
public class Conjuro extends Recurso implements Serializable{
    private Ingrediente[] listaIngredientes;
    
    public Conjuro(String nombre, RegistroJuego reg){
        super(nombre,reg);
        Ingrediente[] a = new Ingrediente[4];
        a[0]=new Ingrediente();
        a[1]=new Ingrediente();
        a[2]=new Ingrediente();
        a[3]=new Ingrediente();
        listaIngredientes=a;
        reg.AnyadirRecurso(this);
    }

    public Conjuro(Conjuro otro) {
        super(otro);
        listaIngredientes=otro.listaIngredientes;
    }
    
    
    
    
    public Ingrediente[] getListaIngredientes(){
        return listaIngredientes;
    }
    
}