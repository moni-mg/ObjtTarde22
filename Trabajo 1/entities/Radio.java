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

    public void setMarca(String rad) {
        this.marca = rad;
    }

    // metodo
    public void cambiarMarca(String string) {
        setMarca(string);
    }

    // toString
    @Override
    public String toString() {
        return "marca= " + marca;
    }

}
