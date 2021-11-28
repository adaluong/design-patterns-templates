package creational.builder.builders;

import creational.builder.components.*;
import creational.builder.product.ProductA;

public class BuilderA implements Builder {

    private int randomNumber;
    private ComponentA componentA;
    private ComponentB componentB;
    private ProductA result = new ProductA(componentA, componentB);
      
    public void setRandomNumber(int number) {
        this.randomNumber = number;
    }

    @Override
    public void buildStepA(int num) {
    }

    @Override
    public void buildStepB() {
    }

    public ProductA getResult() {
        return this.result;
    }
}
