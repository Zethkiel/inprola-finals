import java.util.List;
 
public class Shipping {
    private List<Collection> collections;
 
    public Shipping(List<Collection> collections) {
        this.collections = collections;
    }
 
    public String checkOrderStatus(int orderId) {
        for (Collection collection : collections) {
            OrderTaker order = collection.findO(orderId);
            if (order != null) {
                if ("paid".equalsIgnoreCase(order.getPending())) {
                    return "The order has been shipped.";
                } else {
                    return "The order has not been paid.";
                }
            }
        }
        return "Order not found.";
    }
}