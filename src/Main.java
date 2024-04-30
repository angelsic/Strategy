public class Main {
    public static void main (String [] args){

        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
        dijkstra.addEdge("Point A", "Point B", 10);
        dijkstra.addEdge("Point A", "Point C", 15);
        GPSNavigator gps = new GPSNavigator(new ShortestRoute(dijkstra));
        gps.calculateRoute("Point A", "Point B");

        dijkstra.addEdge("Point A", "Point B", 25);
        dijkstra.addEdge("Point A", "Point C", 50);
        gps.setRouteStrategy(new FastestRoute(dijkstra));
        gps.calculateRoute("Point A", "Point B");

        dijkstra.addEdge("Point A", "Point B", 75);
        dijkstra.addEdge("Point A", "Point C", 90);
        gps.setRouteStrategy(new MostEconomicalRoute(dijkstra));
        gps.calculateRoute("Point A", "Point C");
    }


}
