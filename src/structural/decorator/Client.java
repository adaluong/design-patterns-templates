package structural.decorator;

public class Client {

    public static void main(String[] args) {
        String string = "hello";
        BaseDecorator encoded = new ConcreteDecorator(new ConcreteComponent(string));
        encoded.execute();    
    }

}
