/*public class ItemOrder {
    private int orderId;
    private String itemDesc;

    public ItemOrder(int orderId, String itemDesc) {
        this.orderId = orderId;
        this.itemDesc = itemDesc;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
    }

    public static void displayAllOrders(ItemOrder[] orders) {
        for (ItemOrder order : orders) {
            if (order != null) {
                order.displayOrder();
            }
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        // Create an array of ItemOrder objects
        ItemOrder[] orders = new ItemOrder[3];

        // Initialize the ItemOrder objects
        orders[0] = new ItemOrder(1, "Laptop");
        orders[1] = new ItemOrder(2, "Smartphone");
        orders[2] = new ItemOrder(3, "Tablet");

        // Display individual orders
        for (ItemOrder order : orders) {
            order.displayOrder();
        }

        // Display all orders using the static method
        System.out.println("Displaying all orders:");
        ItemOrder.displayAllOrders(orders);
    }
}*/