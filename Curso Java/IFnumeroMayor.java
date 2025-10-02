import java.util.Scanner;

class Programa {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        // int num1 = 6;
        // int num2 = 8;
        // int num3 = 3;
        int numeroMayor = 0;

        if(num1 < num2){
            if(num1 < num3){
                if(num2 < num3){
                    numeroMayor = num3;
                    System.out.println(num1+ ", " + num2+ ", " + num3);
                    System.out.println("Numero mayor: " + numeroMayor);
                } else {
                    numeroMayor = num2;
                    System.out.println(num1+ ", " + num3+ ", " + num2);
                    System.out.println("Numero mayor: " + numeroMayor);
                }
            }else {
                numeroMayor = num2;
                System.out.println(num3+ ", " + num1+ ", " + num2);
                System.out.println("Numero mayor: " + numeroMayor);
            }
        } else {
            if(num1 < num3){
                if(num2 < num3){
                    numeroMayor = num3;
                    System.out.println(num2+ ", " + num1+ ", " + num3);
                    System.out.println("Numero mayor: " + numeroMayor);
                } else {
                    numeroMayor = num1;
                    System.out.println(num3+ ", " + num2+ ", " + num1);
                    System.out.println("Numero mayor: " + numeroMayor);
                }
            }else {
                numeroMayor = num1;
                System.out.println(num2+ ", " + num3+ ", " + num1);
                System.out.println("Numero mayor: " + numeroMayor);
            }
        }
    }

}