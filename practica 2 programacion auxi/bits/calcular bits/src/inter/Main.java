package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        int [] arr = null;
        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar lista de números");
            System.out.println("2. Obtener la secuencia máxima lexicográficamente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese el tamaño de la lista N: ");
                    int N = sc.nextInt();
                    arr = new int[N];
                    System.out.println("Ingrese los números de la lista:");
                    for (int i = 0; i < N; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Lista ingresada correctamente.");
                    break;

                case 2:
                    System.out.println("Obteniendo la secuencia máxima lexicográficamente...");
                    // Llamamos al método que realiza la operación para obtener la lista máxima
                    obtenerMaximaSecuencia(arr);
                    System.out.print("Resultado: ");
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 3);
        sc.close();
    }

    // Método para obtener la secuencia máxima lexicográficamente
    public static void obtenerMaximaSecuencia(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Intercambiamos los bits de los números arr[i] y arr[j]
                int x = arr[i] | arr[j];
                int y = arr[i] & arr[j];
                arr[i] = Math.max(x, y);
                arr[j] = Math.min(x, y);
            }
        }

        // Ordenamos la lista en orden descendente
        java.util.Arrays.sort(arr);
        // Invertimos el arreglo para que esté en orden lexicográfico máximo
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
}
