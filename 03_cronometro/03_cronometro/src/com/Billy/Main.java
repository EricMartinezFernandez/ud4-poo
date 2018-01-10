package com.Billy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char menu;
        int array = 0, menu2;
        boolean salir = false;

        Cronometro[] cronometros = new Cronometro[10];

        cronometros[1] = new Cronometro();
        cronometros[2] = new Cronometro();
        cronometros[3] = new Cronometro();
        cronometros[4] = new Cronometro();
        cronometros[5] = new Cronometro();
        cronometros[6] = new Cronometro();
        cronometros[7] = new Cronometro();
        cronometros[8] = new Cronometro();
        cronometros[9] = new Cronometro();

        do {

            System.out.println("Menú\na)Iniciar cronómetro\nb)Consultar cronómetro\nc)Salir");
            menu = br.readLine().charAt(0);

            switch (menu) {
                case 'a':
                    if (array < 10) {
                        cronometros[array] = new Cronometro();
                        array++;
                    } else {
                        System.out.println("No quedan cronometros");
                    }
                    break;
                case 'b':
                    System.out.println("Que cronometro deseas visualizar:");
                    for (int i = 0; i < (array); i++) {
                        int vuelta = i + 1;
                        System.out.println("Cronometro: " + vuelta);
                    }
                    menu2 = Integer.parseInt(br.readLine());
                    switch (menu2) {
                        case 1:
                            cronometros[0].tiempoTranscurrido();
                            break;
                        case 2:
                            cronometros[1].tiempoTranscurrido();
                            break;
                        case 3:
                            cronometros[2].tiempoTranscurrido();
                            break;
                        case 4:
                            cronometros[3].tiempoTranscurrido();
                            break;
                        case 5:
                            cronometros[4].tiempoTranscurrido();
                            break;
                        case 6:
                            cronometros[5].tiempoTranscurrido();
                            break;
                        case 7:
                            cronometros[6].tiempoTranscurrido();
                            break;
                        case 8:
                            cronometros[7].tiempoTranscurrido();
                            break;
                        case 9:
                            cronometros[8].tiempoTranscurrido();
                            break;
                        case 10:
                            cronometros[9].tiempoTranscurrido();
                            break;
                    }
                    break;
                case 'c':
                    salir = true;
                    break;
                default:
                    System.out.println("Caracter no válido");
                    break;
            }
        } while (salir == false);
        System.out.println("FIN DE LA APLICACIÓN");

    }
}
