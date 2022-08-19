package ar.org.centro8.curso.java.utils;

/***
 * Clase principal del proyecto Calculadora
 */

public class Calculadora {

    /***
     * Suma los dos números que ingresan como parametro
     * 
     * @param nro1 primer numero
     * @param nro2 segundo numero
     * @return resultado de la suma
     */
    public double sumar(double nro1, double nro2) {
        return nro1 + nro2;
    }

    /***
     * Resta los dos números que ingresan como parametro
     * 
     * @param nro1 primer numero
     * @param nro2 segundo numero
     * @return resultado de la resta
     */
    public double restar(double nro1, double nro2) {
        return nro1 - nro2;
    }

    /***
     * Multiplica los dos números que ingresan como parametro
     * 
     * @param nro1 primer numero
     * @param nro2 segundo numero
     * @return producto de la multiplicación
     */
    public double multiplicar(double nro1, double nro2) {
        return nro1 * nro2;
    }

    /***
     * Divide los dos números que ingresan como parametro
     * 
     * @param nro1 primer numero
     * @param nro2 segundo numero
     * @return resultado de la división
     */
    public double dividir(double nro1, double nro2) {
        return nro1 / nro2;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
