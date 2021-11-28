package creational.builder;

import creational.builder.builders.Builder;

public class Director {

    public void constructProductA(Builder builder) {
        builder.buildStepA(10);
        builder.buildStepB();
    }
    
    public void constructProductB(Builder builder) {
        builder.buildStepA(200);
        builder.buildStepB();
    }
}
