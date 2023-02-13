/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoelecciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joel Hernández Martín joelyx96@gmail.com
 */
public class Main {

    private static ArrayList<Elecciones> listaElecciones = new ArrayList<Elecciones>();

    public static void añadirPartido() {
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        
        do {
            System.out.println("¿En que eleccion quieres añadir el partido?");
        for (int i = 0; i < listaElecciones.size(); i++) {
            System.out.println(i + 1 + ".- " + listaElecciones.get(i));
        }
        System.out.println("0.- Salir");
            int opcionEleccion = sc.nextInt();sc.nextLine();
            if (opcionEleccion == 0) {
                salir = true;
            } else {
                Elecciones eleccionSeleccionada = listaElecciones.get(opcionEleccion - 1);
                System.out.println("¿Cual es el nombre del partido?");
                String nombre = sc.nextLine();
                System.out.println("¿Cuantos votos tiene el partido?");
                int votos = sc.nextInt();sc.nextLine();
                System.out.println("¿Cual es el nombre del presidente?");
                String presidente = sc.nextLine();
                eleccionSeleccionada.addPartido(nombre, votos, presidente);
                salir = true;
            }
        }while (salir == false);

        }  

    public static void crearElecciones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos diputados va a tener:");
        int diputados = sc.nextInt();sc.nextLine();
        Date fecha = new Date();
        Elecciones nuevasElecciones = new Elecciones(diputados, fecha);
        listaElecciones.add(nuevasElecciones);
    }

    public static void listarElecciones() {
        for (int i = 0; i < listaElecciones.size(); i++) {
            System.out.println(i + 1 + ".- " + listaElecciones.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        boolean salir = false;

        do {
            System.out.println("Menu elecciones  \n"
                + "¿Que quieres hacer?  \n"
                + "1. Ver elecciones. \n"
                + "2. Crear elecciones. \n"
                + "3. Añadir partido. \n"
                + "4. Ver estadisticas \n"
                + "5. Salir");
        int opcion = sc.nextInt();sc.nextLine();
            switch (opcion) {
                case 1:
                    if (listaElecciones.isEmpty()) {
                        System.out.println("Aun no hay elecciones creadas.");
                    } else {
                        listarElecciones();
                    }
                    break;
                case 2:
                    crearElecciones();
                    break;
                case 3:
                    añadirPartido();
                    break;
                case 4:
                    break;
                case 5:
                    salir = true;
                    break;
            }
        } while (salir == false);

    }
}
