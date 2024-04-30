public class GPSNavigator {
    private RouteStrategy routeStrategy;

    public GPSNavigator(RouteStrategy routeStrategy1){
        this.routeStrategy = routeStrategy1;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy1){
        this.routeStrategy = routeStrategy1;
    }

    public void calculateRoute(String pointA, String pointB){
        System.out.println(this.routeStrategy.calculateRoute(pointA, pointB));
    }

}
