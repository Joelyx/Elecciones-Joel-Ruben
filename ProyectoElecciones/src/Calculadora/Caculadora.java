/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Joel Hernández Martín joelyx96@gmail.com
 */
public class Caculadora {
    Stack<String> pila = new Stack();
    ArrayList<Double> historico;

    public Caculadora() {
        ArrayList<Integer> historico = new ArrayList();
    }
    
    public double calcular(String operacion){
        String[] strings = operacion.split(" ");
        for (int i = 0; i < strings.length; i++) {
            
            switch(strings[i]){
                case "+":
                    double num1 = Double.parseDouble(pila.pop());
                    double num2 = Double.parseDouble(pila.pop());
                    pila.push((num1+num2)+"");
                    break;
                case "-":
                    double num3 = Double.parseDouble(pila.pop());
                    double num4 = Double.parseDouble(pila.pop());
                    pila.push((num4-num3)+"");
                    break;
                case "/":
                    double num5 = Double.parseDouble(pila.pop());
                    double num6 = Double.parseDouble(pila.pop());
                    pila.push((num5/num6)+"");
                    break;
                case "*":
                    double num7 = Double.parseDouble(pila.pop());
                    double num8 = Double.parseDouble(pila.pop());
                    pila.push((num7*num8)+"");
                    break;
                default:
                    pila.push(strings[i]);
            }
        }
        double res=Double.parseDouble(pila.pop());
        //historico.add(res);
        return res;
    }
}
