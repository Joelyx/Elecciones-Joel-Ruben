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
 * @author Ruben Gonzalez Sabina
 */
public class Elecciones {

    private ArrayList<Partido> partidos = new ArrayList<Partido>();
    private int diputadosTotales;
    private Date fecha;

    public Elecciones() {
    }

    public Elecciones(int diputados, Date fecha) {
        this.diputadosTotales = diputados;
        this.fecha = fecha;
    }

    public Elecciones(ArrayList<Partido> partidos, int diputadosTotales, Date fecha) {
        this.partidos = partidos;
        this.diputadosTotales = diputadosTotales;
        this.fecha = fecha;
    }

    public void addPartido(String nombre, int votos, String presidente) {
        Partido partido = new Partido(nombre, votos, presidente);
        partidos.add(partido);
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public int getDiputadosTotales() {
        return diputadosTotales;
    }

    public void setDiputadosTotales(int diputadosTotales) {
        this.diputadosTotales = diputadosTotales;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        String res = "Elecciones del " + fecha + "";
        for (int i = 0; i < partidos.size(); i++) {
            res += "\n Patido " + i + ") " + partidos.get(i);
        }

        return res;
    }
<<<<<<< HEAD

    public void asignarDiputados() {
        double[][] totales = new double[this.diputadosTotales][this.partidos.size()];
        for (int x = 0; x < totales.length; x++) {
            for (int y = 0; y < totales[x].length; y++) {
                totales[x][y] = this.partidos.get(y).getVotos() / (x + 1);
            }
        }

        double max = 0;
        int fila = 0;
        int columna = 0;

        for (int i = 1; i <= this.diputadosTotales; i++) {
            for (int x = 0; x < totales.length; x++) {
                for (int y = 0; y < totales[x].length; y++) {
                    double num = totales[x][y];
                    if (num > max) {
                        max = num;
                        fila = x;
                        columna = y;
                    }
                }
            }
            this.partidos.get(columna).setDiputados();
            max = 0;
            totales[fila][columna] = 0;
        }

        System.out.println(this.partidos);

    }

=======
    
    public void calcularDiputados(){
        int[] divisiones = new int[diputadosTotales];
        int max=-1;
        for (int i = 0; i < divisiones.length; i++) {
            divisiones[i]=partidos.get(i).getDiputados();
            if(divisiones[i]>max){
                max = i;
            }
        }
        partidos.get(max).addDiputado();
        
        for (int i = 0; i < divisiones.length-1; i++) {
            divisiones[max]=partidos.get(max).getVotos()/partidos.get(max).getDiputados()+1;
            max=-1;
            for (int j = 0; j < divisiones.length; j++) {
                if(divisiones[j]>max){
                    max = i;
                }
            }
            partidos.get(max).addDiputado();
        }
        
        
        /*
        for (int i = 0; i < diputadosTotales; i++) {
            int max=-1;
            int partidoIndex=-1;
            for (int j = 0; j < partidos.size(); j++) {
                if(max<partidos.get(j).getVotos()/i){
                    partidoIndex=j;
                }
                partidos.get(partidoIndex).setDiputados(partidos.get(partidoIndex).getDiputados()+1);
                
            }
            
        }*/
    }
    
>>>>>>> 02f22b63a0767c30bbec68c0b65e404715a34a6a
}
