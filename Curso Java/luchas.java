class Karateca {
    String nombre; 
    int edad;
    int peso;

    Karateca (String n, int e, int p) {
        nombre = n;
        edad = e;
        peso = p;
    }

    void calentar() {
        System.out.println("El Karateca se llama " + nombre + " y está calentando");
    }
    void golpear() {
        System.out.println("El Karateca está golpenado");
    }
    void patear() {
        System.out.println("El Karateca está pateando");
    }
    void noquear() { 
        System.out.println("El Karateca está noqueando");
    }
    void esquivar() { 
        System.out.println("El Karateca está esquivando el ataque");
    }
}

class Luchador {
    String nombre; 
    int edad;
    int peso;

    Luchador (String n, int e, int p) {
        nombre = n;
        edad = e;
        peso = p;
    } 

    void calentar() {
        System.out.println("El luchador se llama " + nombre + " y está calentando");
    }
    void golpear() {
        System.out.println("El luchador está golpenado");
    }
    void patear() {
        System.out.println("El luchador está pateando");
    }
    void noquear() { 
        System.out.println("El luchador está noqueando");
    }
    void esquivar() { 
        System.out.println("El luchador está esquivando el ataque");
    }
}

class Boxeador {
    String nombre; 
    int edad;
    int peso;

    Boxeador (String n, int e, int p) {
        nombre = n;
        edad = e;
        peso = p;
    } 

    void calentar() {
        System.out.println("El boxeador se llama " + nombre + " y está calentando");
    }
    void golpear() {
        System.out.println("El boxeador está golpenado");
    }
    void patear() {
        System.out.println("El boxeador está pateando");
    }
    void noquear() { 
        System.out.println("El boxeador está noqueando");
    }
    void esquivar() { 
        System.out.println("El boxeador está esquivando el ataque");
    }
}


class Programa {
    public static void main (String [] args) { 
        Karateca karateca = new Karateca("Gama",20,69); 
        Luchador luchador = new Luchador("Dan",30,70); 
        Boxeador boxeador = new Boxeador("Daniel",24,64); 
        
        karateca.calentar();
        luchador.calentar();
        boxeador.calentar();

        karateca.golpear();
        luchador.esquivar();
        boxeador.patear();

        karateca.patear();
        luchador.golpear();
        boxeador.esquivar();
        
        boxeador.noquear();

        System.out.println("El boxeador ha ganado");
    }
}