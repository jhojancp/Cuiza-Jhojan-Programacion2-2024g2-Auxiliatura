package fechas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una fecha (ejemplo: 30 de febrero, 2023):");
        String input = scanner.nextLine();
        String[] parts = input.split(" de |, ");
    
        if (parts.length != 3) {
            System.out.println("Formato de fecha incorrecto.");
            return;
        }

        int day;
        String month;
        int year;

        try {
            day = Integer.parseInt(parts[0].trim());
            month = parts[1].trim();
            year = Integer.parseInt(parts[2].trim());
        } catch (NumberFormatException e) {
            System.out.println("Formato de fecha incorrecto.");
            return;
        }

        if (DateValidator.isValidDate(day, month, year)) {
            System.out.printf("La fecha ingresada es: %02d de %s, %d%n", day, month, year);
        } else {
            System.out.println("Fecha inválida.");
        }
    }
}
