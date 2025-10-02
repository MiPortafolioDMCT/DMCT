// Objeto: Audifono 
// Atributos:
//     marca, color, cable, forma, textura
// Operaciones: 
//     reproducir musica, pausar musica, subir volumen, bajar volumen
class Audifono { //es la implementación del objeto Audifono
    //implementación de atributos
    String marca = "bozze"; //es la implementación del atributo marca
    String color;
    boolean cable;
    String forma;
    String textura;

    //implementacion de operaciones
    void reproducirMusica() { //procedimientos
        System.out.println("reproduciendo muscia");
    }

    void pausarMusica() { 
        System.out.println("pausando muscia");
    }

    void subirVolumen() { 
        System.out.println("subiendo volumen");
        //volumen++;
    }

    void bajarVolumen() { 
        System.out.println("bajando volumen");
        //volumen--;
    }
}

class Programa {
    public static void main (String [] args) { //el mentodo main es el usuario de la instancia Audifono 
        //En programación trabajamos con instancias no con objetos 
        Audifono audifono = new Audifono(); // audifono también es interfaz
        System.out.println(audifono.marca);
        audifono.reproducirMusica(); //ejecutando la operacion reproducirMusica
    }
}