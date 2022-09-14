package entities;

public class AutoClasico extends Vehiculo {

    public AutoClasico(String color, String marca, String modelo, float precio) {
        super(color, marca, modelo, precio);
    }

    public AutoClasico(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    public AutoClasico(String color, String marca, String modelo, Radio radio) {
        super(color, marca, modelo, radio);
    }

    public AutoClasico(String color, String marca, String modelo, double precio, Radio radio) {
        super(color, marca, modelo, precio, radio);
    }

    // metodos
    public void nuevaRadio(String radioNueva) {
        Radio radio = new Radio(radioNueva);
        this.setRadio(radio);
    }
}
