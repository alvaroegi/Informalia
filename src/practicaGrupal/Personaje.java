/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;

import java.io.Serializable;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author raulf
 */
public abstract class Personaje implements Serializable {
    
    
    private String nombre;
    private String raza;
    private int fuerza;
    private int destreza;
    private int inteligencia;
    private int vitalidad;
    private String ID;
    private Recurso recursoActivo;
    private Recurso[] listaRecursos;
    private boolean puedeCombatir;
    
    
    public Personaje(RegistroJuego reg,String name,String raza2) {
        nombre = name;
        raza = raza2;
        fuerza = (int)(Math.random()*4+1);
        destreza = (int)(Math.random()*4+1);
        inteligencia = (int)(Math.random()*4+1);
        vitalidad = 10; 
        listaRecursos = new Recurso[3];
        ArrayList <Personaje> rec= reg.getListaPersonajes();
        if(rec.isEmpty()){
            ID="00A";
        }else{
            String id1 = rec.get(rec.size()-1).getID();
            ID=aumentarID(id1);
        }
    }
    
    public Personaje(Personaje otro) {
        otro.nombre = this.nombre;
        otro.raza = this.raza;
        otro.fuerza = this.fuerza;
        otro.destreza = this.destreza;
        otro.inteligencia = this.inteligencia;
        otro.vitalidad = this.vitalidad;
        otro.ID = this.ID;
        otro.recursoActivo = this.recursoActivo;
        for(int i=0; i<3; i++) {
            Recurso copia = new Recurso(listaRecursos[i]);
            this.listaRecursos[i]=copia;
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getRaza() {
        return raza;
    }
    
    public int getFuerza() {
        return fuerza;
    }
    
    public int getDestreza() {
        return destreza;
    }
    
    public int getInteligencia() {
        return inteligencia;
    }
    
    public int getVitalidad() {
        return vitalidad;
    }
    
    public String getID() {
        return ID;
    }
    
    public Recurso getRecursoActivo(){
        return recursoActivo;
    }
    
    public Recurso[] getListaRecursos() {
        return listaRecursos;
    }
    
    public boolean getPuedeCombatir() {
        return puedeCombatir;
    }
    
    public void setNuevoNombre(String nuevo_nombre) {
        nombre = nuevo_nombre;
    }
    
    public void setVitalidad(int nueva_vital) {
        vitalidad = nueva_vital;
    }
    
    public void setRecursoActivo(Recurso nuevo_RecAct) {
        recursoActivo = nuevo_RecAct;
    }
    
    public void setPuedeCombatir(boolean puede) {
        puedeCombatir = puede;
    }
    
    public void adquirirRecurso (RegistroJuego reg) {
        if (reg.ComprobarRecursosDisponibles(this)) {
            if (this.getListaRecursos()[2]==null) {  
                Scanner sc = new Scanner(System.in);
                reg.MostrarRecursosDisponibles(this);
                ArrayList <Recurso> r = reg.getListaRecursos();
                int i = 0;
                boolean valido=false;
                do {
                    System.out.print("Introduzca el ID: ");
                    String id = sc.nextLine();
                    while (!r.get(i).getID().equals(id) && i<r.size()) {
                        i++;
                    }
                    if (i<r.size()) {
                        valido = true;
                    }
                } while (valido==false);
                int j=0;
                while(this.getListaRecursos()[j]!=null) {  
                    j++;
                }
                this.getListaRecursos()[j]=r.get(i);
                r.get(i).setEnUso(true);  
                if(this.getListaRecursos()[0]!=null){ 
                    this.setPuedeCombatir(true);
                }
            }
            else {
                System.err.println("El personaje tiene el máximo de recursos");
            }
        }
    }

    public void devolverRecurso() {
        if (listaRecursos[0]!=null){
            Scanner kbd = new Scanner(System.in);
            System.out.println("Que recurso quieres devolver");
            for (int i=1; i<listaRecursos.length+1; i++) {
                if (listaRecursos[i-1]!=null) {
                    System.out.print(i + ".- ");
                    System.out.println(listaRecursos[i-1]);
                }
            }
            int num = kbd.nextInt();
            switch (num) {
                case 1:     listaRecursos[0].setEnUso(false);
                            listaRecursos[0]=listaRecursos[1];              
                            listaRecursos[1]=listaRecursos[2];
                            listaRecursos[2]=null;
                            break;        
                case 2:     listaRecursos[1].setEnUso(false);
                            listaRecursos[1]=listaRecursos[2];
                            listaRecursos[2]=null;
                            break;
                case 3:     listaRecursos[2].setEnUso(false);
                            listaRecursos[2]=null;
                            break;
                default: System.err.println("Numero incorrecto");
            }
            if(listaRecursos[0]==null) {
                puedeCombatir=false;
            }
        } else {
            System.out.println("El personaje no tiene recursos asociados");
        }
    }
    
    public abstract int Atacar();

    public abstract int Defender();
    
    public abstract int Astucia();
        
    public Combate CombatePersona(Personaje jugador, RegistroJuego reg) {
        int contador = 0;
        int iniciativa = 1;
        int valorAtaque, valorDefensa;
        do {
            switch (iniciativa) {
                case 1: this.RecursoActivoPersona();
                        valorAtaque=this.Atacar();
                        jugador.RecursoActivoPersona();
                        valorDefensa=jugador.Defender();
                        if(valorAtaque>valorDefensa) {
                            jugador.setVitalidad(jugador.getVitalidad()-1);
                            System.out.println("EL JUGADOR 2 PIERDE VIDA, vida " +jugador.getVitalidad());  
                        }
                        else {
                            System.out.println("Ataque fallido");
                        }                                             
                        contador++;
                        break;
                case 2: jugador.RecursoActivoPersona();
                        valorAtaque=jugador.Atacar();
                        this.RecursoActivoPersona();
                        valorDefensa=this.Defender();
                        if(valorAtaque>valorDefensa) {
                            this.setVitalidad(this.getVitalidad()-1);
                            System.out.println("EL JUGADOR 1 PIERDE VIDA, vida " +this.getVitalidad());  
                        }
                        else {
                            System.out.println("Ataque fallido");
                        }                                             
                        contador++;
                        break;
            }
            if (this.vitalidad>0 && jugador.getVitalidad()>0) {
                int p1 = this.Astucia();
                int p2 = jugador.Astucia();
                if (p1>=p2) {
                    if (p1>p2) {
                        iniciativa = 1;
                        jugador.setVitalidad(jugador.getVitalidad()-1);
                        System.out.println("EL JUGADOR 2 PIERDE VIDA, vida " +jugador.getVitalidad());
                        System.out.println();
                    }
                    else {
                        System.out.println("Empatan iniciativa");
                        System.out.println();
                    }
                } else {
                    iniciativa = 2;
                    this.setVitalidad(this.getVitalidad()-1);
                    System.out.println("EL JUGADOR 1 PIERDE VIDA, vida = "+this.getVitalidad());
                    System.out.println();
                }
            }
        } while(this.vitalidad>0 && jugador.getVitalidad()>0);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String date = dtf.format(LocalDateTime.now());
        Combate comb = new Combate(this,jugador,contador,date,reg);
        this.setVitalidad(10);
        jugador.setVitalidad(10);
        return comb;
    }
    
    public Combate CombateMaquina(Personaje jugador, RegistroJuego reg) {
        int contador = 0;
        int iniciativa = 1;
        int valorAtaque, valorDefensa;
        do {
            switch (iniciativa) {
                case 1: System.out.println("Los recursos de la maquina disponibles son: ");
                        jugador.MostrarListaRecursos();
                        jugador.RecursoActivoMaquina();
                        this.RecursoActivoPersona();
                        valorAtaque=this.Atacar();
                        
                        System.out.println();
                        valorDefensa=jugador.Defender();
                        if(valorAtaque>valorDefensa) {
                            jugador.setVitalidad(jugador.getVitalidad()-1);
                            System.out.println("EL JUGADOR 2 PIERDE VIDA, vida = "+jugador.getVitalidad());  
                        }
                        else {
                            System.out.println("Ataque fallido");
                        }                                             
                        contador++;
                        break;
                case 2: 
                        System.out.println("Los recursos de la maquina disponibles son: ");
                        jugador.MostrarListaRecursos();
                        jugador.RecursoActivoMaquina();
                        valorAtaque=jugador.Atacar();
                        this.RecursoActivoPersona();
                        
                        System.out.println();
                        valorDefensa=this.Defender();
                        if(valorAtaque>valorDefensa) {
                            this.setVitalidad(this.getVitalidad()-1);
                            System.out.println("EL JUGADOR 1 PIERDE VIDA, vida = "+this.getVitalidad());  
                        }
                        else {
                            System.out.println("Ataque fallido");
                        }                                             
                        contador++;
                        break;
            }
            if (this.vitalidad>0 && jugador.getVitalidad()>0) {
                int p1 = this.Astucia();
                int p2 = jugador.Astucia();
                if (p1>=p2) {
                    if (p1>p2) {
                        iniciativa = 1;
                        jugador.setVitalidad(jugador.getVitalidad()-1);
                        System.out.println("EL JUGADOR 2 PIERDE VIDA, vida = "+jugador.getVitalidad()); 
                        System.out.println();
                    }
                    else {
                        System.out.println("Empatan iniciativa");
                        System.out.println();
                    }
                } else {
                    iniciativa = 2;
                    this.setVitalidad(this.getVitalidad()-1);
                    System.out.println("EL JUGADOR 1 PIERDE VIDA, vida = "+this.getVitalidad());
                    System.out.println();
                }
            }
        } while(this.vitalidad>0 && jugador.getVitalidad()>0);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String date = dtf.format(LocalDateTime.now());
        Combate comb = new Combate(this,jugador,contador,date,reg);
        this.setVitalidad(10);
        jugador.setVitalidad(10);
        return comb;
    }
    
    public void RecursoActivoPersona() {
        Scanner kbd = new Scanner(System.in);
        int sel=0;
        do {
            System.out.println("Los recursos disponibles son: ");
            MostrarListaRecursos();
            System.out.println();
            System.out.println("Elige el recurso que quieras como activo (el número, no el ID)");
            sel = kbd.nextInt();
            switch (sel) {
                case 1: setRecursoActivo(listaRecursos[0]); break;
                case 2: setRecursoActivo(listaRecursos[1]); break;
                case 3: setRecursoActivo(listaRecursos[2]); break;
                default: System.out.println("Valor incorrecto"); break;
            }
        } while (sel>4 || sel<1);
        System.out.println("");
    }
    
    public void RecursoActivoMaquina() {

        if (listaRecursos[1]==null) {
            recursoActivo = listaRecursos[0];
        } else {
            if  (listaRecursos[2]==null) {
                int sel = (int)(Math.random()*2);
                recursoActivo=listaRecursos[sel];
            } else {
                int sel2 = (int)(Math.random()*3);
                recursoActivo=listaRecursos[sel2];
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\t " + "ID: " + ID;
    }  
    
    private String aumentarID(String id){   
        char idC[] = id.toCharArray();
        if(idC[2]=='Z'){
            if(idC[1]=='9'){
                int i = (int)(id.charAt(0));
                i++;
                idC[0]=(char)i;
                idC[1]='0';
                idC[2]='A';
            }
            else{
                int j = (int)(id.charAt(1));
                j++;
                idC[1]= (char)j;
                idC[2]='A';
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
    
    private void MostrarListaRecursos() {
        for (int i = 0; i < 3; i++) {
            if (listaRecursos[i] != null) {
                int j = i+1;
                System.out.println(j+"- "+listaRecursos[i].toString());
            }
            
        }
            
    }
}
