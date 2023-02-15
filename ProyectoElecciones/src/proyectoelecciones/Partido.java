/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoelecciones;

/**
 *
 * @author Joel Hernández Martín joelyx96@gmail.com
 * @author Ruben Gonzalez Sabina
 */
public class Partido {
    private String nombre;
    private int votos;

    private String presidente;   
    private int diputados;


    public int getDiputados() {
        return diputados;
    }

    public void setDiputados(int diputados) {
        this.diputados = diputados;
    }


    public Partido(String nombre, int votos, String presidente) {
        this.nombre = nombre;
        this.votos = votos;
        this.presidente = presidente;        
        this.diputados = 0;
    }

    public Partido() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getVotos() {
        return votos;
    }

    public String getPresidente() {
        return presidente;
    }
    
    public void addDiputado(){
        diputados++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

 

  
    public void setDiputados() {
        this.diputados += 1;
    }
    
    
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " Votos: " + votos + " Presidente: " + presidente + " Diputados: " + diputados + "\n";
    }
    
    
}
