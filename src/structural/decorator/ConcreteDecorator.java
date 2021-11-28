package structural.decorator;

public class ConcreteDecorator extends BaseDecorator {

    ConcreteDecorator(Component source) {
        super(source);
    }

    public void extraMethod() {
        // do something
    }
    
}
