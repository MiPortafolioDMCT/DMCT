import java.util.Scanner;
// class Programa {
//     static boolean esPalindromo(String palabra) {
//         boolean response = false;
//         String palabraNueva = "";
        
//         for (int i = 0; i < palabra.length(); i++) {
//             if (palabra.charAt(i) != ' ') {
//                 char letra = palabra.charAt(i);
//                 palabraNueva = palabraNueva + letra;
//             }
//         }

//         for (int i = 0; i < palabraNueva.length() / 2; i++) {
//             if (palabraNueva.charAt(i) != palabraNueva.charAt(palabraNueva.length() - 1 - i)) {
//                 response = false; 
//             } else {
//                 response = true;
//             }
//         }
//         return response;
//     }

//     public static void main(String [] args) {

//         System.out.println(esPalindromo("amo la paloma"));
//         System.out.println(esPalindromo("la ruta natural"));
//         System.out.println(esPalindromo("a mama roma le aviva el amor a mama"));
//         System.out.println(esPalindromo("dulce"));
//         System.out.println(esPalindromo("hola"));
//     }
// }

class Programa {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String triangulo = "";

        System.out.print("De que tamaño quieres el triangulo?: ");
        int tamanio = scanner.nextInt();


        for (int i = (tamanio+1)/2 ; i > 0; i--) {

            triangulo = triangulo + "*";

            System.out.println(triangulo);

        }
        System.out.println(triangulo.length());

       
        //System.out.println(triangulo);
        // String nueva = triangulo;
        // nueva.charAt(0) = ' ';

        // System.out.println(nueva);
        // for (int i = tamanio; i > 0; i--) {
        //     triangulo.charAt(i) = ' ';
        //     triangulo.charAt() = ' ';    
        //     System.out.println(triangulo);          
        // }        // }
        // }
        // }
        // }


    }
}