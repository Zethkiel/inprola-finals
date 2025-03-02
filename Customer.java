abstract class Customer {
    protected String name;
    protected String email;
    protected String address;
    protected String phoneNum;
    protected String paymentInfo;
    protected String[] userInfo;    

    public Customer(String name, String email, String address, String phoneNum, String paymentInfo) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
        this.paymentInfo = paymentInfo;
        this.userInfo = new String[]{name, email, address, phoneNum, paymentInfo};
    }

    abstract void getUserInfo();
}

class Subscriber extends Customer {

    Subscriber(String n, String e, String a, String p, String pInfo) {
        super(n, e, a, p, pInfo);
        this.userInfo = new String[]{n, e, a, p, pInfo};
    }

    void getUserInfo() {
        System.out.printf("Name: %s\nEmail address: %s\nShipping address: %s\nPhone number: %s\nPayment method: %s\n Customer type: subscriber", name, email, address, phoneNum, paymentInfo);
    }
}

class OnlineUser extends Customer {
    OnlineUser(String n, String e, String a, String p, String pInfo) {
        super(n,e,a,p,pInfo);
    }

    void getUserInfo() {
        System.out.printf("Name: %s\nEmail address: %s\nShipping address: %s\nPhone number: %s\nPayment method: %s\n Customer type: online shopper", name, email, address, phoneNum, paymentInfo);

    }
}