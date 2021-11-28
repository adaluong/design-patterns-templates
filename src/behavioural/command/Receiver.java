package behavioural.command;

public class Receiver {

    public void executeCommand(Command command) {
        
        if (command.execute()) {
            // do something
        }
    }
}
