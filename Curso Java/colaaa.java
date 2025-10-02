class Elemento {
    String valor;
    Elemento siguiente;

    Elemento(String valor){
        this.valor = valor;
    }
}

class Cola {
    Elemento raiz;
    Elemento primerReferencia;


    void insertar(String valor) {
        Elemento nuevoElemento = new Elemento(valor);

        if (raiz == null) {
            raiz = nuevoElemento;
            primerReferencia = nuevoElemento;
        } else {
            raiz.siguiente = nuevoElemento;
            raiz = nuevoElemento;
        }
    }
    
    void listar(){
        Elemento copia = primerReferencia;

        while(copia != null) {
            System.out.println(copia.valor);
            copia = copia.siguiente;
        }
    }

    void listarReves() {
        Elemento copia = primerReferencia;
        Pila pilaR = new Pila();           
        
        while(copia != null) {            
            pilaR.insertar(copia.valor);
            copia = copia.siguiente;
        }
        pilaR.listar();
    }

    void extraer(){ 
        primerReferencia = primerReferencia.siguiente;
    }

    String ultimoElemento() {
        return raiz.valor;
    }
}

class Programa { 
    public static void main(String [] args) {
        Cola cola = new Cola();

        cola.insertar("Elemento1");
        cola.insertar("Elemento2");
        cola.insertar("Elemento3");
        cola.insertar("Elemento4");
        cola.insertar("Elemento5");

        cola.listar();
        System.out.println();
        cola.listarReves();
        System.out.println();
        cola.extraer();
        System.out.println();
        cola.listar();
        System.out.println();
        System.out.println(cola.ultimoElemento());

    }
}