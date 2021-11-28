package behavioural.command;

public class Command1 implements Command {

    public Receiver receiver;

    Command1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public boolean execute() {
        // do something
        return false;
    }
    
}
