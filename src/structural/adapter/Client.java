package structural.adapter;

public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new ExistingClass(20));
        if (adapter.getRadius() > 10) { 
            // converted width field to radius equivalent
            System.out.println("yeet");
        }
    }
}
