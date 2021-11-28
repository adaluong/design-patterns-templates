package structural.composite;

public class Leaf implements Component {
    
    private int num;

    public Leaf(int num) {
        this.num = num;
    }
    
    @Override
    public void execute() {
        // do stuff   
    }
    
}
