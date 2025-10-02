import java.util.Scanner;

class Programa {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean expresion = true;
        int contador = 1;
        String nombre = "";
        String nombres = "";

        while (expresion) {
            System.out.print("Dame un nombre: ");
            nombre = scanner.next();

            nombres = nombres  + contador + ".- " + nombre + "\n";
            contador++;
            if (contador == 11) {
                expresion = false;
            }
        }

        do {
            System.out.print("Dame un nombre: ");
            nombre = scanner.next();

            nombres = nombres  + contador + ".- " + nombre + "\n";
            contador++;
            if (contador == 11) {
                expresion = false;
            }
        } while (expresion);
        
        System.out.println(nombres);
    }
}