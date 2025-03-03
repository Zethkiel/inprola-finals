import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Collection {
    private int counter;
    private Map<Integer, OrderTaker> orderList;
    private Map<Integer, Customer> userList;
    private ArrayList<Customer> usList;
    private ArrayList<OrderTaker> orList;

    public Collection() {
        this.orderList = new HashMap<>();
        this.userList = new HashMap<>();
        this.usList = new ArrayList<>();
        this.orList = new ArrayList<>();
    }

    public void addU(Customer i) {
        usList.add(i);
    }

    public void addO(OrderTaker i) {
        orList.add(i);
    }
    public void rmO(int i) {
        orList.remove(i);
    }

    public boolean findEmailInCus(String i) {
        for (Customer c : usList) {
            if (c.getEmail().equalsIgnoreCase(i)) {
                return true;
            }
        }
        return false;
    }

    public Customer findCus(String i) {
        for (Customer c : usList) {
            if (c.getEmail().equalsIgnoreCase(i)) {
                return c;
            }
        }
        return null;
    }

    public OrderTaker findO(int i) {
        if (orderList.containsKey(i)) {
            return orderList.get(i);
        }
        return null;
    }

    // add customer to the list
    public void addUser(int c, Customer cus) {
        counter += c;
        userList.put(counter, cus);
    }

    // order ticket (OVERLOAD)
    public void addUser(int c, OrderTaker cus) {
        counter += c;
        orderList.put(counter, cus);
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
            System.out.println("\n==========" + entry.getKey() + "===========" + entry.getValue()
                    + "\n\n------------------------------------------\n\n");
        }
    }
}
