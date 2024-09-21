package codigo;

public class RotacionCaja {

    // Método para calcular cuántos giros se necesitan en sentido antihorario
    public static int calcularGiros(int[][] matriz) {
        int N = matriz.length;
        int[][] original = copiarMatriz(matriz);  // Guardamos la matriz original
        int[][] rotada = matriz;
        int giros = 0;

        // Realizamos hasta 3 rotaciones de 90 grados (una cuarta rotación devolvería a la matriz original)
        for (int i = 1; i <= 3; i++) {
            rotada = rotar90Antihorario(rotada);
            giros++;
            if (sonIguales(rotada, original)) {
                return giros;
            }
        }

        return 4;  // Si no se ha igualado en las 3 rotaciones, la cuarta rotación será igual a la original
    }

    // Método que rota una matriz 90 grados en sentido antihorario
    public static int[][] rotar90Antihorario(int[][] matriz) {
        int N = matriz.length;
        int[][] nuevaMatriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                nuevaMatriz[N - j - 1][i] = matriz[i][j];
            }
        }

        return nuevaMatriz;
    }

    // Método para comparar si dos matrices son iguales
    public static boolean sonIguales(int[][] matriz1, int[][] matriz2) {
        int N = matriz1.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Método para copiar una matriz (evitar que se modifique el original)
    public static int[][] copiarMatriz(int[][] matriz) {
        int N = matriz.length;
        int[][] copia = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                copia[i][j] = matriz[i][j];
            }
        }

        return copia;
    }
}
