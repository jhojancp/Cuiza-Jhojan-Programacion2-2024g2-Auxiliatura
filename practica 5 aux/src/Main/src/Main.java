import Notificaciones.Evento;
import sis de bonificaciones.CalculadoraBonificacion;
import sis de bonificaciones.Jugador;
import sis de tareas.Aventura;
import sis de filtros.Inventario;
import sis de filtros.Objeto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento("Ejercicio1.Evento");

        evento.registrarNotificacion(mensaje -> System.out.println("Ejercicio1.Evento 1"));
        evento.registrarNotificacion(mensaje -> System.out.println("Ejercicio1.Evento 2"));

        evento.activar();

        Jugador jugador = new Jugador("Pepito",100);

        System.out.println(jugador.getPuntos());

        CalculadoraBonificacion masDiezPuntos = puntosBase -> 10;
        jugador.aplicarBonificacion(masDiezPuntos);

        System.out.println(jugador.getPuntos());

        Aventura aventura = new Aventura();

        aventura.agregarTarea(()-> System.out.println("Levantarse"));
        aventura.agregarTarea(()-> System.out.println("Procastinar"));
        aventura.agregarTarea(()-> System.out.println("Dormir"));

        aventura.iniciar();

        Inventario inventario = new Inventario();

        Objeto objeto1 = new Objeto("Pico",2);
        Objeto objeto2 = new Objeto("Pala",5);

        ArrayList<Objeto> objetoPesado = inventario.filtrarObjetos(objeto -> objeto.getPeso() > 1);

        System.out.println(objetoPesado);
    }
}