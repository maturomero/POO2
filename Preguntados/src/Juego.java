import java.io.IOException;
import java.util.*;

public class Juego {

    private Interfaz interfaz;
    private Pregunta pregunta;
    private Historial historial;
    private List<String[]> registro;

    public Juego(String archivoPreguntas) throws IOException {
        interfaz = new Interfaz();
        pregunta = new Pregunta(archivoPreguntas);
        historial = new Historial();
        registro = new ArrayList<>();
    }

    public void iniciar() throws IOException {
        while (true) {
            interfaz.clearScreen();

            // Mensaje para salir
            interfaz.mostrarMensaje("Escribe 'salir' en cualquier momento para terminar el juego.");

            String nombre = interfaz.obtenerNombreUsuario();

            // Verificamos si el usuario desea salir
            if (nombre.equalsIgnoreCase("salir")) {
                interfaz.mostrarMensaje("Has decidido salir del juego. ¡Gracias por jugar!");
                break; // Salimos del bucle y finalizamos el juego
            }

            interfaz.clearScreen();
            int[] dificultadDatos = interfaz.seleccionarDificultad();
            int cantidadPreguntas = dificultadDatos[0];
            String dificultad = dificultadDatos[1] == 1 ? "Facil" : dificultadDatos[1] == 2 ? "Medio" : "Dificil";

            interfaz.clearScreen();
            List<String[]> preguntas = pregunta.generarPreguntas(cantidadPreguntas);

            long inicioTiempo = System.currentTimeMillis();
            int correctas = pregunta.verificarPreguntas(preguntas, interfaz);
            long finTiempo = System.currentTimeMillis();
            double tiempoTotal = (finTiempo - inicioTiempo) / 1000.0;

            interfaz.mostrarMensaje(String.format("El jugador %s ha respondido correctamente: %d pregunta(s) en un tiempo total de %.2f segundos", nombre, correctas, tiempoTotal));

            double totalPuntos = calcularPuntos(correctas, cantidadPreguntas, tiempoTotal);
            registro.add(new String[]{nombre, String.valueOf(totalPuntos), dificultad, String.valueOf(tiempoTotal)});
            registro.sort((a, b) -> Double.compare(Double.parseDouble(b[1]), Double.parseDouble(a[1])));

            imprimirPodio();

            historial.guardarHistorial(registro);

            interfaz.mostrarMensaje("EL HISTORIAL DE JUGADORES: ");
            historial.mostrarHistorial();

            // Preguntar si quiere seguir jugando o salir
            String continuar = interfaz.obtenerRespuesta("¿Deseas jugar otra ronda? Escribe 'salir' para terminar o cualquier otra cosa para continuar.");
            if (continuar.equalsIgnoreCase("salir")) {
                interfaz.mostrarMensaje("Has decidido salir del juego. ¡Gracias por jugar!");
                break;
            }
        }
    }

    private double calcularPuntos(int acertadas, int cantPreguntas, double tiempo) {
        double puntosRespuestas = acertadas * 20;
        double puntosTiempo = tiempo * 0.5;
        double puntos = Math.round(((puntosRespuestas + cantPreguntas) - puntosTiempo) / 3 * 1000.0) / 1000.0;
        return Math.max(0, puntos);
    }

    private void imprimirPodio() {
        interfaz.mostrarMensaje("-".repeat(109));
        interfaz.mostrarMensaje(String.format("|%-19s|%-19s|%-19s|%-19s|%-19s|", "Posicion", "Jugadores", "Puntaje", "Dificultad", "Tiempo"));
        interfaz.mostrarMensaje("-".repeat(109));

        for (int i = 0; i < registro.size(); i++) {
            String[] fila = registro.get(i);
            interfaz.mostrarMensaje(String.format("|%-19d|%-19s|%-19s|%-19s|%-19s|", i + 1, fila[0], fila[1], fila[2], fila[3]));
            interfaz.mostrarMensaje("-".repeat(109));
        }
    }


}




