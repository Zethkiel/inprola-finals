import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        String[] shirtTypes = {"Red", "Green", "Blue", "Yellow"};
        int[] stock = {100, 100, 100, 100};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAvailable shirts:");
            for (int i = 0; i < shirtTypes.length; i++) {
                System.out.println(i + ": " + shirtTypes[i] + " (" + stock[i] + " in stock)");
            }

            System.out.print("\nEnter the number of the shirt you want to purchase: ");
            int shirtIndex = scanner.nextInt();

            if (shirtIndex < 0 || shirtIndex >= shirtTypes.length) {
                System.out.println("Invalid shirt selection. Please try again.");
                continue;
            }

            System.out.print("How many would you like to purchase? ");
            int quantity = scanner.nextInt();

            if (quantity <= 0) {
                System.out.println("Invalid quantity. Please try again.");
                continue;
            }

            Supplier.purchaseShirt(stock, shirtTypes, shirtIndex, quantity);

            checkStock(stock[shirtIndex], shirtTypes[shirtIndex]);

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

    public static void checkStock(int stockLevel, String shirtType) {
        if (stockLevel == 0) {
            System.out.println(shirtType + " shirt is out of stock.");
        } else if (stockLevel < 20) {
            System.out.println(shirtType + " shirt is running low.");
        } else {
            System.out.println(shirtType + " shirt is available.");
        }
    }
}



