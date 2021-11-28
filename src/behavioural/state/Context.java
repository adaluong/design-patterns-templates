package behavioural.state;

public class Context {

    private State state;

    public Context() {
        this.state = new ConcreteStateA(this); // pass in context
        state.onLock();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public String next() {
        return "Playing NEXT";
    }
    
}
