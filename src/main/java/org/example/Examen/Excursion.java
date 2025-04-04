package org.example.Examen;

import java.util.*;

public class Excursion {

    Scanner entrada = new Scanner(System.in);

    private String nombre_actividad;

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre_actividad() {
        return nombre_actividad;
    }

    public void setNombre_actividad(String nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private String localidad;
    private double precio;
    private LinkedList<String> profesores;
    private LinkedHashSet<Estudiante> listaEstudiantes;

    public Excursion(String nombre_actividad, String localidad, double precio) {
        this.nombre_actividad = nombre_actividad;
        this.localidad = localidad;
        this.precio = precio;
        profesores = new LinkedList<>();
        listaEstudiantes = new LinkedHashSet<>();
    }

    public void insertarProfesor(){
        System.out.println("Introduce el nombre del profeso");
        profesores.add(entrada.nextLine());
    }
    public void inscribirAsistente(){
        System.out.println("Inserta los apellidos");
        String apellido = entrada.nextLine();
        System.out.println("Inserta el nombre");
        String nombre = entrada.nextLine();
        System.out.println("Inserta la curso");
        String curso     = entrada.nextLine();
        System.out.println("Inserta la edad");
        int edad     = entrada.nextInt();
    }

    public double calcularImporteIngreso(){

        int prec = listaEstudiantes.size();
        return prec * precio;
    }

    public void verAsistentes(){
        System.out.println(listaEstudiantes);
    }

//    public void eliminarAsistentesPorEdad(int edad){
//        if (edad < 16)
//        {
//            listaEstudiantes.remove();
//        }
//    }
}
