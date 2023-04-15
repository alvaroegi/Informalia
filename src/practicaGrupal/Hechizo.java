/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;

import java.io.Serializable;

/**
 *
 * @author David_2
 */
public class Hechizo extends Recurso implements Serializable{
    private String Naturaleza;
    
    public Hechizo(String nombre, RegistroJuego reg){
        super(nombre,reg);
        String[] naturalezas={"Fuego","Hielo","Potencia","Viento","Tierra"};
        int rand=((int)Math.random()*5);
        Naturaleza=naturalezas[rand];
        reg.AnyadirRecurso(this);
    }

    public Hechizo(Hechizo otro){
        super(otro);
        this.Naturaleza=otro.Naturaleza;
    }

    public String getNaturaleza() {
        return Naturaleza;
    }
}
