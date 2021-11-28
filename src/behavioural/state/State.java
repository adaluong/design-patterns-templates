package behavioural.state;

public abstract class State {

    Context context;

    State(Context context) {
        this.context = context;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
}