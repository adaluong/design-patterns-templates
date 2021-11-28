package structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composite implements Component {

    protected List<Component> components = new ArrayList<>();

    public Composite(Component ... c) {
        add(c);
    }

    public void add(Component c) {
        components.add(c);
    }

    public void add(Component... c) {
        components.addAll(Arrays.asList(c));
    }

    public void remove(Component c) {
        components.remove(c);
    }
    
    public List<Component> getChildren() {
        return components;
    }
    
    @Override
    public void execute() {
        for (Component component : components) {
            component.execute();
        }
    }
    
}
