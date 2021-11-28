package behavioural.state;

public class Client {

    public static void main() {
        Context context = new Context();
        State initialState = new ConcreteStateA(context);
        initialState.onLock(); // current state may be changed by context or state
    }
    
}
