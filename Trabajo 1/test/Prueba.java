package test;

import entities.AutoClasico;
import entities.AutoNuevo;
import entities.Radio;
import entities.Vehiculo;

public class Prueba {

    public static void main(String[] args) {
        // inicializo clases
        Radio radio = new Radio("generica");
        Vehiculo vehic = new Vehiculo("rojo", "Fiat", "1100", 111000.56, radio);
        AutoNuevo auto1 = new AutoNuevo("azul", "Fiat", "1100", radio);
        AutoClasico auto2 = new AutoClasico("verde", "Fiat", "1100");
        // Inicio
        System.out.println("Instancia inicial: ");
        mostrarEstado(vehic, auto1, auto2);

        // pruebo metodos
        vehic.cambiarRadio("prueba");
        mostrarEstado(vehic, auto1, auto2);

    }

    private static void mostrarEstado(Vehiculo vehic, AutoNuevo auto1, AutoClasico auto2) {
        System.out.println("Estado de los autos:\n");
        System.out.println("Vehiculo generico: " + vehic.toString());
        System.out.println("Auto moderno: " + auto1.toString());
        System.out.println("Auto clásico: " + auto2.toString());
    }
}
