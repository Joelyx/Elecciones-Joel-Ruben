/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoelecciones;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Joel Hernández Martín joelyx96@gmail.com
 */
public class Elecciones {
    private ArrayList<Partido> partidos;
    private int diputadosTotales;
    private Date fecha;
    
    public Elecciones(){}
    
    public Elecciones(int diputados, Date fecha){
        this.diputadosTotales=diputados;
        this.fecha=fecha;
    }
    
    public void addPartido(String nombre, int votos, String presidente){
        Partido partido = new Partido(nombre, votos, presidente);
        partidos.add(partido);
    }

    @Override
    public String toString() {
        String res="Elecciones del " + fecha + "";
        for (int i = 0; i < partidos.size(); i++) {
            res+="\n Patido "+i+") "+partidos.get(i);
        }
        
        return res;
    }
    
    
    
}
