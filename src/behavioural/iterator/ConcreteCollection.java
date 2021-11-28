package behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCollection implements IterableCollection {

    private List<IterableCollection> collection;

    public ConcreteCollection(List<IterableCollection> cache) {
        if (cache != null) {
            this.collection = cache;
        } else {
            this.collection = new ArrayList<>();
        }
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    
}
