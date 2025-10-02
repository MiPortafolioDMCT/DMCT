import java.util.Scanner;

class Programa {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        //int edad = 19;
        if(edad < 12){
            System.out.println("Niño");
        } else {
            if(edad >= 12 && edad <= 17){
                System.out.println("Adolescente");
            } else {
                if (edad >= 18 && edad <= 64){
                    System.out.println("Adulto");
                } else {
                    if(edad >= 65) {
                        System.out.println("Adulto mayor");
                    }
                }
            }
        }
        
    }

}