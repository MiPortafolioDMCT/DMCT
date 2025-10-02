// class Caja {
//     String valor;
//     Caja puntero;

//     Caja(String val) {
//         valor = val;
//     }
// }
// class Pila {
//     Caja raiz;

//     Pila() {
//         raiz = null;
//     }

//     void insertar(String val) {
//         Caja caja = new Caja(val);

//         if(raiz == null) {
//             raiz = caja;
//         } else {
//             caja.puntero = raiz;
//             raiz = caja;
//         }
//     }

//     void listar() {
//         // System.out.println(raiz.valor);
//         // System.out.println(raiz.puntero.valor);
//         // System.out.println(raiz.puntero.puntero.valor);
//         Caja copiaRaiz = raiz;
//         while(copiaRaiz != null) {
//             System.out.println(copiaRaiz.valor);
//             copiaRaiz = copiaRaiz.puntero;
//         }
//     }
// }
// class Programa {
//     public static void main (String [] args) {
//         Pila pila = new Pila();
//         pila.insertar("Fritos");
//         pila.insertar("Doritos");
//         pila.insertar("Churrumais");
//         pila.insertar("Cheetos");
//         pila.insertar("Rufles");
//         pila.insertar("Chipotles");
//         pila.listar();
//     }
// }

class Elemento {
    String valor;
    Elemento siguienteElemento;

    Elemento(String valor) {
        this.valor = valor;
    }
}

class Lista {
    Elemento principal; // new mangos1

    void agregarElemento(String valor) {
        Elemento nuevoElemento = new Elemento(valor); // valor.. sien

        if (principal == null) {
            principal = nuevoElemento;
        } else {
             nuevoElemento.siguienteElemento = principal;
            principal = nuevoElemento;
        }
    } 

    void extraer() {
        if (principal != null) {
            principal = principal.siguienteElemento;
        }
    }

    void listar() {
        Elemento copy = principal;

        while(copy != null) {
            System.out.println(copy.valor);
            copy = copy.siguienteElemento;
        }
    }

    void eliminarElemento() {
        if (principal != null) {
            principal = null;
        }
    } 
}


class Programa {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.agregarElemento("mangos1"); 
        lista.agregarElemento("mangos2"); 
        lista.agregarElemento("mangos3"); 

        lista.extraer();
        lista.listar();


        //System.out.println(lista.principal.valor);
    }
}