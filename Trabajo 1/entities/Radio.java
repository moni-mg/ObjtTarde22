package entities;

public class Radio {
    // atributos
    private String marca;

    // constructores
    public Radio(String marca) {
        this.marca = marca;
    }

    public Radio() {
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // metodos
    public void cambiarMarca(String radio) {
        marca = radio;
    }

    // toString
    @Override
    public String toString() {
        return "marca=" + marca;
    }

    public void cambiarRadio(String string) {
    }

}
