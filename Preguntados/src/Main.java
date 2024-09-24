import java.io.IOException; // Importación necesaria para manejar IOException

public class Main {
    public static void main(String[] args) {
        try {
            // Inicializamos el juego con el archivo que contiene las preguntas.
            Juego juego = new Juego("/Users/mgr/Desktop/uade/years3/2cuatri/poo/Preguntados/src/preguntas.txt");

            // Iniciamos el flujo del juego.
            juego.iniciar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
