package creational.abstractFactory.factories;

import creational.abstractFactory.productA.ProductA;
import creational.abstractFactory.productA.ProductA2;
import creational.abstractFactory.productB.ProductB;
import creational.abstractFactory.productB.ProductB2;

public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB2();
    }
    
}
