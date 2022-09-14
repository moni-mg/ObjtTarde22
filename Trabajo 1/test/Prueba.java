package test;

import entities.AutoClasico;
import entities.AutoNuevo;
import entities.Radio;
import entities.Vehiculo;

public class Prueba {

    public static void main(String[] args) {
        // inicializo clases
        Radio radio = new Radio("generica");

        Vehiculo vehic = new Vehiculo("rojo", "Fiat", "1100", radio);
        AutoNuevo nuevo = new AutoNuevo("azul", "Fiat", "1100", radio);
        AutoClasico clasico = new AutoClasico("verde", "Fiat", "1100");
        // pruebo metodos
        System.out.println("Estado inicial de los autos:");
        mostrarEstado(vehic, nuevo, clasico);

        System.out.println("\nAgrego radio en auto clásico");
        clasico.nuevaRadio("Radio Nueva");
        System.out.println("Auto clásico: " + clasico.toString());

        System.out.println("\nCambio radio en auto clásico:");
        clasico.cambiarRadio("Radio Nueva");
        System.out.println("Auto clásico: " + clasico.toString());

        System.out.println("\nAgrego precio en auto clásico:");
        clasico.setPrecio(120000);
        System.out.println("Auto clásico: " + clasico.toString());

        System.out.println("\nCambio precio a -10 en auto clásico:");
        clasico.setPrecio(-10);
        System.out.println("Auto clásico: " + clasico.toString());

        System.out.println("\nCambio radio en auto nuevo:");
        nuevo.cambiarRadio("Radio Mejor B)");
        System.out.println("Auto moderno: " + nuevo.toString());
    }

    private static void mostrarEstado(Vehiculo vehic, AutoNuevo nuevo, AutoClasico clasico) {
        System.out.println("\nEstado de los autos:");
        System.out.println("Vehiculo generico: " + vehic.toString());
        System.out.println("Auto moderno: " + nuevo.toString());
        System.out.println("Auto clásico: " + clasico.toString());
    }
}
