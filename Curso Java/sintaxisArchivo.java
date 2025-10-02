class Programa {
    public static void main (String [] args){
        System.out.println("Hola. soy Dul");
    }
}

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextItn();
        
        if(numero > 20){    
            System.out.print("Es mayor a 20: ");
        }
    }
}