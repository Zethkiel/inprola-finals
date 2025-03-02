import java.time.LocalDate;

public class OrderTaker {
    private final String orderId;
    private LocalDate currentDate;
    private Customer cus;
    private String payment;
    private String status;

    public OrderTaker(Customer cus, String payment) {
        this.currentDate = LocalDate.now();
        this.status = "pending";
        this.cus = cus;
        this.orderId = currentDate.toString();
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order id: " + orderId + "\nCustomer info:\n" cus + "\nPayment method: " + payment + "\nPayment status: " + status;
    }

    
}

class Main4 {
    public static void main(String[] args) {
        OrderTaker o = new OrderTaker();
        o.erre();
    }
}