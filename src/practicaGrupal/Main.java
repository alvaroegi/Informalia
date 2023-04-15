/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaGrupal;

import java.util.*;
import java.util.regex.*;

/**
 *
 * @author raulf
 */
public class Main {
    public static void main(String[] args) {
         Scanner kbd = new Scanner(System.in);
         Scanner kbd2 = new Scanner(System.in);
         
        Pattern pat1 = Pattern.compile("[A-Z]{2}\\d");      //recurso
        Pattern pat2 = Pattern.compile("(\\d{2})([A-Z])");      //personajes
         
        RegistroJuego registro = new RegistroJuego();
        String sn=null;
        do {
            System.out.println("¿Quieres cargar los datos guardados?    s/n");
            sn = kbd2.nextLine().toLowerCase();
            if (sn.equals("s")) {                
                registro.CargarFichero();
            } else if (sn.equals("n")) {
                System.out.println("No se ha cargado ningun dato");
            } else {
                System.err.println("Introduce un valor correcto");
            }
        } while (!(sn.equals("s")|| sn.equals("n")));
        int sel1=0;
        try{
            do {
                System.out.println("----------------------------------------------------------");
                System.out.println("Selecciona la opcion que quieras realizar (introduce el numero)");
                System.out.println("    1) Personaje");
                System.out.println("    2) Recurso");
                System.out.println("    3) Combate");
                System.out.println("    4) Guardar");
                System.out.println("    5) Salir");
                System.out.println("----------------------------------------------------------");
                sel1 = kbd.nextInt();
                switch (sel1) {
                    case 1: System.out.println(" \t *******************************");
                            System.out.println(" \t     1) Crear Personaje");
                            System.out.println(" \t     2) Eliminar Personaje");
                            System.out.println(" \t     3) Modificar Personaje");
                            System.out.println(" \t     4) Asociar Recurso");
                            System.out.println(" \t     5) Devolver Recurso");
                            System.out.println(" \t     6) Mostrar Personajes Disponibles");
                            System.out.println(" \t     7) Volver");
                            System.out.println(" \t *******************************");
                            int sel2 = kbd.nextInt();
                            switch (sel2) {
                                case 1: System.out.println(" \t   \t  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                                        System.out.println(" \t   \t  ¿Que tipo de personaje quieres crear");
                                        System.out.println(" \t   \t      1) Guerrero");
                                        System.out.println(" \t   \t      2) Mago");
                                        System.out.println(" \t   \t      3) Explorador");
                                        System.out.println(" \t   \t      4) Volver");
                                        System.out.println(" \t   \t  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                                        int sel3 = kbd.nextInt();
                                        switch (sel3) {
                                            case 1: System.out.println("Introduce el nombre del personaje");
                                                    String name = kbd2.nextLine();
                                                    int raza = 0;
                                                    String r=null;
                                                    do {
                                                    System.out.println("Introduce la raza del personaje");
                                                    System.out.println("1) Humano");
                                                    System.out.println("2) Elfo");
                                                    System.out.println("3) Enano");
                                                    System.out.println("4) Orco");
                                                    raza = kbd.nextInt();
                                                    } while (raza<1 && raza>4);
                                                    switch (raza) {
                                                        case 1:
                                                            r="Humano";
                                                            break;
                                                        case 2:
                                                            r="Elfo";
                                                            break;
                                                        case 3:
                                                            r="Enano";
                                                            break;
                                                        case 4:
                                                            r="Orco";
                                                            break;
                                                        default: System.out.println("Valor introducido incorrecto");
                                                                 break;
                                                    }
                                                    if (raza>0 && raza<5) {
                                                        Guerrero g1 = new Guerrero(registro,name,r);
                                                        System.out.println("¡ GUERRERO creado con éxito !");
                                                    }
                                                    break;


                                            case 2: System.out.println("Introduce el nombre del personaje");
                                                    String name2 = kbd2.nextLine();
                                                    String r2=null;
                                                    do {
                                                    System.out.println("Introduce la raza del personaje");
                                                    System.out.println("1) Humano");
                                                    System.out.println("2) Elfo");
                                                    System.out.println("3) Enano");
                                                    System.out.println("4) Orco");
                                                    raza = kbd.nextInt();
                                                    } while (raza<1 && raza>4);
                                                    switch (raza) {
                                                        case 1:
                                                            r2="Humano";
                                                            break;
                                                        case 2:
                                                            r2="Elfo";
                                                            break;
                                                        case 3:
                                                            r2="Enano";
                                                            break;
                                                        case 4:
                                                            r2="Orco";
                                                            break;
                                                        default: System.err.println("Valon introducido incorrecto");
                                                            break;
                                                    }
                                                    if (raza>0 && raza<5) {
                                                        Mago m1 = new Mago(registro,name2,r2);
                                                        System.out.println("¡ MAGO creado con éxito !");
                                                    }
                                                    break;

                                            case 3: System.out.println("Introduce el nombre del personaje");
                                                    String name3 = kbd2.nextLine();
                                                    String r3=null;
                                                    do {
                                                    System.out.println("Introduce la raza del personaje");
                                                    System.out.println("1) Humano");
                                                    System.out.println("2) Elfo");
                                                    System.out.println("3) Enano");
                                                    System.out.println("4) Orco");
                                                    raza = kbd.nextInt();
                                                    } while (raza<1 && raza>4);
                                                    switch (raza) {
                                                        case 1:
                                                            r3="Humano";
                                                            break;
                                                        case 2:
                                                            r3="Elfo";
                                                            break;
                                                        case 3:
                                                            r3="Enano";
                                                            break;
                                                        case 4:
                                                            r3="Orco";
                                                            break;
                                                        default: System.err.println("Valor introducido incorrecto");
                                                            break;
                                                    }
                                                    if (raza>0 && raza<5) {
                                                        Explorador e1 = new Explorador(registro,name3,r3);
                                                        System.out.println("¡ EXPLORADOR creado con éxito !");
                                                    }
                                                    break;

                                            case 4: break;

                                            default: System.err.println("Valor introducido incorrecto");
                                                     break;
                                        } break;

                                case 2: registro.MostrarPersonajes();
                                        kbd.nextLine();
                                        ArrayList <Personaje> p = registro.getListaPersonajes();
                                        if (!(p.isEmpty())) {
                                            Matcher mat2=null;
                                            String id1 = null;
                                            do {
                                                System.out.println("Introduce el ID del personaje que quieras eliminar");
                                                id1 = kbd2.nextLine();
                                                mat2 = pat2.matcher(id1);
                                            } while (!(mat2.matches()));
                                            if (registro.ExistePersonaje(id1)) { 
                                                ArrayList<Personaje> array = registro.getListaPersonajes();
                                                int i=0;
                                                while (!array.get(i).getID().equals(id1) && i<array.size()) {         //busco el personaje con el mismo ID
                                                    i++;
                                                }
                                                registro.EliminarPersonaje(array.get(i));
                                                System.out.println("¡ ELIMINADO con éxito !");
                                            } else {
                                                System.out.println("No existe ese personaje");
                                            }
                                        } else {
                                            System.out.println("No existen personajes todavia");
                                        }
                                        break; 

                                case 3: ArrayList<Personaje> array1 = registro.getListaPersonajes();
                                        if (array1.isEmpty()) {
                                            System.err.println("Todavia no hay ningun personaje creado");
                                        } else {
                                            registro.MostrarPersonajes();
                                            Matcher mat2=null;
                                            String id1 = null;
                                            do {
                                                System.out.println("Introduce el ID del personaje que quieras modificar");
                                                id1 = kbd2.nextLine();
                                                mat2 = pat2.matcher(id1);
                                            } while (!(mat2.matches()));
                                            if (registro.ExistePersonaje(id1)) {
                                                int t=0;
                                                while (!array1.get(t).getID().equals(id1)) {         //busco el personaje con el mismo ID
                                                    t++;
                                                }
                                                System.out.println("Introduce el nuevo nombre del personaje");    
                                                String name = kbd2.nextLine();
                                                array1.get(t).setNuevoNombre(name);
                                                System.out.println("¡ MODIFICADO con éxito !");
                                            } else {
                                                System.out.println("No existe ese personaje");
                                            }
                                        }
                                        break;

                                case 4: ArrayList <Personaje> per = registro.getListaPersonajes();
                                        if (per.isEmpty()) {
                                            System.out.println("No hay personajes creados");
                                        } else {
                                            System.out.println("Selecciona el personaje al que quieres darle un recurso");
                                            registro.MostrarPersonajes();
                                            System.out.println("");
                                            Matcher mat2=null;
                                            String id1 = null;
                                            do {
                                                System.out.print("Introduce el ID del personaje: ");
                                                id1 = kbd2.nextLine();
                                                mat2 = pat2.matcher(id1);
                                            } while (!(mat2.matches()));
                                            if (registro.ExistePersonaje(id1)) {
                                                int k=0;
                                                while (!per.get(k).getID().equals(id1) && k<per.size()) {         //busco el personaje con el mismo ID
                                                    k++;
                                                }
                                                if (registro.ComprobarRecursosDisponibles(per.get(k))) {
                                                    per.get(k).adquirirRecurso(registro);
                                                    System.out.println("¡ ADQUIRIDO con éxito !");
                                                } else {
                                                    System.out.println("No existen recursos que este personaje pueda utilizar");
                                                }
                                            } else {
                                                System.out.println("No existe ese personaje");
                                            }
                                        } break;

                                case 5: ArrayList <Personaje> pers = registro.getListaPersonajes();
                                        if (!pers.isEmpty()) {
                                            System.out.println("Selecciona el personaje al que quieres quitarle un recurso");
                                            registro.MostrarPersonajes();
                                            Matcher mat2=null;
                                            String id1 = null;
                                            do {
                                                System.out.println("Introduce el ID del personaje");
                                                id1 = kbd2.nextLine();
                                                mat2 = pat2.matcher(id1);
                                            } while (!(mat2.matches()));
                                            if (registro.ExistePersonaje(id1)) {
                                                int k=0;
                                                while (!pers.get(k).getID().equals(id1) && k<pers.size()) {         
                                                    k++;
                                                }
                                                pers.get(k).devolverRecurso();
                                            } else {
                                                System.out.println("No existe ese personaje");
                                            }
                                        }
                                        break;

                                case 6: registro.MostrarPersonajes();
                                        break;

                                case 7: break;

                                default: System.err.println("Valor introducido incorrecto");
                            } break;


                    case 2: System.out.println(" \t *******************************");
                            System.out.println(" \t     1) Crear Recurso");
                            System.out.println(" \t     2) Eliminar Recurso");
                            System.out.println(" \t     3) Modificar Recurso");
                            System.out.println(" \t     4) Mostrar Recursos Disponibles");
                            System.out.println(" \t     5) Volver");
                            System.out.println(" \t *******************************");
                            int sel4 = kbd.nextInt();
                            switch (sel4) {
                                case 1: System.out.println(" \t   \t  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                                        System.out.println(" \t   \t  ¿Que tipo de recurso quieres crear");
                                        System.out.println(" \t   \t      1) Arma");
                                        System.out.println(" \t   \t      2) Hechizo");
                                        System.out.println(" \t   \t      3) Conjuro");
                                        System.out.println(" \t   \t      4) Volver");
                                        System.out.println(" \t   \t  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                                        int sel5 = kbd.nextInt();
                                        switch(sel5) {

                                            case 1: System.out.println("Introduce el nombre del recurso");
                                                    String name = kbd2.nextLine();
                                                    int sn2=0;
                                                    do {
                                                        System.out.println("¿Desea que sea de 1 o 2 manos?");
                                                        sn2 = kbd.nextInt();
                                                    } while (!(sn2==1|| sn2==2));
                                                    String sn3=null;
                                                    int rango=0;
                                                    do {
                                                        System.out.println("¿Es cuerpo a cuerpo?    s/n");
                                                        sn3 = kbd2.nextLine().toLowerCase();
                                                        if (sn3.equals("s")) {
                                                           rango=0;
                                                        } else if (sn3.equals("n")) {
                                                            rango=(int)(Math.random()*10+1);
                                                        } else {
                                                            System.out.println("Introduce un valor correcto");
                                                        }
                                                    } while (!(sn3.equals("s")|| sn3.equals("n")));
                                                    Arma a1 = new Arma(name,registro,rango,sn2);                                                
                                                    System.out.println("¡ ARMA creada con exito !");
                                                    break;

                                            case 2: System.out.println("Introdduce el nombre del recurso");
                                                    String name2 = kbd2.nextLine();
                                                    Hechizo h1 = new Hechizo(name2,registro);
                                                    System.out.println("¡ HECHIZO creado con exito !");
                                                    break;

                                            case 3: System.out.println("Introdduce el nombre del recurso");
                                                    String name3 = kbd2.nextLine();
                                                    Conjuro c1 = new Conjuro(name3,registro);
                                                    System.out.println("¡ CONJURO creado con exito !");
                                                    break;

                                            case 4: break;

                                            default: System.err.println("Valor introducido incorrecto");
                                                     break;

                                        } break;

                                case 2: registro.MostrarRecursos();     
                                        kbd.nextLine();
                                        ArrayList <Recurso> r = registro.getListaRecursos();
                                        if (!(r.isEmpty())) {
                                            Matcher mat1=null;
                                            String id1 = null;
                                            do {
                                                System.out.println("Introduce el ID del personaje que quieras eliminar");
                                                id1 = kbd2.nextLine();
                                                mat1 = pat1.matcher(id1);
                                            } while (!(mat1.matches()));
                                            if (registro.ExisteRecurso(id1)) {
                                                ArrayList<Recurso> array2 = registro.getListaRecursos();
                                                int i=0;
                                                while (!array2.get(i).getID().equals(id1)) {         //busco el personaje con el mismo ID
                                                    i++;
                                                }
                                                registro.EliminarRecurso(array2.get(i));
                                                System.out.println("¡ RECURSO eliminado con éxito !");
                                            } else {
                                                System.out.println("El recurso no existe");
                                            }
                                        }
                                        break;

                                case 3: ArrayList<Recurso> array3 = registro.getListaRecursos();
                                        if (array3.isEmpty()) {
                                            System.err.println("Todavia no hay ningun recurso creado");
                                        } else {
                                            registro.MostrarRecursos();
                                            kbd.nextLine();
                                            Matcher mat1=null;
                                            String id1 = null;
                                            do {
                                                System.out.println("Introduce el ID del personaje que quieras eliminar");
                                                id1 = kbd2.nextLine();
                                                mat1 = pat1.matcher(id1);
                                            } while (!(mat1.matches()));
                                            if (registro.ExisteRecurso(id1)) {
                                                int t=0;
                                                while (!array3.get(t).getID().equals(id1)) {         //busco el personaje con el mismo ID
                                                    t++;
                                                }
                                                System.out.println("Introduce el nuevo nombre del recurso");      
                                                String name = kbd.nextLine();
                                                array3.get(t).setNombre(name);
                                                System.out.println("¡ RECURSO modificado con exito !");
                                            } else {
                                                System.out.println("El recurso no existe");
                                            }
                                        }
                                        break;

                                case 4: registro.MostrarRecursos();
                                        break;

                                case 5: break;

                                default: System.err.println("Valor introducido incorrecto");

                            } break;

                    case 3: System.out.println("\t------------- \n"
                            + "\t1- Mostrar historial \n"
                            + "\t2- Combatir \n"
                            + "\t3- Volver\n"
                            + "\t------------- \n");
                            Scanner intk = new Scanner(System.in);
                            int op = 0;
                            do{
                                try{
                                   op = intk.nextInt(); 
                                } catch (Exception e){
                                    System.err.println("Error al introducir el número, vuelve a introducirlo");
                                }
                            } while (op >= 3 & op <= 0);

                            switch(op){
                                case 2: ArrayList <Personaje> p = registro.getListaPersonajes();
                                        if (p.isEmpty()) {
                                            System.out.println("No puedes combatir porque no hay personajes creados");
                                        } else {
                                            System.out.println("¿Como quieras que sea el combate:?");
                                            System.out.println("1) Manual");
                                            System.out.println("2) Maquina");
                                            int sel = kbd.nextInt();
                                            System.out.println("");
                                            switch(sel) {
                                                case 1: System.out.println("Selecciona los personajes que quieres que combatan");
                                                        registro.MostrarPersonajes();
                                                        Matcher mat2=null;
                                                        String id1 = null;
                                                        do {
                                                            System.out.println("Introduce el ID del personaje 1");
                                                            id1 = kbd2.nextLine();
                                                            mat2 = pat2.matcher(id1);
                                                        } while (!(mat2.matches()));
                                                        if (registro.ExistePersonaje(id1)) {
                                                            int i=0;
                                                            while (!p.get(i).getID().equals(id1)) {         
                                                                i++;
                                                            }
                                                            Matcher matc2=null;
                                                            String id2 = null;
                                                            do {
                                                                System.out.println("Introduce el ID del personaje 2");
                                                                id2 = kbd2.nextLine();
                                                                matc2 = pat2.matcher(id2);
                                                            } while (!(matc2.matches()));
                                                            if (registro.ExistePersonaje(id2)) {
                                                                int j=0;
                                                                while (!p.get(j).getID().equals(id2)) {         
                                                                    j++;
                                                                }
                                                                if (!p.get(i).getPuedeCombatir()) {
                                                                    System.out.println("El personaje 1 no puede combatir porque no tiene ningun recurso con el que poder hacerlo");
                                                                } else if (!p.get(j).getPuedeCombatir()) {
                                                                    System.out.println("El personaje 2 no puede combatir porque no tiene ningun recurso con el que poder hacerlo");
                                                                }
                                                                if (p.get(i).getPuedeCombatir() && p.get(j).getPuedeCombatir()) {
                                                                    if (p.get(i) instanceof Guerrero) {
                                                                        Guerrero g1 = (Guerrero) p.get(i);
                                                                        if (p.get(j) instanceof Guerrero) {
                                                                            Guerrero g2 = (Guerrero) p.get(j);
                                                                            Combate comb = g1.CombatePersona(g2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(j) instanceof Explorador) {
                                                                            Explorador e2 = (Explorador) p.get(j);
                                                                            Combate comb = g1.CombatePersona(e2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(j) instanceof Mago) {
                                                                            Mago m2 = (Mago) p.get(j);
                                                                            Combate comb = g1.CombatePersona(m2, registro);
                                                                            System.out.println(comb);
                                                                        }
                                                                    } else if (p.get(i) instanceof Explorador) {
                                                                        Explorador e1 = (Explorador) p.get(i);
                                                                        if (p.get(j) instanceof Guerrero) {
                                                                            Guerrero g2 = (Guerrero) p.get(j);
                                                                            Combate comb = e1.CombatePersona(g2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(j) instanceof Explorador) {
                                                                            Explorador e2 = (Explorador) p.get(j);
                                                                            Combate comb = e1.CombatePersona(e2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(j) instanceof Mago) {
                                                                            Mago m2 = (Mago) p.get(j);
                                                                            Combate comb = e1.CombatePersona(m2, registro);
                                                                            System.out.println(comb);
                                                                        }
                                                                    } else if (p.get(i) instanceof Mago) {
                                                                        Mago m1 = (Mago) p.get(i);
                                                                        if (p.get(j) instanceof Guerrero) {
                                                                            Guerrero g2 = (Guerrero) p.get(j);
                                                                            Combate comb = m1.CombatePersona(g2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(j) instanceof Explorador) {
                                                                            Explorador e2 = (Explorador) p.get(j);
                                                                            Combate comb = m1.CombatePersona(e2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(j) instanceof Mago) {
                                                                            Mago m2 = (Mago) p.get(j);
                                                                            Combate comb = m1.CombatePersona(m2, registro);
                                                                            System.out.println(comb);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("No EXISTE el personaje 2 con ese identificador");
                                                            }
                                                        } else {
                                                            System.out.println("No EXISTE el personaje 1 con ese identificador");
                                                        }
                                                        break;

                                                case 2: System.out.println("Selecciona el personaje con el que quieres combatir");
                                                        registro.MostrarPersonajesDisponibles();
                                                        Matcher mat3=null;
                                                        String id3 = null;
                                                        do {
                                                            System.out.println("Introduce el ID del personaje");
                                                            id3 = kbd2.nextLine();
                                                            mat3 = pat2.matcher(id3);
                                                        } while (!(mat3.matches()));
                                                        if (registro.ExistePersonaje(id3)) {
                                                            int i=0;
                                                            while (!p.get(i).getID().equals(id3)) {         
                                                                i++;
                                                            }
                                                            if (!p.get(i).getPuedeCombatir()) {
                                                                System.out.println("El personaje seleccionado no puede combatir porque no tiene ningun recurso con el que poder hacerlo");
                                                            } else {
                                                                int j=0;
                                                                int cont=0;
                                                                while (j<p.size()) {
                                                                    if ((p.get(j).getPuedeCombatir())) {
                                                                        cont++;
                                                                    }
                                                                    j++;
                                                                }
                                                                if (cont>=2) {
                                                                    int ran;
                                                                    do{
                                                                        ran = (int)(Math.random()*p.size());
                                                                    } while (!p.get(ran).getPuedeCombatir() || p.get(ran).getID().equals(p.get(i).getID()));
                                                                    System.out.println(p.get(ran));
                                                                    if (p.get(i) instanceof Guerrero) {
                                                                        Guerrero g1 = (Guerrero) p.get(i);
                                                                        if (p.get(ran) instanceof Guerrero) {
                                                                            Guerrero g2 = (Guerrero) p.get(ran);
                                                                            Combate comb = g1.CombateMaquina(g2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(ran) instanceof Explorador) {
                                                                            Explorador e2 = (Explorador) p.get(ran);
                                                                            Combate comb = g1.CombateMaquina(e2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(ran) instanceof Mago) {
                                                                            Mago m2 = (Mago) p.get(ran);
                                                                            Combate comb = g1.CombateMaquina(m2, registro);
                                                                            System.out.println(comb);
                                                                        }
                                                                    } else if (p.get(i) instanceof Explorador) {
                                                                        Explorador e1 = (Explorador) p.get(i);
                                                                        if (p.get(ran) instanceof Guerrero) {
                                                                            Guerrero g2 = (Guerrero) p.get(ran);
                                                                            Combate comb = e1.CombateMaquina(g2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(ran) instanceof Explorador) {
                                                                            Explorador e2 = (Explorador) p.get(ran);
                                                                            Combate comb = e1.CombateMaquina(e2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(ran) instanceof Mago) {
                                                                            Mago m2 = (Mago) p.get(ran);
                                                                            Combate comb = e1.CombateMaquina(m2, registro);
                                                                            System.out.println(comb);
                                                                        }
                                                                    } else if (p.get(i) instanceof Mago) {
                                                                        Mago m1 = (Mago) p.get(i);
                                                                        if (p.get(ran) instanceof Guerrero) {
                                                                            Guerrero g2 = (Guerrero) p.get(ran);
                                                                            Combate comb = m1.CombateMaquina(g2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(ran) instanceof Explorador) {
                                                                            Explorador e2 = (Explorador) p.get(ran);
                                                                            Combate comb = m1.CombateMaquina(e2, registro);
                                                                            System.out.println(comb);
                                                                        } else if (p.get(ran) instanceof Mago) {
                                                                            Mago m2 = (Mago) p.get(ran);
                                                                            Combate comb = m1.CombateMaquina(m2, registro);
                                                                            System.out.println(comb);
                                                                        }
                                                                    }
                                                                } else {
                                                                    System.out.println("No hay otro personaje que pueda combatir");
                                                                }
                                                            }
                                                        } else {
                                                            System.out.println("El personaje seleccionado no Existe");
                                                        }
                                                        break;

                                                default: System.out.println("El valor introducido es incorrecto"); break;
                                            }
                                        }
                                        break;

                                case 1: 
                                    registro.MostrarCombates();
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.err.println("Valor introducido incorrecto");

                            } break;
                    case 4: registro.GuardarFichero();
                            break;

                    case 5: break;
                }
            } while (sel1>0 && sel1<5);
        }catch (Exception e) {
                System.err.println("Valor introducido incorrecto");
        }
        if (sel1==5) {
            System.out.println("¡ Hasta la proxima !");
        } else if (sel1<1 || sel1>5) {
            System.err.println("Valon introducido incorrecto");
        }
    }
    
}
