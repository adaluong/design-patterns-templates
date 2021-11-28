package creational.factory.factory;

import creational.factory.product.ConcreteProductA;
import creational.factory.product.Product;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
    
}
