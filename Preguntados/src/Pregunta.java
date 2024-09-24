import java.io.*;
import java.util.*;

public class Pregunta {

    private List<String[]> cuestionario;
    private int cont;
    private BufferedReader archivo;

    public Pregunta(String archivoPreguntas) throws IOException {
        archivo = new BufferedReader(new FileReader(archivoPreguntas));
        cuestionario = new ArrayList<>();
        cont = 0;
    }

    public List<String[]> generarPreguntas(int cantPreguntas) throws IOException {
        cuestionario.clear();
        String line;
        int contador = 0;

        while ((line = archivo.readLine()) != null) {
            String[] datosPregunta = line.split(";");
            String pregunta = datosPregunta[0];
            String[] opciones = Arrays.copyOfRange(datosPregunta, 1, datosPregunta.length - 1);
            String respuestaCorrecta = datosPregunta[datosPregunta.length - 1];
            cuestionario.add(new String[]{pregunta, Arrays.toString(opciones), respuestaCorrecta});

            contador++;
            if (contador >= cantPreguntas) {
                break;
            }
        }
        return cuestionario;
    }

    public int verificarPreguntas(List<String[]> preguntas, Interfaz interfaz) {
        int correctas = 0;
        for (String[] pregunta : preguntas) {
            interfaz.mostrarMensaje("Pregunta: " + pregunta[0]);
            String[] opciones = pregunta[1].replace("[", "").replace("]", "").split(", ");
            for (int i = 0; i < opciones.length; i++) {
                interfaz.mostrarMensaje((i + 1) + ". " + opciones[i]);
            }

            String respuesta = interfaz.obtenerRespuesta();
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

