package behavioural.templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(reader.readLine());
        AbstractClass obj = null;

        if (choice == 1) {
            obj = new ConcreteClassA();
        } else if (choice == 2) {
            obj = new ConcreteClassB();
        }

        obj.method();
    }
            
}
