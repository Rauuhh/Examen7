package org.example.Examen;

import java.util.Objects;
import java.util.Scanner;

public class Estudiante {

    static Scanner entrada = new Scanner(System.in);
    private String apellidos;
    private String nombre;
    private String curso;
    private int edad;

    public Estudiante(String apellidos, String nombre, int edad, String curso) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        System.out.print("Inserta el nombre: ");
        this.nombre = entrada.next();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(){
        System.out.println("Introduce los apellidos");
        this.apellidos = entrada.nextLine();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(){
        System.out.println("Introduce el curso");
        this.curso = entrada.nextLine();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(){
        System.out.println("Introduce la edad");
        this.edad = entrada.nextInt();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante estudiante = (Estudiante) o;
        return Objects.equals(apellidos,estudiante.apellidos) && Objects.equals(nombre, estudiante.nombre)  && Objects.equals(curso,estudiante.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return "Estudiante{" + "apellidos='" + apellidos + '\'' + ", nombre='" + nombre + '\'' + ", curso='" + curso + '\'' + ", edad=" + edad + '}';
    }

}
