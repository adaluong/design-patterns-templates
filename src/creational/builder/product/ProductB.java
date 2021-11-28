package creational.builder.product;
import creational.builder.components.*;

public class ProductB {

    private final ComponentA componentA;
    private final ComponentB componentB;

    public ProductB(ComponentA componentA, ComponentB componentB) {
        this.componentA = componentA;
        this.componentB = componentB;
    }   

    public void setFeatureB() {
        
    }
    
}
