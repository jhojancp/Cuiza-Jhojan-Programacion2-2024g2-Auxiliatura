package tiempo;
import java.util.Scanner;

public class JuntaDirectiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de directores y la duración máxima de la reunión
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Calcular el tiempo total disponible para los discursos
        int tiempoDisponible = K - (N - 1);

        // Calcular la duración máxima de cada discurso
        int duracionDiscurso = tiempoDisponible / N;

        // Imprimir la duración máxima de cada discurso
        System.out.println(duracionDiscurso);
    }
}
