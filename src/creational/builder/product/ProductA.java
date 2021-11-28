package creational.builder.product;
import creational.builder.components.*;

public class ProductA {

    private final ComponentA componentA;
    private final ComponentB componentB;

    public ProductA(ComponentA componentA, ComponentB componentB) {
        this.componentA = componentA;
        this.componentB = componentB;
    }   
    
}
