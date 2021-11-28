package creational.abstractFactory.factories;

import creational.abstractFactory.productA.ProductA;
import creational.abstractFactory.productA.ProductA1;
import creational.abstractFactory.productB.ProductB;
import creational.abstractFactory.productB.ProductB1;

public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB1();
    }
    
}
