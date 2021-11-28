package structural.facade;

public class Client {
    public static void main(String[] args) {
        Facade converter = new Facade();
        SubsystemClass file = converter.subsystemOperation();
    }
    
}
