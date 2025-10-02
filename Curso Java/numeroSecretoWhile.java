import java.util.Scanner;

class Programa {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean expresion = true;
        int numeroSecreto = 8;

        while (expresion) {
            System.out.print("Adivina el numero secreto: ");
            int numeroPropuesto = scanner.nextInt();

            if (numeroPropuesto == numeroSecreto) {
                expresion = false;

                System.out.println("Felicidades has adividano el numero secreto!");
            }
        } 
    }
}