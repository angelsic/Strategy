import java.util.List;

public class FastestRoute implements RouteStrategy{

    DijkstraAlgorithm algorithm;

    @Override
    public String calculateRoute(String pointA, String pointB) {
        List<String> fast = this.algorithm.dijkstra(pointA, pointB);
        return "Ruta más rápida entre " + pointA + " y " + pointB + " " + fast;
    }

    public FastestRoute(DijkstraAlgorithm algorithm1) {
        this.algorithm = algorithm1;
    }
}
