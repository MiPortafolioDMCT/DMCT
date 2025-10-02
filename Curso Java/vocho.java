class Vocho {
    String modelo; 
    String color;
    String tamanio;

    Vocho (String m, String c, String t) {
        modelo = m;
        color = c;
        tamanio = t;
    } 

    void arrancar() {
        System.out.println("El vocho de modelo "+ modelo +" está arrancando");
    }
    void avanzar() {
        System.out.println("El vocho es de color " + color +" y está avanzando");
    }
    void acelerar() { 
        System.out.println("El vocho está acelerando");
    }
    void frenar() { 
        System.out.println("El vocho está frenando");
    }
    void detenerse() { 
        System.out.println("El vocho está deteniendose");
    }
}

class Motocicleta {
    String modelo; 
    String color;
    String tamanio;

    Motocicleta (String m, String c, String t) {
        modelo = m;
        color = c;
        tamanio = t;
    } 

    void arrancar() {
        System.out.println("La motocicleta de modelo "+ modelo +" está arrancando");
    }
    void avanzar() {
        System.out.println("La motocicleta es de color " + color +" y está avanzando");
    }
    void acelerar() { 
        System.out.println("La motocicleta está acelerando");
    }
    void frenar() { 
        System.out.println("La motocicleta está frenando");
    }
    void detenerse() { 
        System.out.println("La motocicleta está deteniendose");
    }
}

class Ferrari {
    String modelo; 
    String color;
    String tamanio;

    Ferrari (String m, String c, String t) {
        modelo = m;
        color = c;
        tamanio = t;
    } 

    void arrancar() {
        System.out.println("El Ferrari de modelo "+ modelo +" está arrancando");
    }
    void avanzar() {
        System.out.println("El Ferrari es de color " + color +" y está avanzando");
    }
    void acelerar() { 
        System.out.println("El Ferrari está acelerando");
    }
    void frenar() { 
        System.out.println("El Ferrari está frenando");
    }
    void detenerse() { 
        System.out.println("El Ferrari está deteniendose");
    }
}

class Programa {
    public static void main (String [] args) { 
        Vocho vocho = new Vocho("nissan","negro","normal"); 
        Motocicleta motocicleta = new Motocicleta("italika","rojo","chica"); 
        Ferrari ferrari = new Ferrari("Superfast","azul","normal"); 
        vocho.arrancar();
        motocicleta.arrancar();
        ferrari.arrancar();

        vocho.avanzar();
        motocicleta.avanzar();
        ferrari.avanzar();

        ferrari.acelerar();

        vocho.frenar();
        motocicleta.frenar();
        ferrari.frenar();
        
        vocho.detenerse();
        motocicleta.detenerse();
        ferrari.detenerse();

        System.out.println("El ferrari ha ganado");
    }
}