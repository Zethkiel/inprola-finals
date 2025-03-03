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
        Collection col1 = new Collection();
        Collection col2 = new Collection();
        Clothing clo = new Clothing();
        Customer cus;
        Customer cus1;
        OrderTaker oT;

        while (true) {
            System.out.println(
                    "\nWelcome to Direct Clothing Inc.'s Order Entry System.\n\nWhat would you like to do?\n\nEnter the corresponding number to complete a task.");
            System.out.println("""
                    \nEnter:
                    '1' to manage customer info
                    '2' to manage orders
                    '3' to manage inventory
                    '4' to quit
                    """);
            String a = s.nextLine();

            if (a.equals("1")) {
                while (true) {
                    System.out.println("\nWhat would you like to do?");
                    System.out.println("""
                            '1' to add customer info
                            '2' to remove a customer
                            '3' to view customer list
                            '4' to go back
                            """);
                    String a1 = s.nextLine();
                    if (a1.equals("1")) {
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
                            System.out.println("\nIs " + name + " a subscriber? y/n ");
                            String subOrNo = s.nextLine();
                            if (subOrNo.equals("y")) {
                                cus = new Subscriber(name, email, address, phonum);
                                System.out.println("\nUser details:");
                                cus.getUserInfo();
                                System.out.println("\n\nAre these info correct? y/n");
                                String correct = s.nextLine();
                                if (correct.equals("y")) {
                                    col1.addUser(1, cus);
                                    col1.addU(cus);
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
                                cus = new OnlineUser(name, email, address, phonum);
                                System.out.println("\nUser details:");
                                cus.getUserInfo();
                                System.out.println("\n\nAre these info correct? y/n");
                                String correct = s.nextLine();
                                if (correct.equals("y")) {
                                    col1.addUser(1, cus);
                                    col1.addU(cus);
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
                    } else if (a1.equals("2")) {
                        col1.printUserList();
                        System.out.println("What user do you want to remove?\nType in the corresponding number.");
                        int qw = s.nextInt();
                        col1.removeCustomer(qw);
                        col1.rmU(qw);
                    } else if (a1.equals("3")) {
                        col1.printUserList();
                    } else if (a1.equals("4")) {
                        break;
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
                        continue;
                    }
                }
            } else if (a.equals("2")) {
                while (true) {
                    System.out.println("\nWhat would you like to do?");
                    System.out.println("""
                            '1' to give out order forms to subscribers
                            '2' to add an order ticket to the system
                            '3' to remove a completed ticket
                            '4' change the payment status of an order to paid
                            '5' change the shipping details of an order
                            '6' to view the list of past orders
                            '7' to go back
                            """);
                    String a2 = s.nextLine();
                    if (a2.equals("1")) {
                        while (true) {
                            System.out.println(
                                    "\nWhich customer would you like to give the form to?\nType in the complete email-address of the customer");
                            String sub = s.nextLine();
                            if (col1.findEmailInCus(sub) == true) {
                                System.out
                                        .println("You have successfully given " + col1.findCus(sub).getName()
                                                + " a form.");
                            } else {

                                System.out.println("There's no customer with this email-address.");
                                System.out.println("\nDo you want to find another e-mail? y/n");
                                String p = s.nextLine();
                                if (p.equals("y")) {
                                    continue;
                                } else if (p.equals("n")) {
                                    break;
                                } else {
                                    System.out.println("Invalid input. Try again");
                                    break;
                                }
                            }
                        }

                    } else if (a2.equals("2")) {
                        while (true) {
                            System.out.println("\nWho placed an order? Type the customers e-mail.");
                            String email = s.nextLine();
                            if (col1.findCus(email) instanceof Subscriber) {
                                Subscriber user = (Subscriber) col1.findCus(email);
                                String q = user.getName();
                                String b = user.getEmail();
                                String c = user.getAddress();
                                String d = user.getPhone();
                                cus1 = new Subscriber(q, b, c, d);
                                System.out.println();
                                System.out.println(
                                        "What is the payment method used for this purchase? (cash, credit, e-wallet)");
                                String meth = s.nextLine();
                                if (meth.equalsIgnoreCase("cash") || meth.equalsIgnoreCase("credit")
                                        || meth.equalsIgnoreCase("e-wallet")) {
                                    oT = new OrderTaker(cus1, meth);
                                    System.out.println("\nOrder details:");
                                    System.out.println(oT.toString());
                                    System.out.println("\n\nAre these info correct? y/n");
                                    String correct = s.nextLine();
                                    if (correct.equals("y")) {
                                        col2.addUser(1, oT);
                                        col2.addO(oT);
                                        System.out.println("""
                                                \nDo you want to add a new order? y/n
                                                Be careful in inputting the command. You
                                                will start over in entering the details
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
                                }
                            } else if (col1.findCus(email) instanceof OnlineUser) {
                                OnlineUser user = (OnlineUser) col1.findCus(email);
                                String q = user.getName();
                                String b = user.getEmail();
                                String c = user.getAddress();
                                String d = user.getPhone();
                                cus1 = new OnlineUser(q, b, c, d);
                                System.out.println();
                                System.out.println(
                                        "\nWhat is the payment method used for this purchase? (cash, credit, e-wallet)");
                                String meth = s.nextLine();
                                if (meth.equalsIgnoreCase("cash") || meth.equalsIgnoreCase("credit")
                                        || meth.equalsIgnoreCase("e-wallet")) {
                                    oT = new OrderTaker(cus1, meth);
                                    System.out.println("\nOrder details:");
                                    System.out.println(oT.toString());
                                    System.out.println("\n\nAre these info correct? y/n");
                                    String correct = s.nextLine();
                                    if (correct.equals("y")) {
                                        col2.addUser(1, oT);
                                        col2.addO(oT);
                                        System.out.println("""
                                                \nDo you want to add a new order? y/n
                                                Be careful in inputting the command. You
                                                will start over in entering the details
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
                                }
                            } else {
                                System.out.println(
                                        "This e-mail is not recognized among the registered customers. Please try a different one.");
                                continue;
                            }
                        }
                    } else if (a2.equals("3")) {
                        col2.printOrderList();
                        System.out.println("\nWhat order do you want to remove?\nType in the corresponding number.");
                        int r = s.nextInt();
                        col2.removeOrder(r);
                    } else if (a2.equals("4")) {
                        System.out.println("\nWhat order do you want to mark as paid? Enter the order number.\n");
                        col2.printOrderList();

                    } else if (a2.equals("5")) {
                    } else if (a2.equals("6")) {
                        col2.printOrderList();
                    } else if (a2.equals("7")) {
                        break;
                    } else {
                        System.out.println("You entered an invalid number. Please try again.");
                        continue;
                    }
                    System.out.println("\nDo you want to go back to the order manager tab? y/n");
                    String ye = s.nextLine();
                    if (ye.equals("y")) {
                        continue;
                    } else if (ye.equals("n")) {
                        break;
                    } else {
                        System.out.println("\nInvalid input. Going back to order manager tab.");
                        continue;
                    }
                }
            } else if (a.equals("3")) {
                while (true) {
                    System.out.println("\nWhat would you like to do?");
                    System.out.println("""
                            '1' check inventory levels
                            '2' manage inventory levels
                            '3' check the prices based on catalog's date
                            '4' to go back
                            """);
                    String a3 = s.nextLine();
                    if (a3.equals("1")) {
                        System.out.println("");
                        clo.listInventory();
                    } else if (a3.equals("2")) {
                        System.out.println("");
                        clo.designAndSize();
                    } else if (a3.equals("3")) {
                        System.out.println("Find the pricelist of our items based on the date of the catalog.");
                        System.out.print("Enter Month number: ");
                        int month = s.nextInt();
                        System.out.print("Enter Year number: ");
                        int year = s.nextInt();
                        System.out.println("\n---------------------------------------------");

                        Catalog catalog = new Catalog(month, year); // displays user's catalog details
                        catalog.setDetails();
                        System.out.println("\nCatalog date: " + catalog.getDetails() + "");
                        System.out.println("\n---------------------------------------------\n");

                        CloseOutItems closeOutItems = new CloseOutItems();
                        closeOutItems.month = month; // initialize values properly
                        closeOutItems.year = year;
                        closeOutItems.section();
                        System.out.println("---------------------------------------------");

                        MonthlySpecials monthlySpecials = new MonthlySpecials();
                        monthlySpecials.month = month;
                        monthlySpecials.year = year;
                        monthlySpecials.section();
                        System.out.println("---------------------------------------------");

                        NormalPrices normalPrices = new NormalPrices();
                        normalPrices.month = month;
                        normalPrices.year = year;
                        normalPrices.section();
                    } else if (a3.equals("4")) {
                        break;
                    } else {
                        System.out.println("You entered an invalid number. Please try again.");
                        continue;
                    }
                    System.out.println("\nDo you want to go back to the inventory manager tab? y/n");
                    String ye = s.nextLine();
                    if (ye.equals("y")) {
                        continue;
                    } else if (ye.equals("n")) {
                        System.out.println("\nGoing back to the main page......\n");
                        break;
                    } else {
                        System.out.println("\nInvalid input. Going back to inventory manager tab.");
                        continue;
                    }
                }
            } else if (a.equals("4")) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("You entered an invalid input. Please try again next time.");
                break;
            }
        }
    }
}