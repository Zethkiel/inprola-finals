public class Payment {

    // payment method 
    private String method;

    //set the payment method
    public void setPaymentMethod() {
        method = "0";
    }

    public void setPaymentMethod(String pM) {
        method = pM;
    }

    //if a valid method and not through cash, then check if balance is sufficient
    //if cash, then it doesn't check if the user has enough money since it's CoD
    public void paymentVerify(double cost, double bal) {
        if (method.equalsIgnoreCase("credit")
        || method.equalsIgnoreCase("debit")
        || method.equalsIgnoreCase("check")
        || method.equalsIgnoreCase("e-wallet")) {
            if (cost < bal){
                System.out.println("payment has been deducted to the balance./nThe payment is complete.");
            } else {
                System.out.println("Insufficient balance for this purchase./nPlease make sure to have enough balance to proceed with the payment.");
            }
        } else if (method.equalsIgnoreCase("cash")) {
            System.out.println("This purchase is through cash-on-delivery");
        } else {
            System.out.println("This payment method is not recognized, use a valid payment method.(credit, debit, check, e-wallet, or cash");
        }
    }

    //For testing
    public static void main(String[] args) {
        Payment p = new Payment();
        p.setPaymentMethod("cash");
        p.paymentVerify(2323.33, 23342342);
    }
}