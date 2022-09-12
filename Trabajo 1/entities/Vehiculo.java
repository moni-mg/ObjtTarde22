package entities;

public class Vehiculo {
    // atributos
    private String color;
    private String marca;
    private String modelo;
    private double precio;
    protected Radio radio;

    // Constructores
    public Vehiculo(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo(String color, String marca, String modelo, float precio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Vehiculo(String color, String marca, String modelo, Radio radio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.radio = radio;
    }

    public Vehiculo(String color, String marca, String modelo, double precio, Radio radio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.radio = radio;
    }

    // GEters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio no válido");
        }

    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio string) {
        this.radio = string;
    }

    // metodos
    public void cambiarRadio(String string) {
        this.radio.cambiarMarca(string);
    }

    // toString
    @Override
    public String toString() {
        return "[color=" + color + ", marca=" + marca +
                ", modelo=" + modelo + ", precio=" + precio
                + ", radio=" + radio + "]";
    }

}
