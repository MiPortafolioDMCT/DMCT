import java.util.Scanner;

class Programa {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Triangulo ");
        System.out.println("2. Cuadrado");
        System.out.println("3. Rectángulo");
        System.out.println("4. Trapecio");
        System.out.print("Dame el número de la figura a la que le quieres sacar el área: ");
        int respuesta = scanner.nextInt();
        
        if ( respuesta == 1 ) {
            System.out.print("Dame la base: ");
            double base = scanner.nextDouble();

            System.out.print("Dame la altura: ");
            double altura = scanner.nextDouble();

            double area = (base * altura) / 2;
            System.out.println("Area: " + area);
        } else {
            if ( respuesta == 2 || respuesta == 3 ) {
                System.out.print("Dame el largo: ");
                double largo = scanner.nextDouble();

                System.out.print("Dame el ancho: ");
                double ancho = scanner.nextDouble();

                double area = largo * ancho;
                System.out.println("Area: " + area);
            } else {
                if ( respuesta == 4 ) {
                    System.out.print("Dame la base menor: ");
                    double bMenor = scanner.nextDouble();

                    System.out.print("Dame la base mayor: ");
                    double bMayor = scanner.nextDouble();

                    System.out.print("Dame la altura: ");
                    double altura = scanner.nextDouble();

                    double area = (( bMayor + bMenor ) * altura) / 2;
                    System.out.println("Area: " + area);
                } 
            }
        }   
    }
}