import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*order entry system
         * if through catalog or online 
         * details or user details
         * order, csr/oec or online 'cart'
         * or itemorder
         * payment
         * supplier
         * shipping
         */

         Scanner s = new Scanner(System.in);


        System.out.println("Welcome to Direct Clothing Inc.'s Order Entry System.\nWhat would you like to do?\nEnter the corresponding number to complete a task.");
        System.out.println("""
                \nEnter:
                '1' to manage customer info
                '2' to manage orders
                '3' to manage inventory
                '4' to verify payments
                '5' to review shipping details
                """);
        int a = s.nextInt();

        if (a==1) {
            System.out.println("What would you like to do?");
            System.out.println("""
                    '1' to add customer info
                    '2' to remove a customer
                    """);
        } else if (a==2) {
            System.out.println("What would you like to do?");
            System.out.println("""
                    '1' to give out order forms to subscribers
                    '2' to add an order ticket to the system 
                    '3' to remove a completed ticket
                    """;);
        } else if (a==3) {
            System.out.println("What would you like to do?");
            System.out.println("""
                    '1' check inventory levels
                    '2' add items to the inventory
                    '3' remove items from the inventory
                    """;);
        } else if (a==4) {
            System.out.println("What would you like to do?");
            System.out.println("""
                    '1' check the payment status of an order
                    """);
        } else if (a==5) {
            System.out.println("What would you like to do?");
            System.out.println("""
                    '1' check the shipping details of an order 
                    """);
        } else {

        }

        Customer cus = new Customer();

        
        Clothing clo = new Clothing();
        Scanner s = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        Scanner u = new Scanner(System.in);
        Scanner v = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Clothing design? Type:
                    '1' for Plain Red T-shirt
                    '2' for Orange Jacket
                    '3' for Light Yellow Dress
                    '4' for Dark Green Cargo Pants
                    '5' for Blue Polo Shirt
                    '6' for Indigo Long Sleeve
                    '7' for Long Violet Skirt
                    """);

            int type = s.nextInt();

            if (type < 1 || type > 7) {
                System.out.println(c.checkClothing(type, 0)); 
                break;
            }

            System.out.println("""
                
                    Cloth size? Type:
                    '1' for XS
                    '2' for S
                    '3' for M
                    '4' for L
                    '5' for XL
                    '6' for 2XL
                    '7' for 3XL
                    """);

            int size = t.nextInt();

            if (size < 1 || size > 7) {
                System.out.println(c.checkClothing(type, size)); 
                break;
            }

            System.out.println("\nHow many of " + c.checkClothing(type, size) + " would you like to buy?\n");
            int amt = u.nextInt();
            c.itemCount(amt);

            System.out.println("");
            System.out.println(c.toString());
            System.out.println("\n---------------------");
            System.out.println("---------------------");
            System.out.println("---------------------");

            System.out.println("\nDo you want to add another order? y/n");
            String yn = v.nextLine();
            if (yn.equals("n")) {
                break;
            } else {
                System.out.println("");
                continue;
            }
        }
        s.close();
        t.close();
        u.close();
        v.close();
    }
}
