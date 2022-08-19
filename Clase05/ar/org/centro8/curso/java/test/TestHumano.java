package ar.org.centro8.curso.java.test;

public class TestHumano {
    public static void main(String[] args) {
        
    }
}
/*
//composición no segura
class CabezaHumano{}
class Humano{
    CabezaHumano cabeza=new CabezaHumano();
}
class Perro{
    CabezaHumano cabezaHumano=new CabezaHumano();
}
*/

class Humano{
    //Local Inner Class
    private class CabezaHumano{}
}

class Perro{
    //CabezaHumano cabezaHumano=new CabezaHumano();
}
