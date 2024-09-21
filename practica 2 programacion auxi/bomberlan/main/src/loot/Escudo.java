package loot;

import java.util.Random;

public class Escudo extends Botin {
    private int capacidad;
    private int durabilidad;
    private int peso;

    public Escudo(String rareza) {
        super(rareza, "Escudo");
        Random random = new Random();
        this.capacidad = random.nextInt(500) + 100;
        this.durabilidad = random.nextInt(100) + 1;
        this.peso = random.nextInt(20) + 1;
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("Tipo: " + tipo + ", Rareza: " + rareza);
        System.out.println("Capacidad de absorción: " + capacidad);
        System.out.println("Durabilidad: " + durabilidad);
        System.out.println("Peso: " + peso + " kg");
    }
}
