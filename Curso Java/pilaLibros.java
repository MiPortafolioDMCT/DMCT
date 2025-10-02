class Libro {
    String titulo;
    Libro anterior;

    Libro(String titulo){
        this.titulo = titulo;
    }
}

class Pila {
    Libro raiz;

    void insertar(String titulo) {
        Libro nuevoLibro = new Libro(titulo);

        nuevoLibro.anterior = raiz;
        raiz = nuevoLibro;
    }

    void listar() {
        Libro copia = raiz;

        while(copia != null) {
            System.out.println(copia.titulo);
            copia = copia.anterior;
        }
    }

    void listarReves() {
        Libro copia = raiz;
        Pila pilaR = new Pila();           
        
        while(copia != null) {            
            pilaR.insertar(copia.titulo);
            copia = copia.anterior;
        }
        pilaR.listar();
    }

    void extraer(){ //poop
        raiz = raiz.anterior;
    }

    String ultimoLibro() { //peak
        return raiz.titulo;
    }

    boolean isEmpty () {
        return raiz == null;
    }
}

class Mesa {
    Pila pilaDeLibros;

    Mesa() {
        pilaDeLibros = new Pila();
    }

    void agregarLibro(String titulo) {
        pilaDeLibros.insertar(titulo);
    }

    void mostrarLibrosEnMesa() {
        System.out.println("Libros en la mesa:");
        pilaDeLibros.listar();
    }

    void mostrarLibrosAlReves() {
        System.out.println("Libros en la mesa al reves:");
        pilaDeLibros.listarReves();
    }

    void quitarUltimoLibro() {
        System.out.println("Se extrajo el ultimo libro de la mesa");
        pilaDeLibros.extraer();
    }
}

class Programa {
    public static void main(String [] args){
        Mesa mesa = new Mesa();

        mesa.agregarLibro("Libro de la selva");
        mesa.agregarLibro("Fundamentos de programación I");
        mesa.agregarLibro("quimica");
        mesa.agregarLibro("matematicas");
        mesa.agregarLibro("chistes cortos");

        mesa.mostrarLibrosEnMesa();
        System.out.println();
        mesa.mostrarLibrosAlReves();
        System.out.println();
        mesa.quitarUltimoLibro();
        System.out.println();
        mesa.mostrarLibrosEnMesa();
    }
}