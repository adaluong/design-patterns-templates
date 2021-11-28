package creational.factory.factory;

import creational.factory.product.ConcreteProductB;
import creational.factory.product.Product;

public class ConcreteCreatorB extends Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }

}
