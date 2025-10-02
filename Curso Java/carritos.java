// frenable

interface frenable { // interfaz
    public void detener(); //  operacion
}

class Ferrari implements frenable {
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
    
    @Override
    public void detener() {
        System.out.println("Las llantas del Ferrari se estan deteniendo");
    }  
}

class Vocho implements frenable {
    String modelo;
    String color;
    String tamanio;

    Vocho (String m, String c, String t) {
        modelo = m;
        color = c;
        tamanio = t;
    }

    public void arrancar() {
        System.out.println("El vocho de modelo "+ modelo +" está arrancando");
    }   

    public void avanzar() {
        System.out.println("El vocho es de color " + color +" y está avanzando");
    } 

    public void acelerar() {
        System.out.println("El vocho está acelerando");
    } 
    
    public void frenar() {
        System.out.println("El vocho está frenando");
    } 

    @Override
    public void detener() {
        System.out.println("El vocho se esta deteniendo");
    }  
}

class Tsuru implements frenable {
    String modelo;
    String color;
    String tamanio;

    Tsuru (String m, String c, String t) {
        modelo = m;
        color = c;
        tamanio = t;
    }

    public void arrancar() {
        System.out.println("El Tsuru de modelo "+ modelo +" está arrancando");
    }   

    public void avanzar() {
        System.out.println("El Tsuru es de color " + color +" y está avanzando");
    } 

    public void acelerar() {
        System.out.println("El Tsuru está acelerando");
    } 
    
    public void frenar() {
        System.out.println("El Tsuru está frenando");
    }
    
    @Override
    public void detener() {
        System.out.println("El Tsuru se esta deteniendo");
    }  
}

class Programa {
    public static void main(String [] args) { //  
        Vocho vocho = new Vocho("nissan","negro","normal"); 
        Tsuru tsuru = new Tsuru("AAA1","rojo","chica"); 
        Ferrari ferrari = new Ferrari("Superfast","azul","normal"); 
        vocho.arrancar();
        tsuru.arrancar();
        ferrari.arrancar();

        vocho.avanzar();
        tsuru.avanzar();
        ferrari.avanzar();

        ferrari.acelerar();

        vocho.frenar();
        tsuru.frenar();
        ferrari.frenar();
        
        vocho.detener();
        tsuru.detener();
        ferrari.detener();

        System.out.println("El ferrari ha ganado");
    }
}