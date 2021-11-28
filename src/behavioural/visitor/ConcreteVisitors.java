package behavioural.visitor;

public class ConcreteVisitors implements Visitor {

    public String export(Element... args) {
        String string = " ";
        for (Element element : args) {
            string += element.accept(this);
        }
        return string;
    }
    
    @Override
    public String visit(ElementA e) {
        return "visited ElementA";
    }

    @Override
    public String visit(ElementB e) {
        return "visited ElementB";
    }
    
}
