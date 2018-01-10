package com.Billy;

public class Cronometro {

    private long startTime;
    private long estimatedTime;

    public Cronometro() {
        long startTime = System.nanoTime();
    }

    public void tiempoTranscurrido() {
        estimatedTime = System.nanoTime() - startTime;
        estimatedTime = estimatedTime / 1000000000;
        System.out.println(estimatedTime);
    }

}
