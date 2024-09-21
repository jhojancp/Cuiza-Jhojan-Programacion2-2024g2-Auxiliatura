package factos;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de N:");
        int N = scanner.nextInt();
        int numerador = FraccionContinua.calcularNumerador(N);
        System.out.println("El numerador de la fracción P" + N + " es: " + numerador);
    }
}

