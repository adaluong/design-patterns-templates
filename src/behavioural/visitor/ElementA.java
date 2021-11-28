package behavioural.visitor;

public class ElementA implements Element {

    public ElementA() {

    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
