package behavioural.iterator;

public interface Iterator {
    IterableCollection getNext();
    boolean hasMore();
}
