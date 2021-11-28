package behavioural.templateMethod;

public class ConcreteClassA extends AbstractClass {

    public ConcreteClassA() {

    }
    
    @Override
    boolean stepOne() {
        // some implementation
        return false;
    }

    @Override
    void stepTwo() {
        // some implementation        
    }

    public void extraMethod() {
        System.out.println("yay");
    }
    
}
