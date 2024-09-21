package loot;

import java.util.Random;

public class Arma extends Botin {
    private int dano;
    private int durabilidad;
    private int peso;

    public Arma(String rareza) {
        super(rareza, "Arma");
        Random random = new Random();
        this.dano = random.nextInt(100) + 1;
        this.durabilidad = random.nextInt(100) + 1;
        this.peso = random.nextInt(20) + 1;
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("Tipo: " + tipo + ", Rareza: " + rareza);
        System.out.println("Daño: " + dano);
        System.out.println("Durabilidad: " + durabilidad);
        System.out.println("Peso: " + peso + " kg");
    }
}
