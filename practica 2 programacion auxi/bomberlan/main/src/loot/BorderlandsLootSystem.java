package loot;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BorderlandsLootSystem {
    
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    
    // Definir los tipos de rareza
    static String[] rarezas = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
    
    // Lista para almacenar el botín obtenido
    static ArrayList<Botin> botinObtenido = new ArrayList<>();

    public static void main(String[] args) {
        boolean continuar = true;
        
        // Bucle principal del juego
        while (continuar) {
            System.out.println("Te has enfrentado a un enemigo... obteniendo botín.");
            Botin botin = generarBotin();
            botinObtenido.add(botin);
            botin.imprimirAtributos();

            System.out.println("¿Quieres enfrentarte a otro enemigo? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
                mostrarResumenBotin();
            }
        }
    }

    // Método para generar el botín aleatorio
    public static Botin generarBotin() {
        String rareza = rarezas[random.nextInt(rarezas.length)];
        int tipoBotin = random.nextInt(3); // 0: Arma, 1: Escudo, 2: Modificador
        
        switch (tipoBotin) {
            case 0:
                return new Arma(rareza);
            case 1:
                return new Escudo(rareza);
            case 2:
                return new Modificador(rareza);
            default:
                return null;
        }
    }

    // Método para mostrar el resumen del botín al final de la sesión
    public static void mostrarResumenBotin() {
        System.out.println("Resumen de botín obtenido:");
        for (Botin botin : botinObtenido) {
            botin.imprimirAtributos();
            System.out.println("--------------------------------");
        }
        System.out.println("¡Gracias por jugar!");
    }
}
