import java.util.List;

public class ShortestRoute implements RouteStrategy{

    DijkstraAlgorithm algorithm;
    @Override
    public String calculateRoute(String pointA, String pointB) {
        List<String> shortes = this.algorithm.dijkstra(pointA, pointB);
        return "Ruta más corta entre " + pointA + " y " + pointB + " " + shortes;
    }

    public ShortestRoute(DijkstraAlgorithm algorithm1) {
        this.algorithm = algorithm1;
    }
}
