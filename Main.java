import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * order entry system
         * if through catalog or online
         * details or user details
         * order, csr/oec or online 'cart'
         * or itemorder
         * payment
         * supplier
         * shipping
         */

        Scanner s = new Scanner(System.in);
        Collection col = new Collection();

        System.out.println(
                "Welcome to Direct Clothing Inc.'s Order Entry System.\nWhat would you like to do?\nEnter the corresponding number to complete a task.");
        System.out.println("""
                \nEnter:
                '1' to manage customer info
                '2' to manage orders
                '3' to manage inventory
                """);
        int a = s.nextInt();

        if (a == 1) {
            while (true) {
                System.out.println("\nWhat would you like to do?");
                System.out.println("""
                        '1' to add customer info
                        '2' to remove a customer
                        '3' to view customer list
                        """);
                int a1 = s.nextInt();
                s.nextLine();
                if (a1 == 1) {
                    while (true) {
                        System.out.println("\nEnter the following customer info.");
                        System.out.print("Full Name: ");
                        String name = s.nextLine();
                        System.out.print("Email address: ");
                        String email = s.nextLine();
                        System.out.print("Shipping address: ");
                        String address = s.nextLine();
                        System.out.print("Phone number: ");
                        String phonum = s.nextLine();
                        System.out.print("Mode of payment: ");
                        String payment = s.nextLine();
                        System.out.println("\nIs " + name + " a subscriber? y/n ");
                        String subOrNo = s.nextLine();
                        if (subOrNo.equals("y")) {
                            Customer cus = new Subscriber(name, email, address, phonum, payment);
                            System.out.println("\nUser details:");
                            cus.getUserInfo();
                            System.out.println("\n\nAre these info correct? y/n");
                            String correct = s.nextLine();
                            if (correct.equals("y")) {
                                col.addUser(1, cus);
                                System.out.println("""
                                        \nDo you want to add another customer? y/n
                                        Be careful in inputting the command. You
                                        will start over in entering the customer details
                                        if you type in the wrong command.
                                        """);
                                        String ywant = s.nextLine();
                                if (ywant.equals("y")) {
                                    continue;
                                } else if (ywant.equals("n")) {
                                    break;
                                } else {
                                    System.out.println("Invalid command. Try again.");
                                    continue;
                                }
                            } else if (correct.equals("n")) {
                                System.out.println("Enter the customer info again.");
                            } else {
                                System.out.println("Invalid command. Try again");
                                continue;
                            }
                        } else if (subOrNo.equals("n")) {
                            Customer cus = new OnlineUser(name, email, address, phonum, payment);
                            System.out.println("\nUser details:");
                            cus.getUserInfo();
                            System.out.println("\n\nAre these info correct? y/n");
                            String correct = s.nextLine();
                            if (correct.equals("y")) {
                                col.addUser(1, cus);
                                System.out.println("""
                                        \nDo you want to add another customer? y/n
                                        Be careful in inputting the command. You
                                        will start over in entering the customer details
                                        if you type in the wrong command.
                                        """);
                                String ywant = s.nextLine();
                                if (ywant.equals("y")) {
                                    continue;
                                } else if (ywant.equals("n")) {
                                    break;
                                } else {
                                    System.out.println("Invalid command. Try again.");
                                    continue;
                                }
                            } else if (correct.equals("n")) {
                                System.out.println("Enter the customer info again.");
                            } else {
                                System.out.println("Invalid command. Try again");
                                continue;
                            }
                        } else {
                            System.out.println(subOrNo + "is an invalid input. Start over.");
                            continue;
                        }
                    }
                } else if (a1 == 2) {
                    col.printUserList();
                    System.out.println("What user do you want to remove?\nType in the corresponding number.");
                    col.removeCustomer(s.nextInt());
                } else if (a1 == 3) {
                    col.printUserList();
                } else {
                    System.out.println("You entered an invalid number. Please try again.");
                }
                System.out.println("\nDo you want to go back to customer info manager? y/n");
                String ye = s.nextLine();
                if (ye.equals("y")) {
                    continue;
                } else if (ye.equals("n")) {
                    break;
                } else {
                    System.out.println("\nInvalid input. Going back to user info manager.");
                }
            }
        } else if (a == 2) {
            System.out.println("What would you like to do?");
            System.out.println("""
                    '1' to give out order forms to subscribers
                    '2' to add an order ticket to the system
                    '3' to remove a completed ticket
                    '4' check the payment status of an order
                    '5' check the shipping details of an order
                    """);
            int a2 = s.nextInt();
            if (a2 == 1) {
            } else if (a2 == 2) {
            } else if (a2 == 3) {
            } else if (a2 == 4) {
            } else if (a2 == 5) {
            } else {
                System.out.println("You entered an invalid number. Please try again.");
            }
        } else if (a == 3) {
            System.out.println("What would you like to do?");
            System.out.println("""
                    '1' check inventory levels
                    '2' add items to the inventory
                    '3' remove items from the inventory
                    '4' check the prices for customer's catalog
                    """);
            int a3 = s.nextInt();
            if (a3 == 1) {
            } else if (a3 == 2) {
            } else if (a3 == 3) {
            } else {
                System.out.println("You entered an invalid number. Please try again.");
            }
        } else {
            System.out.println("You entered an invalid input. Please try again.");
        }
    }
}