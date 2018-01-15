package com.Billy;

public class Grupo {
    private int alumno = 0;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;

    Alumno[] alumnos = new Alumno[5];

    public void IntroducirDatos(String nombre, String apellido, String dni, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        alumnos[alumno] = new Alumno(nombre, apellido, dni, telefono);
        alumno++;
    }

    public void MostrarDatos() {
        alumnos[0].datos();
        alumnos[1].datos();
        alumnos[2].datos();
        alumnos[3].datos();
        alumnos[4].datos();
    }

}
