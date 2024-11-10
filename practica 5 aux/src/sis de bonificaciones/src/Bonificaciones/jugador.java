package Bonificaciones;

public class jugador {
    String nombre;
    Integer puntos;

    public jugador(String nombre, Integer puntos){
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public void aplicarBonificacion(CalculadoraBonificacion calculadora){
        puntos = puntos + calculadora.calcular(puntos);
    }

    public Integer getPuntos() {
        return puntos;
    }
}