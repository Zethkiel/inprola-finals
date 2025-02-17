public class Payment {

    private boolean paymentverification;
    privateString paymentMethod;

    public Payment() {
        boolean paymentVerification;
        String paymentMethod;
    }

    public Payment(bool pV, String pM) {
        boolean paymentVerification = pV;
        String paymentMethod = pM;
    }

    public Payment(String pM, bool pV) {
        boolean paymentVerification = pV;
        String paymentMethod = pM;
    }

    public void paymentMethod() {
        if (paymentMethod.equalsIgnoreCase("credit")) {} 
        else if (paymentMethod.equalsIgnoreCase("debit")) {} 
        else if (paymentMethod.equalsIgnoreCase("check")) {}
        else if (paymentMethod.equalsIgnoreCase("e-wallet")) {}
        else if (paymentMethod.equalsIgnoreCase("cash")) {
        } else {
            System.out.println("The payment method is invalid. Please try again.");
        }
    }

    public paymentVerify() {}

    public isThePaymentBalanceSufficient() {}

}