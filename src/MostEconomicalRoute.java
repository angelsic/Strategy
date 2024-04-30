import java.util.List;

public class MostEconomicalRoute implements RouteStrategy{

    DijkstraAlgorithm algorithm;
    @Override
    public String calculateRoute(String pointA, String pointB) {
        List<String> econo = this.algorithm.dijkstra(pointA, pointB);
        return "Ruta más economica entre " + pointA + " y " + pointB + " " + econo;
    }

    public MostEconomicalRoute(DijkstraAlgorithm algorithm1) {
        this.algorithm = algorithm1;
    }
}
