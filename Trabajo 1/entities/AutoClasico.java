package entities;

public class AutoClasico extends Vehiculo {

    public AutoClasico(String color, String marca, String modelo, float precio) {
        super(color, marca, modelo, precio);
    }

    public AutoClasico(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    // metodos
    public void nuevaRadio(Radio radioN) {
        setRadio(radioN);
    }

}
