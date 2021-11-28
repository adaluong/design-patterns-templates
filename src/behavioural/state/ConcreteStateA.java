package behavioural.state;

public class ConcreteStateA extends State {

    public ConcreteStateA(Context context) {
        super(context);
    }

    @Override
    public String onLock() {
        return "Stop Playing";    
    }

    @Override
    public String onPlay() {
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked";      
    }
}
