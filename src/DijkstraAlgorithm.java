import java.util.*;

public class DijkstraAlgorithm {
    private Map<String, Map<String, Integer>> graph = new HashMap<>();

    public void addEdge(String source, String destination, int weight) {
        graph.computeIfAbsent(source, k -> new HashMap<>()).put(destination, weight);
        graph.computeIfAbsent(destination, k -> new HashMap<>()).put(source, weight);
    }

    public List<String> dijkstra(String start, String end) {
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previous = new HashMap<>();
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        distances.put(start, 0);
        queue.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            if (current.equals(end)) {
                List<String> path = new ArrayList<>();
                while (previous.containsKey(current)) {
                    path.add(current);
                    current = previous.get(current);
                }
                path.add(start);
                Collections.reverse(path);
                return path;
            }

            if (graph.containsKey(current)) {
                for (String neighbor : graph.get(current).keySet()) {
                    int newDist = distances.get(current) + graph.get(current).get(neighbor);
                    if (!distances.containsKey(neighbor) || newDist < distances.get(neighbor)) {
                        distances.put(neighbor, newDist);
                        previous.put(neighbor, current);
                        queue.add(neighbor);
                    }
                }
            }
        }

        return new ArrayList<>();
    }
}