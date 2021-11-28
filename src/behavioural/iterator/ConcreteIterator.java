package behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {

    private ConcreteCollection concreteIterator;
    private List<IterableCollection> collection = new ArrayList<>();
    private int currentPosition = 0;

    public ConcreteIterator(ConcreteCollection c) {
        this.concreteIterator = c;
    }

    @Override
    public IterableCollection getNext() {
        if (!hasMore()) {
            return null;
        }

        IterableCollection c = collection.get(currentPosition); 
        currentPosition++;
        return c;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < collection.size();
    }

}
