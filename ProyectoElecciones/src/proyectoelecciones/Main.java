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

    public void addPartido(String nombre, int votos, String presidente){
        Partido partido = new Partido(nombre, votos, presidente);
        partidos.add(partido);
    }
    
    public static void crearElecciones(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos diputados va a tener:");
                    int diputados = sc.nextInt();sc.nextLine();
                    Date fecha = new Date();
                    pulir fecha
                    
                    Elecciones nuevasElecciones = new Elecciones(diputados,fecha);
                    listaElecciones.add(nuevasElecciones);
    }
    
    private static ArrayList<Elecciones> listaElecciones = new ArrayList<Elecciones>();

    public static void listarElecciones() {
        for (int i = 0; i < listaElecciones.size(); i++) {
            System.out.println(i + 1 + ".- " + listaElecciones.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu elecciones  \n"
                + "¿Que quieres hacer?  \n"
                + "1. Ver elecciones. \n"
                + "2. Crear elecciones. \n"
                + "3. Ver estadisticas \n"
                + "4. Añadir partido "
                + "5. Salir");
        int opcion = sc.nextInt();
        boolean salir = false;

        do {
            switch (opcion) {
                case 1:
                    if(listaElecciones.isEmpty()){
                        System.out.println("Aun no hay elecciones creadas.");
                    }else{
                        listarElecciones();
                    }
                    break;
                case 2:
                    crearElecciones();
                    break;
                case 3:
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
