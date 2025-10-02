import java.util.Scanner;

class Programa0 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nombres = new String[10]; 

        System.out.print("Dame un nombre: ");
        nombres[0] = scanner.next();

        System.out.print("Dame un nombre: ");
        nombres[1] = scanner.next();
        
        System.out.print("Dame un nombre: ");
        nombres[2] = scanner.next();

        System.out.print("Dame un nombre: ");
        nombres[3] = scanner.next();

        System.out.print("Dame un nombre: ");
        nombres[4] = scanner.next();

        System.out.print("Dame un nombre: ");
        nombres[5] = scanner.next();

        System.out.print("Dame un nombre: ");
        nombres[6] = scanner.next();

        System.out.print("Dame un nombre: ");
        nombres[7] = scanner.next();

        System.out.print("Dame un nombre: ");
        nombres[8] = scanner.next();

        System.out.print("Dame un nombre: ");
        nombres[9] = scanner.next();

        System.out.println("1.- " + nombres[0] + " Es el primero");
        System.out.println("2.- " + nombres[1]);
        System.out.println("3.- " + nombres[2]);
        System.out.println("4.- " + nombres[3]);
        System.out.println("5.- " + nombres[4]);
        System.out.println("6.- " + nombres[5]);
        System.out.println("7.- " + nombres[6]);
        System.out.println("8.- " + nombres[7]);
        System.out.println("9.- " + nombres[8]);
        System.out.println("10.- " + nombres[9] + " Es el último");
        nombres[1] = "DULCE";
        System.out.println("2.- " + nombres[1] + " Acualizado");
        nombres[2] = null;
        System.out.println("3.- " + nombres[2]);
    }
}

class Programa1 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nombres = new String[10]; 

        boolean expresion = true;
        int contador = 1;

        while (expresion) {
            System.out.print("Dame un nombre: ");
            nombres[contador-1] = scanner.next();

            contador++;
            if (contador == 11) {
                expresion = false;

            }
        }
        expresion = true;
        contador = 1;
        while (expresion) {
            
            System.out.println(contador + ".- " + nombres[contador-1]);
            contador++;
            if (contador == 11) {
                expresion = false;

            }
        }
    }
}

class Programa2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] calificaciones = new double[10]; 

        boolean expresion = true;
        int contador = 1;
        double suma = 0.0;
        double promedio = 0.0;

        while (expresion) {
            System.out.print("Dame una calificación: ");
            calificaciones[contador-1] = scanner.nextDouble();
            suma = suma + calificaciones[contador-1];
            contador++;
            if (contador == 8) {
                expresion = false;

            }
        }
        promedio = suma / (contador-1);
        expresion = true;
        contador = 1;
        System.out.println("El promedio es: " + promedio);

        while (expresion) {
            System.out.println(contador + ".- " + calificaciones[contador-1]);
            contador++;
            if (contador == 8) {
                expresion = false;
            }
        }
    }
}

class ProgramaNumMayor {
    public static void main(String[] args) {
        byte tamanio = 5; // 1 byte 8 bits... -128,0-127
        int numeros [] = { 5, 4, 30, 3, 1};
        int numeroMayor = numeros[0];
        int contador = 0;

        while (contador < 5) { 
            if (numeros [contador] > numeroMayor) { 
                numeroMayor = numeros [contador]; 
            }
            contador++;
        }

        System.out.println(numeroMayor);

    }
}

class ProgramaNumMenor {
    public static void main(String[] args) {
        int numeros [] = { 5, 4, 30, 3, 1};
        int numeroMenor = numeros[0];
        int contador = 0;

        while (contador < 5) { 
            if (numeros [contador] < numeroMenor) { 
                numeroMenor = numeros [contador]; 
            }
            contador++;
        }

        System.out.println(numeroMenor);
    }
}

class Simbolos {
    public static void main(String[] args) {
        //char simbolos [] = {'@', '*', '@', '*', '@', '*'};
        char simbolos [] = {'*', '@', '*', '@', '*', '@'};
        int contador = 0;

        while (contador < simbolos.length) {
            if (simbolos [contador] == '@') {
                int iFinal = contador + 1 ;
                simbolos [contador] = simbolos[simbolos.length -iFinal];
                simbolos [simbolos.length-(contador + 1)] = '@';
            }
            contador++;
        }
        
        contador = 0;
        while (contador < simbolos.length) {
            System.out.print(simbolos[contador]);
            contador++;
        }
    }
}

class NombreCalificacion {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nombres = new String[10]; 
        double[] calificaciones = new double[10]; 

        int contador = 0;

        while (contador < 10) {
            System.out.print("Dame un nombre: ");
            nombres[contador] = scanner.next();

            System.out.print("Dame su calificación: ");
            calificaciones[contador] = scanner.nextDouble();
            
            contador++;
        }

        contador = 0;

        System.out.print("Ingresa el nombre de la persona que quieres ver su calificacion: ");
        String nombre = scanner.next();

        while (contador < 10 ) {
            if (nombres[contador].equals(nombre)) {
                System.out.println("La calificación de " + nombre + " es: " + calificaciones[contador]);
            }
            contador++;
        }
    }
}

class Simbolos1 {
    public static void main(String[] args) {
        char [] simbolos  = {'@', '*', '@', '*', '@', '*', '@', '*', '@', '*'}; 

        int indexLeft = 0;
        int indexRigth = simbolos.length -1;

        while(indexLeft < (simbolos.length / 2)) {
            char simbolo = simbolos[indexRigth]; 

            if (simbolo == '@') {
                simbolos[indexRigth] = simbolos[indexLeft]; 
                simbolos[indexLeft] = simbolo;
            }

            indexLeft++;
            indexRigth--;
        }
        System.out.println(simbolos);
    }
}

class numerosOrdenados {
    public static void main(String[] args) {
        int [] numeros  = {2,1,9,3,4}; 
        int indice = 0;
        int index = 0;

        while(index < numeros.length) { 
            while (indice < (numeros.length-1)){
                if (numeros[indice] > numeros[indice + 1] ) {
                    int temporal = numeros[indice+1];
                    numeros[indice + 1] = numeros[indice];
                    numeros[indice] = temporal;
                }
                // } else if (indice < (numeros.length - 2)){
                //     if (numeros[indice + 1] > numeros[indice + 2] ) {
                //         int temporal = numeros[indice + 2];
                //         numeros[indice + 2] = numeros[indice + 1];
                //         numeros[indice + 1] = temporal;
                //     }
                //     indice++;
                // }
                indice++;
            }
            index++;
            indice = 0;
        }
        System.out.print("[" + numeros[0] + ", ");
        System.out.print(numeros[1] + ", ");
        System.out.print(numeros[2] + ", ");
        System.out.print(numeros[3] + ", ");
        System.out.println(numeros[4] + "]");
    }
}

class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr1  = {1,2,3,4}; 
        int [] arr2  = {5,6,7,8};

        int tamanio = arr1.length + arr2.length;

        int [] arr3 = new int[tamanio];
        
        int index = 0;
        int indice = 0;
        int contador = 0;

        while (index < arr3.length / 2) {  
            arr3[index] = arr1[indice];
            indice++;
            index++;
        }

        indice = 0;
        while (index < arr3.length) {  
            
            arr3[index] = arr2[indice];
            index++;
            indice++;
        }

        contador = 0;
        while (contador < arr3.length) { 
            System.out.print(arr3[contador] + ", ");
            contador++;
        }

        System.out.println();
        System.out.print("ingresa el numero a eliminar: ");
        int numero = scanner.nextInt();
        
        index = 0;
        while(index < tamanio){
            if (arr3[index] == numero){
                arr3[index] = 0;
            }
            index++;
        }

        contador = 0;
        while (contador < arr3.length) { 
            System.out.print(arr3[contador] + ", ");
            contador++;
        }

        System.out.println();
        contador = 0;
        while (contador < arr3.length - 1) { 
            if (arr3 [contador] == 0) { 
                int temporal = arr3[contador + 1];
                arr3[contador + 1] = arr3[contador];
                arr3[contador] = temporal;
            }
            contador++;
        }

        contador = 0;
        while (contador < arr3.length) { 
            System.out.print(arr3[contador] + ", ");
            contador++;
        }
    }
}

class OrdenarVector {
    public static void main(String[] args) {
        int[] numeros = {2, 1, 9, 3, 4};
        
        int i = 0;
        int j = 0;
        // Ordenar usando el método de burbuja
        while ( i < numeros.length - 1) {
            while ( j < numeros.length - 1 - i) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar numeros[j] y numeros[j + 1]
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
                j++;
            }
            i++;
        }

        // Imprimir el array ordenado
        System.out.print("Array ordenado: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}