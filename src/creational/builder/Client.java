package creational.builder;

import creational.builder.builders.BuilderA;
import creational.builder.product.ProductA;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from client code
        BuilderA builder = new BuilderA();
        director.constructProductA(builder);

        // Final product often retrieved from builder
        ProductA product = builder.getResult();
        System.out.println(product);
    }
}
