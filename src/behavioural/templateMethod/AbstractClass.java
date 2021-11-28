package behavioural.templateMethod;

public abstract class AbstractClass {
    
    AbstractClass() {}

    public boolean method() {
        return true;
    }

    abstract boolean stepOne();
    abstract void stepTwo();

}
