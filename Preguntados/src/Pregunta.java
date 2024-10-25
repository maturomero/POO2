import java.io.*;
import java.util.*;

public class Pregunta {

    private List<String[]> cuestionarioCompleto;
    private BufferedReader archivo;

    public Pregunta(String archivoPreguntas) throws IOException {
        archivo = new BufferedReader(new FileReader(archivoPreguntas));
        cuestionarioCompleto = new ArrayList<>();
        cargarPreguntas();
    }

    // Carga todas las preguntas al principio para mayor eficiencia
    private void cargarPreguntas() throws IOException {
        String line;
        while ((line = archivo.readLine()) != null) {
            String[] datosPregunta = line.split(";");
            String pregunta = datosPregunta[0];
            String[] opciones = Arrays.copyOfRange(datosPregunta, 1, datosPregunta.length - 1);
            String respuestaCorrecta = datosPregunta[datosPregunta.length - 1];
            cuestionarioCompleto.add(new String[]{pregunta, Arrays.toString(opciones), respuestaCorrecta});
        }
    }

    public List<String[]> generarPreguntas(int cantPreguntas) {
        // Barajamos la lista completa de preguntas para que queden en orden aleatorio
        Collections.shuffle(cuestionarioCompleto);
        // Devolvemos una sublista con la cantidad deseada de preguntas
        return new ArrayList<>(cuestionarioCompleto.subList(0, Math.min(cantPreguntas, cuestionarioCompleto.size())));
    }

    public int verificarPreguntas(List<String[]> preguntas, Interfaz interfaz) {
        int correctas = 0;
        for (String[] pregunta : preguntas) {
            interfaz.mostrarMensaje("Pregunta: " + pregunta[0]);
            String[] opciones = pregunta[1].replace("[", "").replace("]", "").split(", ");
            for (int i = 0; i < opciones.length; i++) {
                interfaz.mostrarMensaje((i + 1) + ". " + opciones[i]);
            }

            String respuesta = interfaz.obtenerRespuesta("¿Deseas jugar otra ronda? Escribe 'salir' para terminar o cualquier otra cosa para continuar.");
            if (respuesta.equals(pregunta[2])) {
                interfaz.mostrarMensaje("Respuesta correcta");
                correctas++;
            } else {
                interfaz.mostrarMensaje("Respuesta incorrecta. La respuesta correcta era: " + opciones[Integer.parseInt(pregunta[2]) - 1]);
            }
            interfaz.clearScreen();
        }
        return correctas;
    }

    public void cerrarArchivo() throws IOException {
        archivo.close();
    }
}






