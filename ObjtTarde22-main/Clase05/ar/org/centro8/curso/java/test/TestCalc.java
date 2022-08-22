package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.utils.Calculadora;
import ar.org.centro8.curso.java.utils.ColoresAnsi;

/***
 * Mocks
 * Prueba para evaluar los calculos en objetos simulados
 */
public class TestCalc {
    /***
         * Objeto de prueba
         * Se crea como atributo para permitir que los metodos accedan al objeto.
         * static y final permiten acceder al atribut más rapido por el lugar de guardado en la memoria
         */
        private static final Calculadora calcu = new Calculadora();
    private static double restar;
        
    /**
     * Punto de entrada del proyecto
     * 
     * @param args argumentos que ingresan desde consola de usuario.
     */
    public static void main(String[] args) {
        /***
         * Valor para visualizar el resultado
         */
        System.out.println("--- Pruebas ---\n");    
        separador ();
        sumar();
        separador ();
        restar();
        separador ();
        multiplicar();
        separador ();
        dividir(); //Refactor > Extract Method... para evitar mucho texto en main
    }
    public static void separador (){
        System.out.println("\n***********************************************************\n");
    }
    private static double multiplicar() {
        double resultado = 0;
        System.out.println("Multiplicaciones: ");
        //multiplicar 0*0 = 0
        resultado = calcu.multiplicar(0, 0);
        if (resultado == 0) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Multiplicación 0*0 = 0" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Multiplicación 0*0 = 0" + ColoresAnsi.ANSI_RESET);
        }

        //multiplicar 2*2 = 0
        resultado = calcu.multiplicar(2, 2);
        if (resultado == 4) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Multiplicación 2*2 = 4" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Multiplicación 2*2 = 4" + ColoresAnsi.ANSI_RESET);
        }

        //multiplicar 10*(-10) = 20
        resultado = calcu.multiplicar(10, -10);
        if (resultado == -100) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Multiplicación 10*(-10) = -100" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Multiplicación 10*(-10) = -100" + ColoresAnsi.ANSI_RESET);
        }
        
        //multiplicar -10*(-10) = 0
        resultado = calcu.multiplicar(-10, -10);
        if (resultado == 100) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Multiplicación -10*(-10) = 100" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Multiplicación -10*(-10) = 100" + ColoresAnsi.ANSI_RESET);
        }

        //multiplicar 200000000000000000. * 200000000000000000.             17 0s
        resultado = calcu.multiplicar(200000000000000000. , 200000000000000000. );
        if (resultado == 40000000000000000000000000000000000.) {  //no deberia permitir esta multiplicación porque no deberia poder ser double.
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Multiplicación 200000000000000000. * 200000000000000000." + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Multiplicación 200000000000000000. * 200000000000000000." + ColoresAnsi.ANSI_RESET);
        }

        return 0;
    }

    private static double restar() {
        double resultado = 0;
        System.out.println("Restas: ");
        //restar 0-0 = 0
        resultado = calcu.restar(0, 0);
        if (resultado == 0) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Resta 0-0 = 0" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Resta 0-0 = 0" + ColoresAnsi.ANSI_RESET);
        }

        //restar 2-2 = 0
        resultado = calcu.restar(2, 2);
        if (resultado == 0) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Resta 2-2 = 4" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Resta 2-2 = 4" + ColoresAnsi.ANSI_RESET);
        }

        //restar 10-(-10) = 20
        resultado = calcu.restar(10, -10);
        if (resultado == 20) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Resta 10-(-10) = 0" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Resta 10-(-10) = 0" + ColoresAnsi.ANSI_RESET);
        }
        
        //restar -10-(-10) = 0
        resultado = calcu.restar(-10, -10);
        if (resultado == 0) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Resta -10-(-10) = -20" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Resta -10-(-10) = -20" + ColoresAnsi.ANSI_RESET);
        }

        //restar 200000000000000000. - 200000000000000000.             17 0s
        resultado = calcu.restar(200000000000000000. , 200000000000000000. );
        if (resultado == 0) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Resta 200000000000000000. - 200000000000000000." + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Resta 200000000000000000. - 200000000000000000." + ColoresAnsi.ANSI_RESET);
        }

        return 0;
    }

    private static double sumar() {
        double resultado = 0;
        System.out.println("Sumas: ");
        //sumar 0+0 = 0
        resultado = calcu.sumar(0, 0);
        if (resultado == 0) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Suma 0+0 = 0" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Suma 0+0 = 0" + ColoresAnsi.ANSI_RESET);
        }

        //sumar 2+2 = 4
        resultado = calcu.sumar(2, 2);
        if (resultado == 4) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Suma 2+2 = 4" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Suma 2+2 = 4" + ColoresAnsi.ANSI_RESET);
        }

        //sumar 10+-10 = 0
        resultado = calcu.sumar(10, -10);
        if (resultado == 0) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Suma 10+-10 = 0" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Suma 10+-10 = 0" + ColoresAnsi.ANSI_RESET);
        }
        
        //sumar -10+-10 = -20
        resultado = calcu.sumar(-10, -10);
        if (resultado == -20) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Suma -10+-10 = -20" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Suma -10+-10 = -20" + ColoresAnsi.ANSI_RESET);
        }

        //sumar 200000000000000000. + 200000000000000000.             17 0s
        resultado = calcu.sumar(200000000000000000. , 200000000000000000. );
        if (resultado == 400000000000000000.) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! Suma 200000000000000000. + 200000000000000000." + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! Suma 200000000000000000. + 200000000000000000." + ColoresAnsi.ANSI_RESET);
        }
        return 0;
    }

    private static double dividir() {
        double resultado = 0;
        System.out.println("Divisiones: ");
        //dividir 0/0 = 0
        resultado = calcu.dividir(0, 0);
        if (true) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! División 0/0 = 0" + ColoresAnsi.ANSI_RESET);
        } 
        
        //dividir 2/2 = 0
        resultado = calcu.dividir(2, 2);
        if (resultado == 1) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! División 2/2 = 1" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! División 2/2 = 1" + ColoresAnsi.ANSI_RESET);
        }

        //dividir 10/(-10) = 20
        resultado = calcu.dividir(10, -10);
        if (resultado == -1) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! División 10/(-10) = -1" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! División 10/(-10) = -1" + ColoresAnsi.ANSI_RESET);
        }
        
        //dividir -10/(-10) = 0
        resultado = calcu.dividir(-10, -10);
        if (resultado == 1) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! División -10/(-10) = 1" + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! División -10/(-10) = 1" + ColoresAnsi.ANSI_RESET);
        }

        //dividir 200000000000000000. / 200000000000000000.             17 0s
        resultado = calcu.dividir(200000000000000000. , 200000000000000000. );
        if (resultado == 1) {
            System.out.println(ColoresAnsi.ANSI_GREEN + "OK! División 200000000000000000. / 200000000000000000." + ColoresAnsi.ANSI_RESET);
        } else {
            System.out.println(ColoresAnsi.ANSI_RED + "Error! División 200000000000000000. / 200000000000000000." + ColoresAnsi.ANSI_RESET);
        }

        return 0;
    }

}