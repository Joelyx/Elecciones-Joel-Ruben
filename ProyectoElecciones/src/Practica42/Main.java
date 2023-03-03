/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica42;

import prueba.*;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Joel Hernández Martín joelyx96@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Persona> lista = new ArrayList<Persona>();
        lista.add(new Hombre("juan", "Pérez", "Gómez", 31, 192, 64.0));
        lista.add(new Mujer("ruben", "Rodríguez", "Díaz", 72, 183, 61.0));
        lista.add(new Mujer("ruben", "Fernández", "Navarro", 40, 162, 42.0));
        lista.add(new Hombre("ruben", "Rodríguez", "Rodríguez", 40, 158, 71.0));
        lista.add(new Mujer("Alvaro", "Díaz", "Pérez", 86, 169, 56.0));
        lista.add(new Hombre("gonzalo", "Pérez", "Pérez", 38, 174, 89.0));
        lista.add(new Hombre("pedro", "Álvarez", "López", 89, 173, 42.0));
        lista.add(new Mujer("angel", "López", "Romero", 48, 194, 77.0));
        lista.add(new Hombre("ruben", "Martín", "Romero", 69, 165, 60.0));
        lista.add(new Hombre("patricia", "García", "Gutiérrez", 85, 167, 53.0));
        lista.add(new Mujer("pepe", "Torres", "Álvarez", 55, 175, 98.0));

        
        lista.stream()
                .filter(p -> p.edad== 27)
                .findFirst()
                .ifPresent(p->System.out.println(p));
        
        
        
        
        ArrayList<Persona> personas = generador(40);

        System.out.println(personas);
        personas.stream()
                .filter(p->p.edad>=67)
                .map(p-> p.nombre+" "+p.apellido1+" "+p.edad)
                .forEach(texto-> System.out.println(texto));
    }
    
    public static ArrayList<Persona> generador(int size){
        ArrayList<Persona> arrayList = new ArrayList<Persona>();
        String nombres[]={"Alvaro","pedro","juan","pepe","ruben","gonzalo","angel","patricia"};
        String apellidos[]={"González", "Rodríguez", "García", "Martínez", "Hernández", "López", "Pérez", "Sánchez", "Fernández", "Gómez", "Díaz", "Torres", "Martín", "Jiménez", "Moreno", "Álvarez", "Romero", "Ruiz", "Navarro", "Gutiérrez"};
        for (int i = 0; i < size; i++) {
            
            String nombre = nombres[(int)(Math.random()*nombres.length)];
            String apellido1 = apellidos[(int)(Math.random()*apellidos.length)];
            String apellido2 = apellidos[(int)(Math.random()*apellidos.length)];
            int edad = (int)(Math.random()*82)+12;
            int altura= (int)(Math.random()*50)+150;
            int peso = (int)(Math.random()*60)+40;
            if(Math.random() >=0.5){
                arrayList.add(new Hombre(nombre,apellido1,apellido2,edad,altura,peso));
            }else{
                arrayList.add(new Mujer(nombre,apellido1,apellido2,edad,altura,peso));
            }
            
        }
        return arrayList;
    }
}
