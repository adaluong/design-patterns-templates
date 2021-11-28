package behavioural.visitor;

public class Client {
    public static void main(String[] args) {
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        export(elementA, elementB);

    }

    private static void export(Element... elements) {
        ConcreteVisitors visitor = new ConcreteVisitors();
        System.out.println(visitor.export(elements));
    }
}
