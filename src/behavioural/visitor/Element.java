package behavioural.visitor;

public interface Element {
    String accept(Visitor visitor);
}
