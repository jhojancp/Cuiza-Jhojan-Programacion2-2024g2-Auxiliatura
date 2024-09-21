package codigo;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú:");
            System.out.println("1. Ingresar matriz y calcular giros");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    // Entrada de la matriz
                    System.out.print("Ingrese el tamaño N de la matriz (filas y columnas): ");
                    int N = sc.nextInt();
                    int[][] matriz = new int[N][N];
                    System.out.println("Ingrese la matriz (elementos separados por espacio):");

                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < N; j++) {
                            matriz[i][j] = sc.nextInt();
                        }
                    }

                    // Llamar al método para calcular el número de giros
                    int giros = RotacionCaja.calcularGiros(matriz);
                    System.out.println("Número de giros necesarios en sentido antihorario: " + giros);
                    break;

                case 2:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 2);

        sc.close();
    }
}
