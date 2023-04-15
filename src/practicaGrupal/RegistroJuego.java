/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author alemg
 */
public class RegistroJuego {
    private ArrayList <Personaje> listaPersonajes;
    private ArrayList <Recurso> listaRecursos;
    private ArrayList <Combate> listaCombate;
    
    public RegistroJuego() {
        listaPersonajes = new ArrayList <Personaje>();
        listaRecursos = new ArrayList <Recurso>();
        listaCombate = new ArrayList <Combate>();
    }
    
    public void AnyadirPersonaje(Personaje nuevo) {
        listaPersonajes.add(nuevo);
    }
    
    public void AnyadirRecurso(Recurso nuevo) {
        listaRecursos.add(nuevo);
    }
    
    public void AnyadirCombate(Combate nuevo) {
        listaCombate.add(nuevo);
    }
    
    public void MostrarPersonajes() {
        int i=1;
        for (Personaje pers: listaPersonajes){
            System.out.println(i + "- " + pers.toString());
            i++;
            System.out.println();
        }
    }
    
    public void MostrarPersonajesDisponibles() {
        int i=1;
        for (Personaje pers: listaPersonajes){
            if(pers.getPuedeCombatir())
                System.out.println(i + "- " + pers.toString());
            i++;
        }
    }
    
    public void MostrarRecursos() {
        for (Recurso rec: listaRecursos){
            System.out.println(rec.toString());
            System.out.println();

        }
    }
    
    public void MostrarRecursosDisponibles(Personaje pers) {
        if (pers instanceof Mago) {
            for (Recurso rec: listaRecursos){
                if ((rec instanceof Hechizo)&&(!rec.getEnUso())) {
                    System.out.println(rec.toString());
                }
            }
        }
            if (pers instanceof Guerrero) {
            for (Recurso rec: listaRecursos){
                if ((rec instanceof Arma)&&(!rec.getEnUso())) {
                    System.out.println(rec.toString());
                }
            }
        }
            if (pers instanceof Explorador) {
            for (Recurso rec: listaRecursos){
                if ((rec instanceof Conjuro)&&(!rec.getEnUso())) {
                    System.out.println(rec.toString());
                }
                if ((rec instanceof Arma)&&(((Arma)rec).getManejo()==1)&&(!rec.getEnUso())) {
                    System.out.println(rec.toString());
                }
            }
        }
    }
    
    public boolean ComprobarRecursosDisponibles(Personaje pers) {
        int i=0;
        if (pers instanceof Mago) {
            for (Recurso rec: listaRecursos){
                if ((rec instanceof Hechizo)&&(!rec.getEnUso())) {
                    i++;
                }
            }
        }
            if (pers instanceof Guerrero) {
            for (Recurso rec: listaRecursos){
                if ((rec instanceof Arma)&&(!rec.getEnUso())) {
                    i++;
                }
            }
        }
            if (pers instanceof Explorador) {
            for (Recurso rec: listaRecursos){
                if ((rec instanceof Conjuro)&&(!rec.getEnUso())) {
                    i++;
                }
                if ((rec instanceof Arma)&&(((Arma)rec).getManejo()==1)&&(!rec.getEnUso())) {
                    i++;
                }
            }
        }
        return (i>0);
    }
    
    public void MostrarCombates() {
        for (Combate comb: listaCombate){
            System.out.println(comb.toString());
            System.out.println();
        }
    }
    
    public ArrayList<Personaje> getListaPersonajes() {
        return listaPersonajes;
    }
    
    public ArrayList<Recurso> getListaRecursos() {
        return listaRecursos;
    }
    
    public ArrayList<Combate> getListaCombate() {
        return listaCombate;
    }
    
    public void EliminarPersonaje(Personaje pers) {
        for(int i=0; i<3; i++) {
            if(pers.getListaRecursos()[i]!=null) {
                pers.getListaRecursos()[i].setEnUso(false);
            }
        }
        listaPersonajes.remove(pers);
    }
    
    public void EliminarRecurso(Recurso rec) {
        listaRecursos.remove(rec);
    }
    
    public void GuardarFichero() {
        JFileChooser fc = new JFileChooser();
        File directorio = new File (fc.getCurrentDirectory(), "Informalia"); //CREA UNA CARPETA INFORMALIA EN LA CARPETA DOCUMENTOS DEL PC
        directorio.mkdir();
        File f = new File(directorio, "informalia.dat");
        try {
            if(f.exists()) {
                System.out.println("Ya hay datos guardados, ¿quieres sobrescribirlos?");
                Scanner kbd = new Scanner(System.in);
                String opcion = (kbd.nextLine()).toLowerCase();
                if(opcion.equals("si")) {
                    f.delete();
                    f.createNewFile();
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream escribir = new ObjectOutputStream(fos);
                    int i = 0;
                    while(i<listaPersonajes.size()) {
                        escribir.writeObject(listaPersonajes.get(i));
                        i++;
                    }
                    i = 0;
                    while(i<listaRecursos.size()) {
                        escribir.writeObject(listaRecursos.get(i));
                        i++;
                    }
                    i = 0;
                    while(i<listaCombate.size()) {
                        escribir.writeObject(listaCombate.get(i));
                        i++;
                    }
                    fos.close();
                    escribir.close();
                    System.out.println("Datos guardados con exitos");
                }
            }
            else {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream escribir = new ObjectOutputStream(fos);
                int i = 0;
                while(i<listaPersonajes.size()) {
                    escribir.writeObject(listaPersonajes.get(i));
                    i++;
                }
                i = 0;
                while(i<listaRecursos.size()) {
                    escribir.writeObject(listaRecursos.get(i));
                    i++;
                }
                i = 0;
                while(i<listaCombate.size()) {
                    escribir.writeObject(listaCombate.get(i));
                    i++;
                }
                fos.close();
                escribir.close();
                System.out.println("Datos guardados con exitos");
            }
        }
        catch (Exception e) {
            System.err.println("Error al guardar los datos");
        }
    }
    public void CargarFichero(){
        JFileChooser fc = new JFileChooser();
        File directorio = new File (fc.getCurrentDirectory(), "Informalia"); //CREA UNA CARPETA INFORMALIA EN LA CARPETA DOCUMENTOS DEL PC
        directorio.mkdir();
        File f = new File(directorio, "informalia.dat");
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object aux = ois.readObject();
            while (aux != null){
                if (aux instanceof Personaje) {
                    listaPersonajes.add((Personaje)aux);
                } else if (aux instanceof Recurso){
                    listaRecursos.add((Recurso)aux);
                } else if (aux instanceof Combate){
                    listaCombate.add((Combate)aux);
                }
                aux = ois.readObject();
                
            }
            ois.close();
            System.out.println("Los archivos se han cargado con éxito");
        } catch (EOFException e){
        } catch (java.io.FileNotFoundException e) {
            System.err.println("El archivo no existe");
        } catch (Exception e){
            System.err.println("Error al cargar los archivos");
        }
    }
    
    public Personaje buscarPersonaje(String id) {
        Personaje pers2 = null;
        for(Personaje pers: listaPersonajes) {
            if(id.equals(pers.getID())) {
                pers2 = pers;
            }
        }
        return pers2;
    }
    
    public Recurso buscarRecurso(String id) {
        Recurso rec2 = null;
        for(Recurso rec: listaRecursos) {
            if(id.equals(rec.getID())) {
                rec2 = rec;
            }
        }
        return rec2;
    }
    
    public boolean ExistePersonaje(String id) {
        int i =0;
        while ( i<listaPersonajes.size() && !(listaPersonajes.get(i).getID().equals(id))) {
            i++;
        }
        if (i<listaPersonajes.size()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean ExisteRecurso(String id) {
        int i =0;
        while ( i<listaRecursos.size() && !(listaRecursos.get(i).getID().equals(id))) {
            i++;
        }
        if (i<listaRecursos.size()) {
            return true;
        } else {
            return false;
        }
    }
}