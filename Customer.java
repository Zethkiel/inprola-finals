abstract class Customer {
    private String name;
    private String email;
    private String address;
    private String phoneNum;
    private String paymentInfo;
    protected String[] userInfo;
    


    public Customer(String name, String email, String address, String phoneNum, String paymentInfo) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNum = phoneNum;
        this.paymentInfo = paymentInfo;
        this.userInfo = new String[]{name, email, address, phoneNum, paymentInfo};
    }

    abstract String[] getUserInfo();
}

class Subscriber extends Customer {

    Subscriber(String n, String e, String a, String p, String pInfo, String sub) {
        super(n, e, a, p, pInfo);
        this.userInfo = new String[]{n, e, a, p, pInfo, sub};
    }

    String[] getUserInfo() {
        return userInfo;
    }
}

class OnlineUser extends Customer {
    OnlineUser(String n, String e, String a, String p, String pInfo) {
        super(n,e,a,p,pInfo);
    }

    String[] getUserInfo() {
        return userInfo;
    }
}