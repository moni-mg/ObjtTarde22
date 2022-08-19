package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.utils.Calculadora;
import ar.org.centro8.curso.java.utils.ColoresAnsi;

/***
 * Mocks
 * Prueba para evaluar los calculos en objetos simulados
 */
public class TestCalc {

    /**
     * Punto de entrada del proyecto
     * 
     * @param args argumentos que ingresan desde consola de usuario.
     */
    public static void main(String[] args) {
        /***
         * Objeto de prueba
         */
        System.out.println("--- Pruebas ---");
        Calculadora calcu = new Calculadora();
        double resultado = 0;

        /***
         * Valor para visualizar el resultado
         */
        resultado = calcu.sumar(1, 2);

        if (resultado == 3) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Suma" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Suma" + ColoresAnsi.ANSI_RESET);
        }

        resultado += calcu.sumar(1, 2);
        if (resultado == 6) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Suma" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Suma" + ColoresAnsi.ANSI_RESET);
        }

        resultado -= calcu.restar(4, 2);
        if (resultado == 2) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Resta" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Resta" + ColoresAnsi.ANSI_RESET);
        }

        resultado = calcu.multiplicar(1, 2);
        if (resultado == 2) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Multiplicar" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Multiplicar" + ColoresAnsi.ANSI_RESET);
        }

        resultado = calcu.dividir(6, 2);
        if (resultado == 3) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Dividir" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! SDividir" + ColoresAnsi.ANSI_RESET);
        }

        resultado = calcu.dividir(1, 2);
        if (resultado == 0) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Dividir" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Dividir" + ColoresAnsi.ANSI_RESET);
        }
    }

}