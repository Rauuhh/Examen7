package org.example.Examen;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Excursion {

    Scanner entrada = new Scanner(System.in);

    private String nombre_actividad;
    private String localidad;
    private double precio;
    private Collection<String> profesores;
    private LinkedHashSet<Estudiante> listaEstudiantes;

    public Excursion(String nombre_actividad, String localidad, double precio) {
        this.nombre_actividad = nombre_actividad;
        this.localidad = localidad;
        this.precio = precio;
    }

    public void insertarProfesor(){
        System.out.println("Introduce el nombre del profesor");
        profesores.add(entrada.nextLine());
    }
    public void inscribirAsistente(Estudiante estudiante){
        estudiante.setApellidos();
        estudiante.getNombre();
        estudiante.setCurso();
        estudiante.setEdad();
    }

    public double calcularImporteIngreso(){

        return 0;
    }

    public void verAsistentes(){

    }
}
