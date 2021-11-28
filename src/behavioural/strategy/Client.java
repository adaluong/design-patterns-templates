package behavioural.strategy;

public class Client {

    private int randomNumber = 0;
    private Strategy strategy = null;
    private Context context = new Context(); 
    
    public void main() {
        
        // set strategies
        if (randomNumber == 1) {
            strategy = new ConcreteStrategyA();
        } else if (randomNumber == 2) {
            strategy = new ConcreteStrategyB();
        } else {
            strategy = new ConcreteStrategyC();
        }
    
        //  passes something to context
        context.randomMethod(strategy);

    }
    
}
