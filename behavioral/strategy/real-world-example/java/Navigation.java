
interface RouteStrategy {
    void buildRoute(String routeStrategy);
}

class FastRoute implements RouteStrategy {

    @Override
    public void buildRoute(String routeStrategy) {
        System.out.println("Building route using the fastest path.");
    }
}

class ShortestRouter implements RouteStrategy {
    @Override
    public void buildRoute(String routeStrategy) {
        System.out.println("Building route using the shortest path.");
    }
}

class AvoidTollRoute implements RouteStrategy {
    @Override
    public void buildRoute(String routeStrategy) {
        System.out.println("Building route by avoiding tolls.");
    }
}

class NavigationContext {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeRoute(String routeStrategy) {
        if (strategy != null) {
            strategy.buildRoute(routeStrategy);
        } else {
            System.out.println("Route strategy not set.");
        }
    }
}

public class Navigation {

    public static void main(String[] args) {

        NavigationContext context = new NavigationContext();

        // using FastRoute strategy
        context.setStrategy(new FastRoute());
        context.executeRoute("Fastest Route");

        // using ShortestRouter strategy
        context.setStrategy(new ShortestRouter());
        context.executeRoute("Shortest Route");

        // using AvoidTollRoute strategy
        context.setStrategy(new AvoidTollRoute());
        context.executeRoute("Avoid Toll Route");

    }

}
