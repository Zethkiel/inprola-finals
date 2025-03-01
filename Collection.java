import java.util.HashMap;
import java.util.Map;

public class Collection {
    private int counter;
    private Map<Integer, Customer> userCollection;
    private Map<Integer, OrderTaker> orderCollection;

    public Collection() {
        this.orderCollection = new HashMap<>();
        this.userCollection = new HashMap<>();
        this.counter = 0;
    }

    public void addUser(int c, Customer cus) {
        counter += c;
        userCollection.put(counter, cus);
    }

    public void addUser(int c, OrtedTaker iO) {
        counter += c;
        orderCollection.put(counter, iO);
    }
}
