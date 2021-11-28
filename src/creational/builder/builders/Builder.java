package creational.builder.builders;

import creational.builder.components.*;

// defines all possible ways to configure a product
public interface Builder {
    void buildStepA(int num);
    void buildStepB();
}
