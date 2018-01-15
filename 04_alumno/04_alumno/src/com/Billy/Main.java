package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vueltas = 0, alumno = 0;
        String nombre, apellido, dni, telefono;
        alumno[] alumnos = new alumno[5];

        for (int i = 0; i < 5; i++) {
            vueltas++;
            System.out.print("Alumno: " + vueltas + "\n Nombre: ");
            nombre = br.readLine();
            System.out.print("Apellido: ");
            apellido = br.readLine();
            System.out.print("DNI: ");
            dni = br.readLine();
            System.out.print("Telefono: ");
            telefono = br.readLine();
            alumnos[alumno] = new alumno(nombre, apellido, dni, telefono);
            alumno++;
            System.out.println("\n-----------------\n");
        }
        vueltas = 0;
        for (int i = 0; i < 5; i++) {
            alumnos[vueltas].datos();
            vueltas++;
        }


    }
}
