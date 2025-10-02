import java.util.Scanner;

abstract class Persona {
    String nombre;

    Persona(String n) {
        this.nombre = n;
    }

    public abstract void perder();
    public abstract void ganar();
}

class Jugador extends Persona {
    Jugador(String nombre){  
        super(nombre);
    }

    void colocarBarcos(Tablero tablero){
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i < 6; i++){
            System.out.println("Ingresa el numero de la fila");
            int fila = scanner.nextInt();

            System.out.println("Ingresa el numero de la columna");
            int columna = scanner.nextInt();

            for (int f = 0; f < 10; f++) {
                for (int c = 0; c < 10; c++) {
                    if(fila == f && columna == c ) {
                        tablero.matriz[f][c] = 'B';
                    }
                }
            }
            System.out.println("Barco numero " + i + " agregado correctamente en la cordenada " + fila + "," + columna);
        }
    }

    void atacar(Tablero tablero){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero de la fila que quieres atacar");
        int fila = scanner.nextInt();

        System.out.println("Ingresa el numero de la columna que quieres atacar");
        int columna = scanner.nextInt();

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                if(fila == f && columna == c ) {
                    if(tablero.matriz[f][c] == 'B') {
                        tablero.matriz[f][c] = 'X';
                        System.out.println("Le has atinado al barco enemigo!!");
                    } else {
                        System.out.println("Haz fallado, turno de tu oponente");   
                    }
                }
            }
        }
    }

    @Override
    public void perder(){
        System.out.println(this.nombre + " ha perdido.");
    }

    @Override
    public void ganar(){
        System.out.println(this.nombre + " es el ganador :)");
    }
}

class Tablero {
    char [][] matriz = new char[10][10];

        Tablero() {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    matriz[i][j] = '*';
                }
            }
        }


    void mostrar(Tablero tablero){
        int contFila = 0;
        int contColum = 0;
        while (contFila < 10) {
            while (contColum < 10) {
                System.out.print(matriz[contFila][contColum]);
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }
    }

    boolean verificarExistenciaBarcos() {
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                if (matriz[f][c] == 'B') {
                    return true; 
                }
            }
        }
        return false;
    }
}

class Mesa {
    Jugador [] jugadores;
    Tablero [] tableros;

    Mesa() {
        jugadores = new Jugador[2];
        tableros = new Tablero[2];
    }

    Jugador crearJugador(String nombre) {
        Jugador nuevoJugador = new Jugador(nombre);
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = nuevoJugador;
                System.out.println("Se creó " + jugadores[i].nombre);
                break;
            }
        }
        return nuevoJugador;
    }

    Tablero crearTablero() {
        Tablero nuevoTablero = new Tablero();
        for (int i = 0; i < tableros.length; i++) {
            if (tableros[i] == null) {
                tableros[i] = nuevoTablero;
                System.out.println("Se creó un nuevo tablero");
                break;
            }
        }
        return nuevoTablero;
    }

}


class Programa {
    public static void main(String [] args) { 
        
        Mesa mesa = new Mesa();

        Jugador jugador1 = mesa.crearJugador("Jugador1");
        Tablero tablero1 = mesa.crearTablero();

        tablero1.mostrar(tablero1);
        System.out.println();
        jugador1.colocarBarcos(tablero1);
        System.out.println();
        System.out.println("Tablero de " + jugador1.nombre);
        tablero1.mostrar(tablero1);

        System.out.println();

        Jugador jugador2 = mesa.crearJugador("Jugador2");
        Tablero tablero2 = mesa.crearTablero();

        tablero2.mostrar(tablero2);
        System.out.println();
        jugador2.colocarBarcos(tablero2);
        System.out.println();
        System.out.println("Tablero de " + jugador2.nombre);
        tablero2.mostrar(tablero2);

        // jugador1.atacar(tablero2);
        // tablero2.mostrar(tablero2);

        boolean juegoActivo = true;
        boolean turnoJugador1 = true; 

        while (juegoActivo) {
            if (turnoJugador1) {
                System.out.println("Turno de " + jugador1.nombre);
                jugador1.atacar(tablero2);
                System.out.println("Tablero de " + jugador2.nombre + " después del ataque:");
                tablero2.mostrar(tablero2);

                if (!tablero2.verificarExistenciaBarcos()) {
                    jugador2.perder();
                    jugador1.ganar();
                    juegoActivo = false;
                }
            } else {
                System.out.println("Turno de " + jugador2.nombre);
                jugador2.atacar(tablero1);
                System.out.println("Tablero de " + jugador1.nombre + " después del ataque:");
                tablero1.mostrar(tablero1);

                if (!tablero1.verificarExistenciaBarcos()) {
                    jugador1.perder();
                    jugador2.ganar();
                    juegoActivo = false;
                }
            }
            turnoJugador1 = !turnoJugador1;
        }
    }
}