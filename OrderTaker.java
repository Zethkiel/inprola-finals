import java.time.LocalDate;

public class OrderTaker {
    private LocalDate currentDate;
    private Customer cus;
    private String payment;
    private String status;
    private String spec;


    public OrderTaker(Customer cus, String payment, String spec) {
        this.currentDate = LocalDate.now();
        this.status = "pending";
        this.cus = cus;
        this.payment = payment;
        this.spec = spec;
    }

    public void setPending(String i) {
        this.status = i;
    }

    public String getPending() {
        return status;
    }

    @Override
    public String toString() {
        return "\nOrder date - " + currentDate + "\n\nCustomer info - \n" + cus + "\nPayment method - " + payment + "\nPayment status - " + status +  "\nItem specification - " + spec ;
    }

    
}