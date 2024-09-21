package factos;
public class FraccionContinua {
    public static int calcularNumerador(int N) {
        if (N == 0) {
            return 1;
        }
        int numerador = 1;
        int denominador = 1;
        for (int i = 1; i <= N; i++) {
            int temp = numerador;
            numerador = denominador;
            denominador = temp + denominador;
        }
        return numerador;
    }
}
