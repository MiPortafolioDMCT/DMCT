import java.util.Scanner;

class Programa {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean expresion = true;
        int contador = 0;
        String part1 = "2 x ";
        String part2 = " = ";
        String resultado = "";

        while (expresion) {
            contador++;
            int producto = 2*contador;
            resultado = resultado + part1 + contador + part2 + producto + "\n";
            if (contador == 15) {
                expresion = false;
            }
        }
        System.out.println(resultado);
    }
}