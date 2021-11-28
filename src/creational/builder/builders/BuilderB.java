package creational.builder.builders;

import creational.builder.components.*;
import creational.builder.product.ProductB;

public class BuilderB implements Builder {

    private int randomNumber;
    private ComponentA componentA;
    private ComponentB componentB;
    private ProductB result = new ProductB(componentA, componentB);
      
    public void setRandomNumber(int number) {
        this.randomNumber = number;
    }

    @Override
    public void buildStepA(int num) {
    }

    @Override
    public void buildStepB() {
        result.setFeatureB();
    }

    public ProductB getResult() {
        return this.result;
    }
}
