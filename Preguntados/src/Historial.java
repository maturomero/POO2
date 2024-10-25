import java.io.*;
import java.util.*;

public class Historial {

    public void guardarHistorial(List<String[]> registros) {
        try (BufferedWriter histo = new BufferedWriter(new FileWriter("/Users/mgr/Desktop/uade/years3/2cuatri/poo/Preguntados/src/historial.txt", true))) {
            for (String[] registro : registros) {
                histo.write(String.join(";", registro) + "\n");
            }
        } catch (IOException e) {
            System.out.println("El archivo de historial no se encontró.");
        }
    }

    public void mostrarHistorial() {
        try (BufferedReader historial = new BufferedReader(new FileReader("/Users/mgr/Desktop/uade/years3/2cuatri/poo/Preguntados/src/historial.txt"))) {
            List<String[]> historialData = new ArrayList<>();
            String line;
            while ((line = historial.readLine()) != null) {
                historialData.add(line.split(";"));
            }

            historialData.sort((a, b) -> Double.compare(Double.parseDouble(b[1]), Double.parseDouble(a[1])));

            for (String[] datos : historialData) {
                System.out.printf("Nombre: %s, Puntaje: %s, Dificultad: %s, Tiempo: %s%n", datos[0], datos[1], datos[2], datos[3]);
            }
            System.out.println("ENTER para seguir jugando");
        } catch (IOException e) {
            System.out.println("El archivo de historial no se encontró.");
        }
    }
}
