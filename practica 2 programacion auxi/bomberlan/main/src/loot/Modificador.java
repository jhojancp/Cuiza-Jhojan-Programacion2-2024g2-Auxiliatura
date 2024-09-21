package loot;

import java.util.Random;

public class Modificador extends Botin {
    private int mejoraHabilidad;
    private int durabilidad;
    private int peso;

    public Modificador(String rareza) {
        super(rareza, "Modificador");
        Random random = new Random();
        this.mejoraHabilidad = random.nextInt(50) + 1;
        this.durabilidad = random.nextInt(100) + 1;
        this.peso = random.nextInt(20) + 1;
    }

    @Override
    public void imprimirAtributos() {
        System.out.println("Tipo: " + tipo + ", Rareza: " + rareza);
        System.out.println("Mejora de habilidad: " + mejoraHabilidad);
        System.out.println("Durabilidad: " + durabilidad);
        System.out.println("Peso: " + peso + " kg");
    }
}

