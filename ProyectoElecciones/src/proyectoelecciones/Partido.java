/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoelecciones;

/**
 *
 * @author Joel Hernández Martín joelyx96@gmail.com
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

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Votos: " + votos + ", Presidente: " + presidente;
    }
    
    
}
