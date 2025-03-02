import java.util.HashMap;
import java.util.Map;

public class Collection {
    private int counter;
    private Map<Integer, OrderTaker> orderList;
    private Map<Integer, Customer> userList;

    public Collection() {
        this.orderList = new HashMap<>();
        this.userList = new HashMap<>();
        this.counter = 0;
    }

    // add customer to the list
    public void addUser(int c, Customer cus) {
        counter += c;
        userList.put(counter, cus);
    }

    // order ticket
    public void addUser(int c, OrderTaker oT) {
        counter += c;
        orderList.put(counter, oT);
    }

    // remove a customer from the list
    public void removeCustomer(int cusNumToRemove) {
        userList.remove(cusNumToRemove);

        // make a new hashmap to update the list
        Map<Integer, Customer> newUserList = new HashMap<>();

        // create a new hashmap to adjust the numbers of the customers
        for (Map.Entry<Integer, Customer> entry : userList.entrySet()) {
            int newKey = entry.getKey() > cusNumToRemove ? entry.getKey() - 1 : entry.getKey();
            newUserList.put(newKey, entry.getValue());
        }

        userList = newUserList;
    }

    // remove an order ticket
    public void removeOrder(int orderNumToRemove) {
        userList.remove(orderNumToRemove);

        // make a new hashmap to update the list
        Map<Integer, OrderTaker> newOrderList = new HashMap<>();

        // create a new hashmap to adjust the numbers corresponding the orders
        for (Map.Entry<Integer, OrderTaker> entry : orderList.entrySet()) {
            int newKey = entry.getKey() > orderNumToRemove ? entry.getKey() - 1 : entry.getKey();
            newOrderList.put(newKey, entry.getValue());
        }

        orderList = newOrderList;
    }

    public void printUserList() {
        System.out.println("\nUsers:");
        for (Map.Entry<Integer, Customer> entry : userList.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    public void printOrderList() {
        System.out.println("\nOrders:");
        for (Map.Entry<Integer, OrderTaker> entry : orderList.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}