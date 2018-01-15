package com.Billy;

public class alumno {//Se me olvidó la mayus.
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;

    public alumno(String nombre, String apellido, String dni, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public void datos() {
        System.out.println(nombre + " | " + apellido + " | " + dni + " | " + telefono);
    }
}
