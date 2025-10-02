class Elemento {
    int index;
    String valor;
    Elemento siguiente;

    Elemento(int index, String valor){
        this.index = index;
        this.valor = valor;
    }
}

class Lista {
    Elemento raiz;

    void insertar(int index, String valor) {
        Elemento nuevoElemento = new Elemento(index, valor);

        if(raiz == null){
            raiz = nuevoElemento;
        } else {
            nuevoElemento.siguiente = raiz;
            raiz = nuevoElemento;
        }
    }

    void listar() {
        Elemento copia = raiz;

        while(copia != null) {
            System.out.println(copia.valor);
            copia = copia.siguiente;
        }
    }
}

class Programa {
    public static void main(String [] args){
        Lista lista = new Lista();

        lista.insertar(0, "cocos");
        lista.insertar(1, "platanos");
        lista.insertar(2, "leche");
        lista.insertar(0, "jaja");
        lista.insertar(2, "agua");

        lista.listar();
    }
}





































    // void listarRevesOP2() {
    //     Elemento copia = raiz;
    //     int cont = 0;

    //     while(copia != null) {            
    //         copia = copia.siguiente;
    //         cont++;
    //     }

    //     String[] arrai = new String[cont];
    //     copia = raiz;
    //     cont = 0;
    //     while(copia != null) {            
    //         arrai[cont] = copia.valor;
    //         copia = copia.siguiente;
    //         cont++;
    //     }

    //     cont = arrai.length;
    //     while (cont > 0) { 
    //         System.out.println(arrai[cont-1]);
    //         cont--;
    //     }
    // }

    // void listarReves() {
    //     Elemento copia = raiz;
    //     Pila pilaR = new Pila();           
        
    //     while(copia != null) {            
    //         pilaR.insertar(copia.valor);
    //         copia = copia.siguiente;
    //     }
    //     pilaR.listar();
    // }

    // void extraer(){ //poop
    //     raiz = raiz.siguiente;
    // }

    // String ultimoElemento() { //peak
    //     return raiz.valor;
    // }

    // boolean isEmpty () {
    //     return raiz == null;
    //     // if (raiz == null) {
    //     //     return true;
    //     // } else {
    //     //     return false;
    //     // }
    // }