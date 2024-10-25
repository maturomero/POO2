import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Datos de centros de distribución (Centro -> [Costo al puerto, Costo fijo])
        Map<Integer, Integer[]> distributionCenters = new HashMap<>();
        distributionCenters.put(0, new Integer[]{3, 2300});
        distributionCenters.put(1, new Integer[]{3, 1900});
        distributionCenters.put(2, new Integer[]{3, 1500});
        distributionCenters.put(3, new Integer[]{2, 2000});
        distributionCenters.put(4, new Integer[]{2, 2700});
        distributionCenters.put(5, new Integer[]{2, 2500});
        distributionCenters.put(6, new Integer[]{1, 3000});
        distributionCenters.put(7, new Integer[]{1, 500});

        // Datos de clientes (Cliente -> Volumen de producción)
        Map<Integer, Integer> clients = new HashMap<>();
        for (int i = 0; i <= 10; i++) {
            clients.put(i, 10);
        }

        // Grafo de transporte: lista de adyacencias (Nodo -> [Destino, Costo])
        Map<Integer, List<Distribucion.Nodo>> graph = new HashMap<>();
        graph.computeIfAbsent(1, k -> new ArrayList<>()).add(new Distribucion.Nodo(2, 10));
        graph.computeIfAbsent(2, k -> new ArrayList<>()).add(new Distribucion.Nodo(1, 10));
        graph.computeIfAbsent(2, k -> new ArrayList<>()).add(new Distribucion.Nodo(3, 10));
        graph.computeIfAbsent(3, k -> new ArrayList<>()).add(new Distribucion.Nodo(2, 10));
        graph.computeIfAbsent(1, k -> new ArrayList<>()).add(new Distribucion.Nodo(28, 8));
        graph.computeIfAbsent(28, k -> new ArrayList<>()).add(new Distribucion.Nodo(1, 8));
        graph.computeIfAbsent(28, k -> new ArrayList<>()).add(new Distribucion.Nodo(50, 11));
        graph.computeIfAbsent(50, k -> new ArrayList<>()).add(new Distribucion.Nodo(28, 11));
        graph.computeIfAbsent(1, k -> new ArrayList<>()).add(new Distribucion.Nodo(3, 12));

        // Número total de nodos en el grafo
        int totalNodos = 51;  // Suponiendo que el mayor nodo es el 50

        // Aplicamos el cálculo para cada centro de distribución
        for (int centro : distributionCenters.keySet()) {
            int costo = Distribucion.calcularCostoTotal(distributionCenters, clients, graph, centro, totalNodos);
            System.out.println("Costo total desde el Centro de Distribución " + centro + ": " + costo);
        }
    }
}
