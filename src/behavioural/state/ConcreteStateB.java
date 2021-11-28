package behavioural.state;

public class ConcreteStateB extends State {

    public ConcreteStateB(Context context) {
        super(context);
    }

    @Override
    public String onLock() {
        return "Stop Playing";    
    }

    @Override
    public String onPlay() {
        return "Paused";
    }

    @Override
    public String onNext() {
        return context.next();      
    }
}
