class Disco {
    int valor;
    Disco debajo;

    Disco(int valor) {
        this.valor = valor;
    }
}

class Torre {
    Disco principal;
    
    void insertar(int valor) {
        Disco nuevoDisco = new Disco(valor);
        nuevoDisco.debajo = principal;
        principal = nuevoDisco;
    }

    void extraer() {
        if (principal != null) {
            principal = principal.debajo;
        }
    }

    int ultimoElemento() {
        if (principal != null) {
            return principal.valor;
        } else {
            return 1;
        }
    }

    boolean estaVacia() {
        return principal == null;
    }

    int totalDiscos() {
        int contador = 0;
        Disco copia = principal;
        
        while (copia != null) {
            contador++;
            copia = copia.debajo;
        }
        
        return contador;
    }
}

class Programa {
    public static void main(String[] args) {
        Torre torre1 = new Torre();
        Torre torre2 = new Torre();
        Torre torre3 = new Torre();
        int contMovimientos = 1;

        // torre1.insertar(5);
        torre1.insertar(4);
        torre1.insertar(3);
        torre1.insertar(2);
        torre1.insertar(1);

        int totalDiscos = torre1.totalDiscos();

        if (totalDiscos % 2 == 0) {
            while(!torre1.estaVacia() || !torre2.estaVacia()) {
                
            }
        } else {
            while(!torre1.estaVacia() || !torre2.estaVacia()) {
                
                contMovimientos++;
            }
        }
    }
}