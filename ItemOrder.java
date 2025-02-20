public class ItemOrder {
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
