package act4;

import java.util.Arrays;

public class Alumno {
    private String nombre;
    private double[] notas;
    public Alumno(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.notas = new double[2];
        this.notas[0] = nota1;
        this.notas[1] = nota2;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double getPromedio() {
        double suma = 0;
        for (int indice = 0; indice < notas.length; indice++) {
            suma += notas[indice];
        }
        return suma / notas.length;
    }

    @Override
    public String toString() {
        return "ALUMNO: nombre: " + nombre + " , notas: " + Arrays.toString(notas);
    }
}