package behavioural.visitor;

public interface Visitor {
    String visit(ElementA e);
    String visit(ElementB e);
}
