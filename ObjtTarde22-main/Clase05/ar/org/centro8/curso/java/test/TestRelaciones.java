package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.entities.Cuenta;
import ar.org.centro8.curso.java.utils.ColoresAnsi;

public class TestRelaciones {
    public static void main(String[] args) {
        
        //Objetos Mocks - Objetos Simulados

        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1,"arg$");
        //cuenta1.saldo=999999999;
        //cuenta1.setSaldo(999999999);
        cuenta1.depositar(40000);
        cuenta1.depositar(50000);
        cuenta1.debitar(30000);

        System.out.println(cuenta1);

        System.out.println("-- cuenta2 --");
        Cuenta cuenta2=new Cuenta(2, "arg$");
        //cuenta2.setSaldo(100000);
        //cuenta2.setMoneda("US$");
        cuenta2.depositar(75000);
        System.out.println(cuenta2);


        //Objeto simulado avanzado (Mock)
        //Pátron RED GREEN
        System.out.println("-- cuentax --");
        Cuenta cuentax=new Cuenta(10, "arg$");

        if(cuentax.getNro()==10)System.out.println(ColoresAnsi.ANSI_GREEN+"OK getNro"+ColoresAnsi.ANSI_RESET);
        else                    System.out.println(ColoresAnsi.ANSI_RED+"Error! getNro"+ColoresAnsi.ANSI_RESET);

        if(cuentax.getMoneda().equals("arg$"))System.out.println(ColoresAnsi.ANSI_GREEN+"OK getMoneda"+ColoresAnsi.ANSI_RESET);
        else                                            System.out.println(ColoresAnsi.ANSI_RED+"Error! getMoneda"+ColoresAnsi.ANSI_RESET);

        if(cuentax.getSaldo()==0)   System.out.println(ColoresAnsi.ANSI_GREEN+"OK getSaldo=0"+ColoresAnsi.ANSI_RESET);
        else                        System.out.println(ColoresAnsi.ANSI_RED+"Error! getSaldo=0"+ColoresAnsi.ANSI_RESET);

        cuentax.depositar(5000);

        if(cuentax.getSaldo()==5000)    System.out.println(ColoresAnsi.ANSI_GREEN+"OK getSaldo=5000"+ColoresAnsi.ANSI_RESET);
        else                            System.out.println(ColoresAnsi.ANSI_RED+"Error! getSaldo=5000"+ColoresAnsi.ANSI_RESET);

        cuentax.depositar(5000);
        //cuentax.depositar(5000);

        if(cuentax.getSaldo()==10000)   System.out.println(ColoresAnsi.ANSI_GREEN+"OK getSaldo=10000"+ColoresAnsi.ANSI_RESET);
        else                            System.out.println(ColoresAnsi.ANSI_RED+"Error! getSaldo=10000"+ColoresAnsi.ANSI_RESET);

        cuentax.debitar(6000);

        if(cuentax.getSaldo()==4000)    System.out.println(ColoresAnsi.ANSI_GREEN+"OK getSaldo=4000"+ColoresAnsi.ANSI_RESET);
        else                            System.out.println(ColoresAnsi.ANSI_RED+"Error! getSaldo=4000"+ColoresAnsi.ANSI_RESET);
        
        cuentax.debitar(6000);

        if(cuentax.getSaldo()==4000)    System.out.println(ColoresAnsi.ANSI_GREEN+"OK getSaldo=4000"+ColoresAnsi.ANSI_RESET);
        else                            System.out.println(ColoresAnsi.ANSI_RED+"Error! getSaldo=4000"+ColoresAnsi.ANSI_RESET);

    }
}
