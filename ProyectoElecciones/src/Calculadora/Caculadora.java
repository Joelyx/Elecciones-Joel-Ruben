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
    Stack pila = new Stack();
    ArrayList<Integer> historico;

    public Caculadora() {
        ArrayList<Integer> historico = new ArrayList();
    }
    
    public double calcular(String operacion){
        String[] strings = operacion.split(" ");
        for (int i = 0; i < strings.length; i++) {
            
            switch(strings[i]){
                case "+":
                    int num1 = (int)pila.pop();
                    int num2 = (int)pila.pop();
                    pila.push(num1+num2);
                    break;
                case "-":
                    int num3 = (int)pila.pop();
                    int num4 = (int)pila.pop();
                    pila.push(num3-num4);
                    break;
                case "/":
                    int num5 = (int)pila.pop();
                    int num6 = (int)pila.pop();
                    pila.push(num5/num6);
                    break;
                case "*":
                    int num7 = (int)pila.pop();
                    int num8 = (int)pila.pop();
                    pila.push(num7*num8);
                    break;
                default:
                    pila.push(strings[i]);
            }
        }
        historico.add((int)pila.pop());
        return historico.get(historico.size());
    }
}
