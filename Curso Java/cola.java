class Nodo {
    int number;
    Nodo next;

    Nodo(int number) {
        this.number = number;
    }
}

class Cola {
    Nodo root, frente;

    void add(int number) {
        Nodo nodo = new Nodo(number);

        if (root == null) {
            frente = nodo;
            root = nodo;
        } else {
            root.next = nodo;
            root = nodo;
        }
    }


    void list() {
        Nodo copy = frente;
        while(copy != null) {
            System.out.println(copy.number);
            copy = copy.next;
        }
    }
}

class Programa {
    public static void main(String [] args) {
        Cola cola = new Cola();

        cola.add(1);
        cola.add(2);
        cola.add(3);

        cola.list();
    }

}