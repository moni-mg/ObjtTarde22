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

//es una relacion de composición fuerte y acoplada
class Humano{
    //Local Inner Class
    private class CabezaHumano{}
}

class Perro{
    //CabezaHumano cabezaHumano=new CabezaHumano();
}

//es una relacion de composición simple
class celular{};
class alumno{
    celular celular;
};

class amigo {
    celular celular;
}


//el alumno usa computadora
//relaicion debil y de cohesión
class computadora{
    //computadora del colegio;
}

