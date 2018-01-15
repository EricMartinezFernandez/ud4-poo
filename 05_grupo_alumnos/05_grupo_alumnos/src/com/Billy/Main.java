package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre, apellido, dni, telefono;
        int vueltas = 0;

        Grupo grupo = new Grupo();

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
            grupo.IntroducirDatos(nombre, apellido, dni, telefono);
            System.out.println("\n-----------------\n");
        }

        grupo.MostrarDatos();

    }
}
