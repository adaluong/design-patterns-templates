package creational.singleton;

public final class Singleton {

    // volatile used to modify the value of a variable by different threads
    // makes classes thread safe
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {

        Singleton result = instance;
        if (result != null) {
            return result; // important for concurrency
        }

        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
    
}
