package behavioural.visitor;

public class ElementB implements Element {
    
    public ElementB() {

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
