package ar.org.centro8.curso.java.entities;

public class Cuenta {

    private int nro;
    private String moneda;
    private double saldo;

    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
    }

    public void depositar(double monto){
        this.saldo+=monto;
    }

    public void debitar(double monto){
        if(monto<=this.saldo){
            saldo-=monto;
        }else{
            System.out.println("Saldo Insuficiente!");
        }
    }

    @Override
    public String toString() {
        return "Cuenta [moneda=" + moneda + ", nro=" + nro + ", saldo=" + saldo + "]";
    }

    public int getNro() {
        return nro;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getSaldo() {
        return saldo;
    }

}
