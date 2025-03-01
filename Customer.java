//import java.util.Scanner;

public class Customer {
    private String name
    private String email
    private String address
    private String phoneNum
    private String 
}
/*abstract class Person {
    private String name;
    private String email;
    private String address;

    public Person(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Customer extends Person {
    private int phone;
    private String customerType;

    public Customer(String name, String email, String address, int phone, String customerType) {
        super(name, email, address);
        this.phone = phone;
        this.customerType = customerType;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Phone: ");
        int phone = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Customer Type: ");
        String customerType = scanner.nextLine();

        Customer customer = new Customer(name, email, address, phone, customerType);

        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Customer Type: " + customer.getCustomerType());

        scanner.close();
    }
}*/