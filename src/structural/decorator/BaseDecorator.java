package structural.decorator;

public class BaseDecorator implements Component {

    private Component wrappee;

    BaseDecorator(Component source) {
        this.wrappee = source;
    }

    @Override
    public void execute() {
        System.out.println("wow");       
    }
    
}
