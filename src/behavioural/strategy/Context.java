package behavioural.strategy;

public class Context {

    // doesn't know what type of strategy it works with
    public void randomMethod(Strategy strategy) {
        strategy.execute();
    }
    
}
