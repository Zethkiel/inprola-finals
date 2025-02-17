public class Payment {

    private String paymentMethod;

    public void setPaymentMethod(String pM) {
        paymentMethod = pM;
    }

    public void paymentMethod() {
        if (paymentMethod.equalsIgnoreCase("credit")) {
        } else if (paymentMethod.equalsIgnoreCase("debit")) {
        } else if (paymentMethod.equalsIgnoreCase("check")) {
        } else if (paymentMethod.equalsIgnoreCase("e-wallet")) {
        } else if (paymentMethod.equalsIgnoreCase("cash")) {
        } else {
            System.out.println("The payment method is invalid. Please try again.");
        }
    }

    public bool payment(double cost, double bal) {
        if (paymentMethod.equalsIgnoreCase("credit")
        || paymentMethod.equalsIgnoreCase("debit")
        || paymentMethod.equalsIgnoreCase("check")
        || paymentMethod.equalsIgnoreCase("ewallet")) {
            if (cost < bal){
                return true;
            } else {
                return false;
            }
        } else if (paymentMethod.equalsIgnoreCase(cash)) {
            return true;
        } else {
            return false;
        }
    }

    public String paymentVerify() {
        if (minusBalance() == true) {
            return "The payment has been deducted to your balance./nThe payment is complete.";
        } else {
            return "You have insufficient balance for this purchase./nPlease make sure you have enough balance to proceed with the payment.";
        }
    }

    public isThePaymentBalanceSufficient() {}

}