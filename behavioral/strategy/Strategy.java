package behavioral.strategy;

public class Strategy {
    private StrategyBehavior strategyBehavior;

    public Strategy(StrategyBehavior strategyBehavior) {
        this.strategyBehavior = strategyBehavior;
    }

    public void executeStrategy() {
        strategyBehavior.performAction();
    }
}
