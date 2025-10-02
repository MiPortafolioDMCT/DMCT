class Elemento {
    String valor;
    Elemento siguiente;

    Elemento(String valor){
        this.valor = valor;
    }
}

class Pila {
    Elemento raiz;

    void insertar(String valor) {
        Elemento nuevoElemento = new Elemento(valor);

        if(isEmpty()){
            raiz = nuevoElemento;
        } else {
            nuevoElemento.siguiente = raiz;
            raiz = nuevoElemento;
        }
    }

    void listar() {
        Elemento copia = raiz;
            // System.out.println(raiz.valor);
            // System.out.println(raiz.siguiente.valor);
            // System.out.println(raiz.siguiente.siguiente.valor);
            // System.out.println(raiz.siguiente.siguiente.siguiente.valor);
            // System.out.println(raiz.siguiente.siguiente.siguiente.siguiente.valor);

        while(copia != null) {
            System.out.println(copia.valor);
            copia = copia.siguiente;
        }
    }

    void listarRevesOP2() {
        Elemento copia = raiz;
        int cont = 0;

        while(copia != null) {            
            copia = copia.siguiente;
            cont++;
        }

        String[] arrai = new String[cont];
        copia = raiz;
        cont = 0;
        while(copia != null) {            
            arrai[cont] = copia.valor;
            copia = copia.siguiente;
            cont++;
        }

        cont = arrai.length;
        while (cont > 0) { 
            System.out.println(arrai[cont-1]);
            cont--;
        }
    }

    void listarReves() {
        Elemento copia = raiz;
        Pila pilaR = new Pila();           
        
        while(copia != null) {            
            pilaR.insertar(copia.valor);
            copia = copia.siguiente;
        }
        pilaR.listar();
    }

    void extraer(){ //poop
        raiz = raiz.siguiente;
    }

    String ultimoElemento() { //peak
        return raiz.valor;
    }

    boolean isEmpty () {
        return raiz == null;
        // if (raiz == null) {
        //     return true;
        // } else {
        //     return false;
        // }
    }
}
// String variable = 4 > 3 ? "gato" : "perro";
// if(4 > 3) {
//     variable = "gato";
// } else {
//     variable = "perro";
// }

class Programa {
    public static void main(String [] args){
        Pila pila = new Pila();

        pila.insertar("elemento1");
        pila.insertar("elemento2");
        pila.insertar("elemento3");
        pila.insertar("elemento4");
        pila.insertar("elemento5");
        pila.insertar("elemento6");
        pila.insertar("elemento7");
        pila.insertar("elemento8");
        pila.insertar("elemento9");
        pila.insertar("elemento10");

        pila.listar();
        System.out.println();
        pila.listarReves();
        System.out.println();
        pila.extraer();
        System.out.println();
        pila.listar();
        System.out.println();
        System.out.println(pila.ultimoElemento());
    }
}