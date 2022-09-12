package entities;

public class AutoNuevo extends Vehiculo {
    // constructores
    public AutoNuevo(String color, String marca, String modelo, Radio radio) {
        super(color, marca, modelo, radio);
    }

    public AutoNuevo(String color, String marca, String modelo, float precio, Radio radio) {
        super(color, marca, modelo, precio, radio);
    }

}
