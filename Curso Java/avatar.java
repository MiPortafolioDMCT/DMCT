interface Fallecible {
    void morir();
}

abstract class SerVivo {
    String nombre;

    SerVivo(String n) {
        this.nombre = n;
    }

    public abstract void saltar();
}

class Avatar extends SerVivo implements Fallecible {
    private Direhorse[] direhorses;
    private Arco[] arcos;

    public Avatar(String nombre) {
        super(nombre);
        this.direhorses = new Direhorse[2];
        this.arcos = new Arco[2];
    }

    public void correr() {
        System.out.println("Avatar " + this.nombre + " está corriendo");    
    }

    public void atacar() {
        System.out.println("Avatar " + this.nombre + " está atacando"); 
    }

    public Direhorse crearDirehorse(String nombre, Avatar avatar) {
        Direhorse nuevoDirehorse = new Direhorse(nombre);

        for (int i = 0; i < this.direhorses.length; i++) {
            if (this.direhorses[i] == null) {
                this.direhorses[i] = nuevoDirehorse;
                System.out.println(avatar.nombre +" ha creado un vinculo con el Direhorse " + this.direhorses[i].nombre);
                break;
            }
        }
        return nuevoDirehorse;
    }

    public Arco crearArco(Avatar avatar, String nombre, String tamanio) {
        Arco nuevoArco = new Arco(nombre, tamanio);

        for (int i = 0; i < this.arcos.length; i++) {
            if (this.arcos[i] == null) {
                this.arcos[i] = nuevoArco;
                System.out.println(avatar.nombre + " ha creado un " + this.arcos[i].nombre + " " + this.arcos[i].tamanio);
                break;
            }
        }
        return nuevoArco;
    }

    @Override
    public void morir() {
        System.out.println(this.nombre + " ha fallecido");
    }

    @Override
    public void saltar() {
        System.out.println(this.nombre + " saltando del Direhorse");
    }
}

class Humano extends SerVivo implements Fallecible {
    private Arma[] armas;

    public Humano(String nombre) {
        super(nombre);
        this.armas = new Arma[3];
    }

    public void subirAlAvion() {
        System.out.println(this.nombre + " está subiendo al avion");    
    }

    public void disparar() {
        System.out.println(this.nombre + " está disparando");
    }

    public Arma crearArma(Humano humano, String modelo, int kalibre) {
        Arma nuevaArma = new Arma(modelo, kalibre);

        for (int i = 0; i < this.armas.length; i++) {
            if (this.armas[i] == null) {
                this.armas[i] = nuevaArma;
                System.out.println(humano.nombre + " ha creado el arma modelo: " + this.armas[i].modelo + " de kalibre " + this.armas[i].kalibre);
                break;
            }
        }
        return nuevaArma;
    }

    public void deshecharArma(Arma arma) {
        for (int i = 0; i < this.armas.length; i++) {
            this.armas[i] = null;
        }
        System.out.println(this.nombre + " Se deshizo de su arma " + arma.modelo + " de kalibre " + arma.kalibre);
    }

    @Override
    public void morir() {
        System.out.println(this.nombre + " ha fallecido");
    }

    @Override
    public void saltar() {
        System.out.println(this.nombre + " saltando del avion");
    }
}

class Direhorse extends SerVivo implements Fallecible {
    public Direhorse(String nombre) {
        super(nombre);
    }

    @Override
    public void morir() {
        System.out.println(this.nombre + " ha fallecido");
    }
    
    @Override
    public void saltar() {
        System.out.println("Direhorses saltando");
    }
}

class Arma {
    public String modelo;
    public int kalibre;

    public Arma(String m, int k) {
        this.modelo = m;
        this.kalibre = k;
    }
}

class Arco {
    public String nombre;
    public String tamanio;

    public Arco(String n, String t) {
        this.nombre = n;
        this.tamanio = t;
    }
}

class Avion {
    private String nombre;
    private String codigo;
    private Humano[] humanos;

    public Avion(String n, String c) {
        this.nombre = n;
        this.codigo = c;
        this.humanos = new Humano[3];
    }

    public void elevar() {
        System.out.println("El avión " + this.nombre + " de codigo " + this.codigo + " se está elevando");
    }

    public void aterrizar() {
        System.out.println("El avión " + this.nombre + " de codigo " + this.codigo + " se está aterrizando");
    }

    public Humano crearHumano(String nombre) {
        Humano nuevoHumano = new Humano(nombre);

        for (int i = 0; i < this.humanos.length; i++) {
            if (this.humanos[i] == null) {
                this.humanos[i] = nuevoHumano;
                System.out.println("Se ha creado el humano " + this.humanos[i].nombre + " dentro del avion");
                break;
            }
        }
        return nuevoHumano;
    }
}

class Programa {
    public static void main(String[] args) {
        Avion avion = new Avion("avioncito","AAA1");
        avion.elevar();

        Avatar ava1 = new Avatar("Jake Sully");
        Direhorse direhorse = ava1.crearDirehorse("Tsaheylu", ava1);

        ava1.crearArco(ava1, "arco", "grande");

        Avatar ava2 = new Avatar("Neytiri");
        Direhorse direhorse2 = ava2.crearDirehorse("Eywa", ava2);
        ava2.crearArco(ava2, "arco v2", "mediano");

        Humano humano1 = avion.crearHumano("José");
        Arma arma1 = humano1.crearArma(humano1, "Browning M2", 50);

        Humano humano2 = avion.crearHumano("Carlos");
        Arma arma2 = humano2.crearArma(humano2, "Glock", 17);

        ava1.saltar();
        ava2.saltar();
        humano1.saltar();
        humano2.saltar();

        humano1.disparar();
        humano1.deshecharArma(arma1);

        ava1.atacar();

        avion.aterrizar();

        humano1.subirAlAvion();
        humano2.subirAlAvion();

        avion.elevar();
    }
}
