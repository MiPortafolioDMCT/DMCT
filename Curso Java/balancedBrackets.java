class LlaveAbre {
    char valor;
    LlaveAbre anterior;

    LlaveAbre(char valor){
        this.valor = valor;
    }
}

class Pila {
    LlaveAbre principal;

    void insertar(char valor) {
        LlaveAbre nuevaLlave = new LlaveAbre(valor);

        nuevaLlave.anterior = principal;
        principal = nuevaLlave;
    }

    void extraer(){ 
        principal = principal.anterior;
    }

    char ultimoElemento() {
        char ultimoElemento = ' ';
        if(!estaVacia()) {
            ultimoElemento = principal.valor;
        } else {
            ultimoElemento = '/';
        }

        return ultimoElemento;
    }

    boolean estaVacia() {
        return principal == null;
    }
    
}

class Programa {
    public static String isBalanced(String s) {
        Pila pila = new Pila();
        int cont = 0;
        String response = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                pila.insertar(s.charAt(i));
            } else if(s.charAt(i) == ']') {
                if(pila.ultimoElemento() == '[') {
                    pila.extraer();
                } else {
                    cont++;
                }
            } else if(s.charAt(i) == ')') {
                if(pila.ultimoElemento() == '(') {
                    pila.extraer();
                } else {
                    cont++;
                }
            } else if(s.charAt(i) == '}') {
                if(pila.ultimoElemento() == '{') {
                    pila.extraer();
                } else {
                    cont++;
                }
            }
        }

        if(pila.estaVacia() && cont == 0){
            response = "YES"; 
        } else {
            response = "NO";
        }

        return response;
    }

    public static void main(String [] args) {

        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("{{[[(())]]}}"));
        
    }
}