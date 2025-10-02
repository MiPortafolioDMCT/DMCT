import java.util.Scanner;

class Programa {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean expresion = true;
        int contador = 0;

        do {
            contador++;
            System.out.println("1 x " + contador + " = " + 1 * contador);

            if (contador == 15) {
                expresion = false;
            }
        } while (expresion);

        expresion = true;
        contador = 1;

        do {
            contador++;
            System.out.println("2 x " + contador + " = " + 2 * contador);

            if (contador == 15) {
                expresion = false;
            }
        } while (expresion);

        expresion = true;
        contador = 1;

        do {
            contador++;
            System.out.println("3 x " + contador + " = " + 3 * contador);

            if (contador == 15) {
                expresion = false;
            }
        } while (expresion); 

        expresion = true;
        contador = 1;

        do {
            contador++;
            System.out.println("4 x " + contador + " = " + 4 * contador);

            if (contador == 15) {
                expresion = false;
            }
        } while (expresion);
    }
}