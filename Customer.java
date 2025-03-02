abstract class Customer {
    protected String name;
    protected String email;
    protected String address;
    protected String phoneNum;
    protected String paymentStatus;
    protected String[] userInfo;

    public Customer(String name, String email, String address, String phoneNum, String paymentStatus) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
        this.paymentStatus = paymentStatus;
        this.userInfo = new String[] { name, email, address, phoneNum, paymentStatus};
    }

    abstract void getUserInfo();

    public abstract String toString();

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}

class Subscriber extends Customer {

    Subscriber(String n, String e, String a, String p, String pStatus) {
        super(n, e, a, p, pStatus);
        this.userInfo = new String[] { n, e, a, p, pStatus};
    }

    void getUserInfo() {
        System.out.printf(
                "Name: %s\nEmail address: %s\nShipping address: %s\nPhone number: %s\nPayment status: %s\nCustomer type: subscriber",
                name, email, address, phoneNum, paymentStatus);
    }

    @Override
    public String toString() {
        return "Subscriber: " + name + ", " + email + ", " + address + ", " + phoneNum + ", " + paymentStatus;
    }
}

class OnlineUser extends Customer {
    OnlineUser(String n, String e, String a, String p, String pStatus) {
        super(n, e, a, p, pStatus);
    }

    void getUserInfo() {
        System.out.printf(
                "Name: %s\nEmail address: %s\nShipping address: %s\nPhone number: %s\nPayment status: %s\nCustomer type: online shopper",
                name, email, address, phoneNum, paymentStatus);
    }

    @Override
    public String toString() {
        return "Online User: " + name + ", " + email + ", " + address + ", " + phoneNum + ", " + paymentStatus;
    }
}