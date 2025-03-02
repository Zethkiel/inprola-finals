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
            System.out.println("\nWhat would you like to do?");
            System.out.println("""
                    '1' to add customer info
                    '2' to remove a customer
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
                System.out.println("Is " + name + " a subscriber? y/n ");
                String subOrNo = s.nextLine();
                if (subOrNo.equals("y")) {
                    Customer cus = new Subscriber(name, email, address, phonum, payment);
                    System.out.println("User details:");
                    cus.getUserInfo();
                    System.out.println("\nAre these info correct? y/n");
                    if (s.nextLine().equals("y")) {
                        Collection col = new Collection();
                        col.addUser(1, cus);
                            System.out.println("""
                                    \nDo you want to add another customer? y/n
                                    Be careful in inputting the command. You 
                                    will start over in entering the customer details
                                    if you type in the wrong command.
                                    """);
                            if (s.nextLine().equals("y")) {
                                continue;
                            } else if (s.nextLine().equals("n")) {
                                break;
                            } else {
                                System.out.println("Invalid command. Try again.");
                                continue;
                            }
                    } else if (s.nextLine().equals("n")) {
                        System.out.println("Enter the customer info again.");
                    } else {
                        System.out.println("Invalid command. Try again");
                        continue;
                    }
                } else if ((subOrNo.equals("n"))) {
                    if (subOrNo.equals("y")) {
                        Customer cus = new OnlineUser(name, email, address, phonum, payment);
                        System.out.println("User details:");
                        cus.getUserInfo();
                        System.out.println("\nAre these info correct? y/n");
                        if (s.nextLine().equals("y")) {
                            Collection col = new Collection();
                            col.addUser(1, cus);
                                System.out.println("""
                                        \nDo you want to add another customer? y/n
                                        Be careful in inputting the command. You 
                                        will start over in entering the customer details
                                        if you type in the wrong command.
                                        """);
                                if (s.nextLine().equals("y")) {
                                    continue;
                                } else if (s.nextLine().equals("n")) {
                                    break;
                                } else {
                                    System.out.println("Invalid command. Try again.");
                                    continue;
                                }
                        } else if (s.nextLine().equals("n")) {
                            System.out.println("Enter the customer info again.");
                        } else {
                            System.out.println("Invalid command. Try again");
                            continue;
                        }
                    }
                }
            }
            } else if (a1 == 2) {
            } else {
                System.out.println("You entered an invalid number. Please try again.");
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

/*
 * Customer cus = new Customer();
 * 
 * 
 * Clothing clo = new Clothing();
 * Scanner s = new Scanner(System.in);
 * Scanner t = new Scanner(System.in);
 * Scanner u = new Scanner(System.in);
 * Scanner v = new Scanner(System.in);
 * 
 * while (true) {
 * System.out.println("""
 * Clothing design? Type:
 * '1' for Plain Red T-shirt
 * '2' for Orange Jacket
 * '3' for Light Yellow Dress
 * '4' for Dark Green Cargo Pants
 * '5' for Blue Polo Shirt
 * '6' for Indigo Long Sleeve
 * '7' for Long Violet Skirt
 * """);
 * 
 * int type = s.nextInt();
 * 
 * if (type < 1 || type > 7) {
 * System.out.println(c.checkClothing(type, 0));
 * break;
 * }
 * 
 * System.out.println("""
 * 
 * Cloth size? Type:
 * '1' for XS
 * '2' for S
 * '3' for M
 * '4' for L
 * '5' for XL
 * '6' for 2XL
 * '7' for 3XL
 * """);
 * 
 * int size = t.nextInt();
 * 
 * if (size < 1 || size > 7) {
 * System.out.println(c.checkClothing(type, size));
 * break;
 * }
 * 
 * System.out.println("\nHow many of " + c.checkClothing(type, size) +
 * " would you like to buy?\n");
 * int amt = u.nextInt();
 * c.itemCount(amt);
 * 
 * System.out.println("");
 * System.out.println(c.toString());
 * System.out.println("\n---------------------");
 * System.out.println("---------------------");
 * System.out.println("---------------------");
 * 
 * System.out.println("\nDo you want to add another order? y/n");
 * String yn = v.nextLine();
 * if (yn.equals("n")) {
 * break;
 * } else {
 * System.out.println("");
 * continue;
 * }
 * }
 * s.close();
 * t.close();
 * u.close();
 * v.close();
 * }
 * }
 */