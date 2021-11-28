package structural.decorator;

public class ConcreteComponent implements Component {

    private String name;

    public ConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        // do something
    }
    
}
