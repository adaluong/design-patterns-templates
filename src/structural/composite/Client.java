package structural.composite;

public class Client {
    public static void main(String[] args) {
        Composite composite = new Composite(new Leaf(10), new Leaf(50));
        System.out.println(composite);
    }
}
