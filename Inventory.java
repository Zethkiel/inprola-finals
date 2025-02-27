import java.util.Scanner;

public class Inventory {
    //here it shows the stock levels
    public void checkInventory() {
        String[] shirtTypes = {"Red", "Green", "Blue", "Yellow"};
        int[] stock = {100, 100, 100, 100};
        Scanner scanner = new Scanner(System.in);
    //here is a while true loop so that ppl are able to order another after placing 1 order
        while (true) {
            System.out.println("\nAvailable shirts:");
            for (int i = 0; i < shirtTypes.length; i++) {
                System.out.println(i + ": " + shirtTypes[i] + " (" + stock[i] + " in stock)");
            }
    //here is where it accepts inputs for what they want to order
            System.out.print("\nEnter the number of the shirt you want to purchase: ");
            int shirtIndex = scanner.nextInt();
    //This happens when they choose an invalid selection of a shirt
            if (shirtIndex < 0 || shirtIndex >= shirtTypes.length) {
                System.out.println("Invalid shirt selection. Please try again.");
                continue;
            }
    //here is where it accepts inputs for how much they want to order
            System.out.print("How many would you like to purchase? ");
            int quantity = scanner.nextInt();
    //This happens when they input a valid amount
            if (quantity <= 0) {
                System.out.println("Invalid quantity. Please try again.");
                continue;
            }
    //This updates the current inventory levels depending on their order
            Supplier.purchaseShirt(stock, shirtTypes, shirtIndex, quantity);

            checkStock(stock[shirtIndex], shirtTypes[shirtIndex]);
    //This is to ask the user if they want to order another
            System.out.print("\nDo you want to continue purchasing? (y/n): ");
            char choice = scanner.next().toLowerCase().charAt(0); 

            if (choice == 'n') {
                System.out.println("Thank you for shopping! Exiting program.");
                break;
            } else if (choice != 'y') {
                System.out.println("Invalid input. Exiting program.");
                break;
            }
        }

        scanner.close();
    }
    //this is to show the status of your inventory
    public void checkStock(int stockLevel, String shirtType) {
        if (stockLevel == 0) {
            System.out.println(shirtType + " shirt is out of stock.");
        } else if (stockLevel < 20) {
            System.out.println(shirtType + " shirt is running low.");
        } else {
            System.out.println(shirtType + " shirt is available.");
        }
    }
}



