//PROGRAMA que pida el nombre de una persona, depues su edad , despues cuanto dinero tiene , nombre de la mascota y edad + 12 000
import java.util.Scanner;

class Programa {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame tu nombre: ");
        String nombre = scanner.next();

        System.out.print("Dame tu edad: ");
        int edad = scanner.nextInt();

        System.out.print("Dime cuanto dinero tienes: ");
        double dinero = scanner.nextDouble();

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tienes esto de dineros: " + dinero);

        System.out.print("Dame el nombre de tu mascota: ");
        String nombreMascota = scanner.next();

        System.out.print("Dame la edad de tu mascota: ");
        int edadMascota = scanner.nextInt();

        System.out.println("Tu mascota se llama: " + nombreMascota);
        System.out.println("Tu mascota tiene esta edad: "+edadMascota);

        edad = edad + 12000;
        edadMascota = edadMascota + 12000;
        System.out.println("Edad de persona + 1200 = " + edad);
        System.out.println("Edad de mascota + 1200 = " + edadMascota);

        int noClase = 4;
        System.out.println("Estamos en la clase numero " + noClase);

        System.out.println("Dime en qué numero de clase te gustaria estar? ");
        int noClaseDeseada = scanner.nextInt();

        System.out.println("El numero de clase que te gustaria estar es: " + noClaseDeseada);

    }
}