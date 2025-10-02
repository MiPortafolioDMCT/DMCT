// class Ejercicio {
//     void esPalindromo(String texto) {
//         // System.out.println(texto);
//         char [] caracteres = {'H','o','l','a'};

//         System.out.println(caracteres);
//     }
// }

// class MyString {
//     char [] caracteres;

//     MyString(char [] caracteres) {
//         this.caracteres = caracteres;
//     }

//     char conocerValor(int index) {
//         return caracteres[index];
//     }

//     int conocerCantidad() {
//         tamanio = caracteres.length;
//         return tamanio;
//     }
// }

class Programa {
    static boolean esPalindromo(String palabra) {
        boolean response = false;
        String palabraNueva = "";
        
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) != ' ') {
                char letra = palabra.charAt(i);
                palabraNueva = palabraNueva + letra;
            }
        }

        for (int i = 0; i < palabraNueva.length() / 2; i++) {
            if (palabraNueva.charAt(i) != palabraNueva.charAt(palabraNueva.length() - 1 - i)) {
                response = false; 
            } else {
                response = true;
            }
        }
        return response;
    }

    public static void main(String [] args) {

        System.out.println(esPalindromo("amo la paloma"));
        System.out.println(esPalindromo("la ruta natural"));
        System.out.println(esPalindromo("a mama roma le aviva el amor a mama"));
        System.out.println(esPalindromo("dulce"));
        System.out.println(esPalindromo("hola"));
    }
}