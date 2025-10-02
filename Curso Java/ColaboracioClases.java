interface Sentimiento {
    void desear();
    void alegrar();
}

abstract class Persona {
    protected String nombre;
    private int edad;

    Persona(String n, int e) {
        this.nombre = n;
        this.edad = e;
    }

    public abstract void apurar();
}

class Panadero extends Persona implements Sentimiento {
    Panadero(String nombre, int edad) {
        super(nombre, edad);
    }

    public void crearPan(Charola charola, String nombre, String tamanio) {
        Pan nuevoPan = new Pan(nombre, tamanio);

        for (int i = 0; i < charola.obtenerPanes().length; i++) {
            if (charola.obtenerPanes()[i] == null) {
                charola.obtenerPanes()[i] = nuevoPan;
                System.out.println("El panadero ha creado el pan de " + nombre + " y lo ha añadido a la charola: " + charola.obtenerTipoPan());
                break;
            }
        }
    }

    @Override
    public void desear() {
        System.out.println("Panadero deseando que se vendan todos sus panes");
    }

    @Override
    public void alegrar() {
        System.out.println("Panadero alegrándose porque llegan muchos clientes");
    }

    @Override
    public void apurar() {
        System.out.println("El panadero está apurándose con su chamba");
    }
}

class Ayudante extends Persona implements Sentimiento {
    Ayudante(String nombre, int edad) {
        super(nombre, edad);
    }

    public void venderPanes(Charola charola) {
        for (int i = 0; i < charola.obtenerPanes().length; i++) {
            charola.obtenerPanes()[i] = null;
        }
        System.out.println("Se vendieron los panes de tipo " + charola.obtenerTipoPan() + " y la charola está vacía");
    }

    @Override
    public void desear() {
        System.out.println("Ayudante deseando que llegue la hora de salida");
    }

    @Override
    public void alegrar() {
        System.out.println("Ayudante alegrándose por vender muy bien");
    }

    @Override
    public void apurar() {
        System.out.println("El ayudante está apurándose con a chalanear");
    }
}

class Charola {
    private String tamanio;
    private String tipoPan;
    private Pan[] panes;

    Charola(String tamanio, String tipoPan) {
        this.tamanio = tamanio;
        this.tipoPan = tipoPan;
        this.panes = new Pan[3];
    }

    public Pan[] obtenerPanes() {
        return panes;
    }

    public String obtenerTipoPan() {
        return tipoPan;
    }

    public void listarPanes(Charola charola) {
        System.out.println("Nombre de panes de tipo " + tipoPan + ": ");
        for (int i = 0; i < panes.length; i++) {
            if (panes[i] != null) {
                System.out.println(i + 1 + ".- " + panes[i].obtenerNombre() + " (" + panes[i].obtenerTamanio() + ")");
            }
        }
    }
}

class Pan {
    private String nombre;
    private String tamanio;

    Pan(String nombre, String tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTamanio() {
        return tamanio;
    }
}

class Panaderia {
    private String nombre;
    private String ubicacion;
    private Panadero[] panaderos;
    private Ayudante[] ayudantes;
    private Charola[] charolas;

    Panaderia(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.panaderos = new Panadero[2];
        this.ayudantes = new Ayudante[2];
        this.charolas = new Charola[2];
    }

    public void abrirPanaderia() {
        System.out.println("Bienvenidos a la panadería '" + nombre + "' en " + ubicacion);
    }

    public void cerrarPanaderia() {
        System.out.println("La panadería '" + nombre + "' ha cerrado porque se vendieron todos los panes");
    }

    public Panadero crearPanadero(String nombre, int edad) {
        Panadero nuevoPanadero = new Panadero(nombre, edad);
        for (int i = 0; i < panaderos.length; i++) {
            if (panaderos[i] == null) {
                panaderos[i] = nuevoPanadero;
                System.out.println("Se ha creado el panadero " + nuevoPanadero.nombre);
                break;
            }
        }
        return nuevoPanadero;
    }

    public Ayudante crearAyudante(String nombre, int edad) {
        Ayudante nuevoAyudante = new Ayudante(nombre, edad);
        for (int i = 0; i < ayudantes.length; i++) {
            if (ayudantes[i] == null) {
                ayudantes[i] = nuevoAyudante;
                System.out.println("Se ha creado el ayudante " + nuevoAyudante.nombre);
                break;
            }
        }
        return nuevoAyudante;
    }

    public Charola crearCharola(String tamanio, String tipoPan) {
        Charola nuevaCharola = new Charola(tamanio, tipoPan);
        for (int i = 0; i < charolas.length; i++) {
            if (charolas[i] == null) {
                charolas[i] = nuevaCharola;
                break;
            }
        }
        return nuevaCharola;
    }
}

class Programa {
    public static void main(String[] args) {
        Panaderia panaderia1 = new Panaderia("Tia Rosa", "Zacapoaxtla");
        panaderia1.abrirPanaderia();
        
        Panadero panadero = panaderia1.crearPanadero("Dulce", 22);

        Ayudante ayudante = panaderia1.crearAyudante("María", 22);

        Charola charolaConchas = panaderia1.crearCharola("Grande", "Conchas");

        panadero.crearPan(charolaConchas, "Concha de Chocolate", "Grande");
        panadero.crearPan(charolaConchas, "Concha de Vainilla", "Mediana");

        
        Charola charolaCuernitos = panaderia1.crearCharola("Mediana", "Cuernitos");

        panadero.crearPan(charolaCuernitos, "Cuernito", "Mediano");
        panadero.desear();
        ayudante.desear();

        //panaderia1.listarTiposDePan();
        charolaConchas.listarPanes(charolaConchas);
        charolaCuernitos.listarPanes(charolaCuernitos);

        ayudante.venderPanes(charolaConchas);
        charolaConchas.listarPanes(charolaConchas);
        charolaCuernitos.listarPanes(charolaCuernitos);

        panadero.crearPan(charolaCuernitos, "Cuernito2", "chico");
        panadero.crearPan(charolaConchas, "Concha de Chococrispis", "chico");
        panadero.crearPan(charolaConchas, "Concha de fresa", "grande");

        charolaConchas.listarPanes(charolaConchas);
        charolaCuernitos.listarPanes(charolaCuernitos);

        ayudante.venderPanes(charolaConchas);
        ayudante.venderPanes(charolaCuernitos);

        panaderia1.cerrarPanaderia();
    }
}
