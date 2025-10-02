import java.util.Scanner;

class Programa {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        boolean expresion = true;
        double suma = 0;
        double promedio = 0;
        int contador = 0;

        while (expresion) {
            System.out.print("Dame una calificación: ");
            double calificacion = scanner.nextDouble();
            
            suma = suma + calificacion;
            contador++;

            if (contador == 10) {
                expresion = false;
                promedio = suma / contador;

                if (promedio > 7) {
                    System.out.println("Ingresaste " + contador + " calificaciones y el promedio es: " + promedio);
                }
            }
        } 
    }
}