package behavioural.command;

public class Client {
    public static void main (String[] args) {
        Receiver receiver = new Receiver();
        Command1 command1 = new Command1(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command1);
    }

}
