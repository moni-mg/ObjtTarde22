package ar.org.centro8.curso.java.test;

import java.time.LocalDateTime;

public class HolaMundo{
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        System.out.println("Versión de Java: "+System.getProperty("java.version"));
        System.out.println(LocalDateTime.now());
        
    }
}