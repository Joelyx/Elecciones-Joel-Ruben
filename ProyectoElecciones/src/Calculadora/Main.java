package Calculadora;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Joel Hernández Martín joelyx96@gmail.com
 * @author Ruben Gonzalez Sabina poybenglez@gmail.com
 */
public class Main {

    public static Caculadora calculadora = new Caculadora();
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;  
        do {
            System.out.println("Menu calculadora \n "
                    + "Que quiere hacer? \n"
                    + "1.- Sumar \n"
                    + "2.- Restar \n"
                    + "3.- Multiplicar \n"
                    + "4.- Dividir \n"
                    + "0.- Salir \n");

            int opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Escribe la suma que quieras hacer: Ejemplo '2 3 +'");
                    String suma = sc.nextLine();
                    calculadora.calcular(suma);
                    break;
                case 2:
                    System.out.println("Escribe la resta que quieras hacer: Ejemplo '7 2 -'");
                    String resta = sc.nextLine();
                    calculadora.calcular(resta);
                    break;
                case 3:
                    System.out.println("Escribe la multiplicacion que quieras hacer: Ejemplo '4 3.2 *'");
                    String multi = sc.nextLine();
                    calculadora.calcular(multi);
                    break;
                case 4:
                    System.out.println("Escribe la division que quieras hacer: Ejemplo '6 3 /'");
                    String divi = sc.nextLine();
                    calculadora.calcular(divi);
                    break;
                case 0:
                    salir = true;
                    break;
            } 
            }
            while (salir == false);
        String operacion = "4 3.2 * 8 -";
        Caculadora  calculadora = new Caculadora();
        System.out.println(calculadora.calcular(operacion));
        
        
        }
    
    
    }
