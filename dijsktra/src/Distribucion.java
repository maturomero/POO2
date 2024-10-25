import java.util.*;

public class Distribucion {

    // Definir la clase Nodo correctamente
    static class Nodo implements Comparable<Nodo> {
        int nodo;
        int costo;

        public Nodo(int nodo, int costo) {
            this.nodo = nodo;
            this.costo = costo;
        }

        @Override
        public int compareTo(Nodo other) {
            return Integer.compare(this.costo, other.costo);
        }
    }

    // Función para aplicar Dijkstra desde un nodo origen
    public static int[] dijkstra(Map<Integer, List<Nodo>> graph, int start, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<Nodo> pq = new PriorityQueue<>();
        pq.add(new Nodo(start, 0));

        while (!pq.isEmpty()) {
            Nodo actual = pq.poll();
            int nodo = actual.nodo;
            int costoActual = actual.costo;

            if (costoActual > dist[nodo]) continue;

            for (Nodo vecino : graph.getOrDefault(nodo, new ArrayList<>())) {
                int nuevoCosto = costoActual + vecino.costo;

                if (nuevoCosto < dist[vecino.nodo]) {
                    dist[vecino.nodo] = nuevoCosto;
                    pq.add(new Nodo(vecino.nodo, nuevoCosto));
                }
            }
        }

        return dist;
    }

    // Función para calcular el costo total desde un centro de distribución hasta todos los clientes
    public static int calcularCostoTotal(Map<Integer, Integer[]> distributionCenters, Map<Integer, Integer> clients,
                                         Map<Integer, List<Nodo>> graph, int centro, int n) {
        // Ejecutamos Dijkstra desde el centro de distribución
        int[] distancias = dijkstra(graph, centro, n);

        int costoTotal = 0;

        // Calculamos el costo para cada cliente
        for (Map.Entry<Integer, Integer> entry : clients.entrySet()) {
            int cliente = entry.getKey();
            int volumen = entry.getValue();

            if (cliente < distancias.length && distancias[cliente] != Integer.MAX_VALUE) {
                int costoMinimo = distancias[cliente];
                int costoPuerto = distributionCenters.get(centro)[0] * volumen; // Costo de envío al puerto
                int costoCliente = costoMinimo * volumen; // Costo mínimo de envío al cliente
                costoTotal += costoCliente + costoPuerto;
            }
        }

        return costoTotal;
    }
}

