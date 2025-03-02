abstract class Customer {
    protected String name;
    protected String email;
    protected String address;
    protected String phoneNum;
    protected String[] userInfo;

    public Customer(String name, String email, String address, String phoneNum) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
        this.userInfo = new String[] { name, email, address, phoneNum};
    }

    abstract void getUserInfo();

    public abstract String toString();

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phoneNum;
    }
}

class Subscriber extends Customer {

    Subscriber(String n, String e, String a, String p) {
        super(n, e, a, p);
        this.userInfo = new String[] { n, e, a, p};
    }

    void getUserInfo() {
        System.out.printf(
                "Name: %s\nEmail address: %s\nShipping address: %s\nPhone number: %s\nCustomer type: subscriber",
                name, email, address, phoneNum);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nEmail address: %s\nShipping address: %s\nPhone number: %s\nCustomer type: subscriber",name, email, address, phoneNum);
    }
}

class OnlineUser extends Customer {
    OnlineUser(String n, String e, String a, String p) {
        super(n, e, a, p);
    }

    void getUserInfo() {
        System.out.printf(
                "Name: %s\nEmail address: %s\nShipping address: %s\nPhone number: %s\nCustomer type: online shopper",
                name, email, address, phoneNum);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nEmail address: %s\nShipping address: %s\nPhone number: %s\nCustomer type: online shopper",
                name, email, address, phoneNum);
    }
}