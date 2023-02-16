/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Joel Hernández Martín joelyx96@gmail.com
 * @author Ruben Gonzalez Sabina poybenglez@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;  
        do {
            System.out.println("Menu calculadora \n "
                    + "Que quiere hacer? \n"
                    + "1.- Sumar \n"
                    + "2.- Restar \n"
                    + "3.- Multiplicar \n"
                    + "0.- Salir \n");

            int opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    salir = true;
                    break;
            } 
            }
            while (salir == false);
        }
    
    
    }
