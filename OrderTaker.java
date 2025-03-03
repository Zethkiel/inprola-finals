import java.time.LocalDate;

public class OrderTaker {
    private LocalDate currentDate;
    private Customer cus;
    private String payment;
    private String status;
    

    public OrderTaker(Customer cus, String payment) {
        this.currentDate = LocalDate.now();
        this.status = "pending";
        this.cus = cus;
        this.payment = payment;
    }

    public void setPending(String i) {
        status = i;
    }

    public String getPending() {
        return status;
    }

    @Override
    public String toString() {
        return "\nOrder date - " + currentDate + "\n\nCustomer info - \n" + cus + "\nPayment method - " + payment + "\nPayment status - " + status;
    }

    
}