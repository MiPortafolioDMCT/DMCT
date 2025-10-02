import java.util.Scanner;

class MatrizNombres2x5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [][] matriz = new String[2][5];
        int contFila = 0;
        int contColum = 0;

        while (contFila < 2) {
            while (contColum < 5) {
                System.out.print("Ingresa un nombre: ");
                String nombre = scanner.next();

                matriz[contFila][contColum] = nombre;
                contColum++;
            }
            contColum = 0;
            contFila++;
        }

        contColum = 0;
        contFila = 0;
        int contador = 1;

        while (contFila < 2) {
            while (contColum < 5) {
                System.out.println(contador + ".-" + matriz[contFila][contColum]);
                contColum++;
                contador++;
            }
            contColum = 0;
            contFila++;
        }
    }
}

class MatrizL5x5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [][] matriz = new char[5][5];

        int contFila = 0;
        int contColum = 0;

        while (contFila < 5) {
            while (contColum < 5) {
                matriz[contFila][0] = '*';
                matriz[4][contFila] = '*';
                contColum++;
            }
            contColum = 0;
            contFila++;
        }

        contFila = 0;
        contColum = 0;
        while (contFila < 5) {
            while (contColum < 5) {
                if ( matriz[contFila][contColum] != '*') {
                    matriz[contFila][contColum] = '-';
                }
                contColum++;
            }
            contColum = 0;
            contFila++;
        }

        contFila = 0;
        contColum = 0;
        while (contFila < 5) {
            while (contColum < 5) {
                System.out.print(matriz[contFila][contColum]);
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }
    }
}

class MatrizV5x9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [][] matriz = new char[5][9];

        int contFila = 0;
        int contColum = 0;

        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                if ( matriz[contFila][contColum] != '*') {
                    matriz[contFila][contColum] = '-';
                }
                contColum++;
            }
            contColum = 0;
            contFila++;
        }
        
        contFila = 0;
        contColum = 0;

        while (contFila < matriz.length) {
            matriz[contFila][contFila] = '*';
            contColum++;
            contFila++;
        }
        
        while (contColum < matriz[0].length) {
            if (contFila > 1){
                matriz[contFila-2][contColum] = '*';
            }
            contColum++;
            contFila--;
        }
        
        contFila = 0;
        contColum = 0;
        
        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                System.out.print(matriz[contFila][contColum]);
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }
    }
}

class MatrizM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [][] matriz = new char[10][10];

        int contFila = 0;
        int contColum = 0;
        int tamanio = matriz.length;

        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                if ( matriz[contFila][contColum] != '*') {
                    matriz[contFila][contColum] = ' ';
                }
                contColum++;
            }
            contColum = 0;
            contFila++;
        }
        
        contFila = 0;
        contColum = 0;

        while (contFila < matriz.length) {
            matriz[contFila][0] = '*';
            matriz[contFila][matriz.length-1] = '*';
            if (contFila <= ((matriz.length - 1) / 2)) {
                matriz[contFila][contFila] = '*';
                matriz[contFila][tamanio - 1] = '*';
                tamanio--;
            } 
            contColum++;
            contFila++;
        }
        
        contFila = 0;
        contColum = 0;
        
        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                System.out.print(matriz[contFila][contColum]);
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }
    }
}

class MatrizW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [][] matriz = new char[5][17];

        int contFila = 0;
        int contColum = 0;
        int i = ((matriz[0].length-1)/4);
        int mitad = i *2;
        int incremento = 0;

        
        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                matriz[contFila][contColum] = ' ';
                matriz[contFila][contFila] = '*';
                if (mitad <= i*3 ) {
                    matriz[contFila][mitad] = '*';
                }
                contColum++;
            }
            mitad++;
            contColum = 0;
            contFila++;
        }
        contColum = contFila;
        
        while (contColum < matriz[0].length) {
            if (contFila > 1){
                matriz[contFila-2][contColum] = '*';
                matriz[contFila-2][contColum + i *2] = '*';
            }
            contColum++;
            contFila--;
        }

        contFila = 0;
        contColum = 0;
        
        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                System.out.print(matriz[contFila][contColum]);
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }
    }
}
        
class numerosOrdenados1 {
    public static void main(String[] args) {
        int indice = 0;
        int index = 0;
        int [][] matriz = new int[5][5];
        int contFila = 0;
        int contColum = 0;
        int cont = 0;

        matriz [0][0] = 20;
        matriz [0][1] = 22;
        matriz [0][2] = 10;
        matriz [0][3] = 11;
        matriz [0][4] = 19;

        matriz [1][0] = 12;
        matriz [1][1] = 7;
        matriz [1][2] = 21;
        matriz [1][3] = 13;
        matriz [1][4] = 18;

        matriz [2][0] = 5;
        matriz [2][1] = 7;
        matriz [2][2] = 23;
        matriz [2][3] = 4;
        matriz [2][4] = 24;

        matriz [3][0] = 17;
        matriz [3][1] = 8;
        matriz [3][2] = 14;
        matriz [3][3] = 2;
        matriz [3][4] = 25;

        matriz [4][0] = 15;
        matriz [4][1] = 16;
        matriz [4][2] = 3;
        matriz [4][3] = 1;
        matriz [4][4] = 9;

        System.out.println("Matriz no ordenada");

        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                System.out.print(matriz[contFila][contColum] + "-");
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }

        int tamanio = matriz.length * matriz[0].length;
        int [] temporal = new int[tamanio];

        contFila = 0;
        contColum = 0;

        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                temporal[cont] = matriz[contFila][contColum];
                contColum++;
                cont++;
            }
            contColum = 0;
            contFila++;
        }

        while(index < temporal.length) { 
            while (indice < (temporal.length-1)){
                if (temporal[indice] > temporal[indice + 1] ) {
                    int temp = temporal[indice+1];
                    temporal[indice + 1] = temporal[indice];
                    temporal[indice] = temp;
                } else if (indice < (temporal.length - 2)){
                    if (temporal[indice + 1] > temporal[indice + 2] ) {
                        int temp = temporal[indice + 2];
                        temporal[indice + 2] = temporal[indice + 1];
                        temporal[indice + 1] = temp;
                    }
                    indice++;
                }
                indice++;
            }
            index++;
            indice = 0;
        }

        contFila = 0;
        contColum = 0;
        cont = 0;

        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                matriz[contFila][contColum] = temporal[cont];
                contColum++;
                cont++;
            }
            contColum = 0;
            contFila++;
        }

        contFila = 0;
        contColum = 0;

        System.out.println();
        System.out.println("Matriz ordenada");
        
        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                System.out.print(matriz[contFila][contColum] + "-");
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }        
    }
}

class numerosOrdenados {
    public static void main(String[] args) {
        // int indice = 0;
        // int index = 0;
        int [][] matriz = new int[5][5];
        int contFila = 0;
        int contColum = 0;

        matriz [0][0] = 20;
        matriz [0][1] = 22;
        matriz [0][2] = 10;
        matriz [0][3] = 11;
        matriz [0][4] = 19;

        matriz [1][0] = 12;
        matriz [1][1] = 6;
        matriz [1][2] = 21;
        matriz [1][3] = 13;
        matriz [1][4] = 18;

        matriz [2][0] = 5;
        matriz [2][1] = 7;
        matriz [2][2] = 23;
        matriz [2][3] = 4;
        matriz [2][4] = 24;

        matriz [3][0] = 17;
        matriz [3][1] = 8;
        matriz [3][2] = 14;
        matriz [3][3] = 2;
        matriz [3][4] = 25;

        matriz [4][0] = 15;
        matriz [4][1] = 16;
        matriz [4][2] = 3;
        matriz [4][3] = 1;
        matriz [4][4] = 9;

        System.out.println("Matriz no ordenada");

        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                System.out.print(matriz[contFila][contColum] + "-");
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }

        contFila = 0;
        contColum = 0;
        int index = 0;
        int cont = 0;

        // int [] numeros  = {2,1,9,3,4,5,8,7,6,0};

        // int contador = 0;
        // while (contador < numeros.length -1) { 
        //     System.out.println(numeros[contador] + ", " + numeros[contador + 1]);
        //     contador++;
        // }

        // while (cont < (matriz.length * matriz[0].length)-1) {
        //     while (cont < matriz.length) {
        //         if (matriz[contFila][contColum] > matriz[contFila][contColum + 1]){
        //             int temp = matriz[contFila][contColum+1];
        //             matriz[contFila][contColum+1] = matriz[contFila][contColum];
        //             matriz[contFila][contColum] = temp;
        //         }
        //     }
        //     cont = 0;
        // }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (matriz[i][j] < matriz[k][l]) {
                            // Intercambiar los valores
                            int temp = matriz[i][j];
                            matriz[i][j] = matriz[k][l];
                            matriz[k][l] = temp;
                        }
                    }
                }
            }
        }

        // while (contFila < matriz.length) {
        //     while(index < matriz[0].length) {
        //         while (contColum < matriz[0].length)  { //&& cont < matriz[0].length-1)
        //             if (contColum < matriz[0].length-1) {
        //                 if (matriz[contFila][contColum] > matriz[contFila][contColum + 1]){
                            
        //                     int temp = matriz[contFila][contColum+1];
        //                     matriz[contFila][contColum+1] = matriz[contFila][contColum];
        //                     matriz[contFila][contColum] = temp;
        //                 }
        //                 //contColum++;
        //             }
        //             contColum++; 
                        
        //         }
                
        //         cont =0;
        //         contColum = 0;
        //         index++; 
        //     }
        //     index = 0;
        //     contFila++;
        // }





        // while(index < numeros.length) { 
        //     while (indice < (numeros.length-1)){
        //         if (numeros[indice] > numeros[indice + 1] ) {
        //             int temporal = numeros[indice+1];
        //             numeros[indice + 1] = numeros[indice];
        //             numeros[indice] = temporal;
        //         }
        //         indice++;
        //     }
        //     index++;
        //     indice = 0;
        // }

        // int i = 0;
        // int j = 0;
        // // Ordenar usando el método de burbuja
        // while ( i < numeros.length - 1) {
        //     while ( j < numeros.length - 1 - i) {
        //         if (numeros[j] > numeros[j + 1]) {
        //             // Intercambiar numeros[j] y numeros[j + 1]
        //             int temp = numeros[j];
        //             numeros[j] = numeros[j + 1];
        //             numeros[j + 1] = temp;
        //         }
        //         j++;
        //     }
        //     i++;
        // }


        //CHIDO
        // while (contFila < matriz.length) {
        //     while (contColum < matriz[0].length-1) {
        //         if (matriz[contFila][contColum] > matriz[contFila][contColum + 1]){
                    
        //             int temp = matriz[contFila][contColum+1];
        //             matriz[contFila][contColum+1] = matriz[contFila][contColum];
        //             matriz[contFila][contColum] = temp;
        //         }
        //         contColum++;
        //     }
        //     System.out.println();
        //     contColum = 0;
        //     contFila++;
        // }



        contFila = 0;
        contColum = 0;
        
        System.out.println();
        System.out.println("Matriz ordenada");
        
        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                System.out.print(matriz[contFila][contColum] + "-");
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }        
    }
}

class matrizMulti  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa el el numero de filas: ");
        int fila = scanner.nextInt();

        System.out.print("ingresa el el numero de columnas: ");
        int columna = scanner.nextInt();

        int [][] numeros1 = new int[fila][columna];
        int [][] numeros2 = new int[fila][columna];
        int [][] resultados = new int[fila][columna];
        
        int contFila = 0;
        int contColum = 0;


        while (contFila < numeros1.length) {
            while (contColum < numeros1[0].length) {
                System.out.print("Ingresa un numero para la primer matriz: ");
                numeros1[contFila][contColum] = scanner.nextInt();

                contColum++;
            }
            contColum = 0;
            contFila++;
        }

        contFila = 0;
        contColum = 0;
        while (contFila < numeros2.length) {
            while (contColum < numeros1[0].length) {
                System.out.print("Ingresa un numero para la segunda matriz: ");
                numeros2[contFila][contColum] = scanner.nextInt();

                contColum++;
            }
            contColum = 0;
            contFila++;
        }

        contFila = 0;
        contColum = 0;
        while (contFila < numeros2.length) {
            while (contColum < numeros1[0].length) {
                resultados[contFila][contColum] = numeros1[contFila][contColum] * 
                numeros2[contFila][contColum];
                contColum++;
            }
            contColum = 0;
            contFila++;
        }

        System.out.println("Primera matriz");
        contFila = 0;
        contColum = 0;
        while (contFila < numeros1.length) {
            while (contColum < numeros1[0].length) {
                System.out.print(numeros1[contFila][contColum] + "-");
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }

        System.out.println("Segunda matriz");
        contFila = 0;
        contColum = 0;
        while (contFila < numeros2.length) {
            while (contColum < numeros1[0].length) {
                System.out.print(numeros2[contFila][contColum] + "-");
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }

        System.out.println("Resultados");
        contFila = 0;
        contColum = 0;
        while (contFila < resultados.length) {
            while (contColum < numeros1[0].length) {
                System.out.print(resultados[contFila][contColum] + "-");
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }

    }
}

class Arbolito {
    public static void main(String[] args) {
        String [][] matriz = new String[11][11];

        int contFila = 0;
        int contColum = 0;
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_CAFE = "\033[33m";
        final String ANSI_VERDE = "\033[32m";
        final String ANSI_WHITE = "\u001B[37m";
        String caracter = "█";

        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                if ( matriz[contFila][contColum] != caracter) {
                    matriz[contFila][contColum] = ANSI_WHITE + caracter + ANSI_RESET;
                }
                contColum++;
            }
            contColum = 0;
            contFila++;
        }
        
        contFila = 0;
        contColum = 0;

        while (contFila < matriz.length) {
            
            matriz[5][contColum] = ANSI_VERDE + caracter + ANSI_RESET;

            if (contColum < matriz.length -10) {
                matriz[0][contColum + 5] = ANSI_VERDE + caracter + ANSI_RESET;
            }
            if (contColum < matriz.length -8) {
                matriz[1][contColum + 4] = ANSI_VERDE + caracter + ANSI_RESET;
            }
            if (contColum < matriz.length -6) {
                matriz[2][contColum + 3] = ANSI_VERDE + caracter + ANSI_RESET;
            }
            if (contColum < matriz.length -4) {
                matriz[3][contColum + 2] = ANSI_VERDE + caracter + ANSI_RESET;
            }
            if (contColum < matriz.length -2) {
                matriz[4][contColum + 1] = ANSI_VERDE + caracter + ANSI_RESET;
            }
            
            if (contFila < matriz.length -6) {
                matriz[contFila + 6][4] = ANSI_CAFE + caracter + ANSI_RESET;
                matriz[contFila + 6][5] = ANSI_CAFE + caracter + ANSI_RESET;
                matriz[contFila + 6][6] = ANSI_CAFE + caracter + ANSI_RESET;
            }

            contColum++;
            contFila++;
        }
        
        contFila = 0;
        contColum = 0;
        
        while (contFila < matriz.length) {
            while (contColum < matriz[0].length) {
                System.out.print(matriz[contFila][contColum]);
                contColum++;
            }
            System.out.println();
            contColum = 0;
            contFila++;
        }
    }
}