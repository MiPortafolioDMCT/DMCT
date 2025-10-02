import java.util.Scanner;

class Programa {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean expresion = true;
        int contador = 0;

        while (expresion) {
            contador++;
            System.out.println("1 x " + contador + " = " + 1 * contador);

            if (contador == 15) {
                expresion = false;
            }
        }

        expresion = true;
        contador = 1;

        while (expresion) {
            contador++;
            System.out.println("2 x " + contador + " = " + 2 * contador);

            if (contador == 15) {
                expresion = false;
            }
        }

        expresion = true;
        contador = 1;

        while (expresion) {
            contador++;
            System.out.println("3 x " + contador + " = " + 3 * contador);

            if (contador == 15) {
                expresion = false;
            }
        }

        expresion = true;
        contador = 1;

        while (expresion) {
            contador++;
            System.out.println("4 x " + contador + " = " + 4 * contador);

            if (contador == 15) {
                expresion = false;
            }
        }
    }
}
class Programa1 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean expresion = true;
        boolean expresion4 = true;
        int contador = 0;
        int cont4 = 1;

        // while (expresion4){
        //     while (expresion) {
        //         contador++;
        //         System.out.println(cont4 + " x " + contador + " = " + cont4 * contador);

        //         if (contador == 15) {
        //             expresion = false;
        //         }
        //     }
        //     contador = 0;
        //     expresion = true;
        //     cont4++;
        //     if (cont4 == 5) {
        //         expresion4 = false;
        //     }
        // }

        do {
            do {
                contador++;
                System.out.println(cont4 + " x " + contador + " = " + cont4 * contador);

                if (contador == 15) {
                    expresion = false;
                }
            } while (expresion);
            contador = 0;
            expresion = true;
            cont4++;
            if (cont4 == 5) {
                expresion4 = false;
            }
        } while (expresion4);
    }
}