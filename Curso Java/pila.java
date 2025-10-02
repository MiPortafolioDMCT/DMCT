class Elemento {
    String numero;
    Elemento siguiente;

    Elemento(String numero){
        this.numero = numero;
    }
}

class Lista {
    Elemento actual;

    void agregar(String numero){
        Elemento nuevoElemento = new Elemento(numero);

        if(actual == null){
            actual = nuevoElemento;
        } else {
            nuevoElemento.siguiente = actual;
            actual = nuevoElemento;
        }
    }

    void listar(){
        Elemento copia = actual;

        while(copia != null) {    
            System.out.println(copia.numero);
            copia = copia.siguiente;
        }
    }

    void extraer(){

    }
}

class Programa {
    public static void main (String [] args) {
        Lista lista = new Lista();
        lista.agregar("uno");
        lista.agregar("dos");
        lista.agregar("tres");

        lista.listar();
    }
}