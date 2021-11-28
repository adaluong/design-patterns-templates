package creational.abstractFactory.factories;

import creational.abstractFactory.productA.ProductA;
import creational.abstractFactory.productB.ProductB;

public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}
