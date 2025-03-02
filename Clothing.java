import java.util.HashMap;
import java.util.Scanner;

public class Clothing {

    private final String[] designs = {"Plain Red T-shirt", "Orange Jacket", "Light Yellow Dress",
            "Dark Green Cargo Pants", "Blue Polo Shirt", "Indigo Long Sleeve", "Long Violet Skirt"};
    private final String[] sizes = {"XS", "S", "M", "L", "XL", "2XL", "3XL"};
    private final HashMap<String, HashMap<String, Integer>> items = new HashMap<>();

    public Clothing() {
        for (String design : designs) { //displays all designs
            items.put(design, new HashMap<>());//hashmap
            for (String size : sizes) {
                items.get(design).put(size, 0);}} //keys and values of hashmap
    }

    public void designAndSize() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a design to edit: "); //ask user for design
            for (int i = 0; i < designs.length; i++) {
                System.out.println(("'" + (i + 1) + "'") + " " + designs[i]);}
            int selectDesign = scanner.nextInt();
            if (selectDesign < 1 | selectDesign > designs.length) {
                System.out.println("Invalid. Please try again");
                continue;}
            String selectedDesign = designs[selectDesign - 1];

            System.out.println("Enter a size to edit: "); //ask user for size
            for (int i = 0; i < sizes.length; i++) {
                System.out.println(("'" + (i + 1) + "'") + " " + sizes[i] + " " + selectedDesign);}
            int selectSize = scanner.nextInt();
            if (selectSize < 1 | selectSize > sizes.length) {
                System.out.println("Invalid. Please try again");
                continue;}
            String selectedSize = sizes[selectSize - 1];

            while (true) { //ask user if they want to add or subtract stocks
                System.out.println("Select an operation to do with: " + selectedSize + " " + selectedDesign);
                System.out.println("""
                        Enter:
                        '1' to add stocks
                        '2' to subtract stocks
                        """);
                int selectOperation = scanner.nextInt();
                int value = items.get(selectedDesign).get(selectedSize);

                if (selectOperation == 1) {
                    System.out.println("Enter amount to be added:");
                    int addValue = scanner.nextInt();
                    items.get(selectedDesign).put(selectedSize, value + addValue); //updates hashmap so input can be added
                    System.out.println(selectedSize + " " + selectedDesign + " = " + (items.get(selectedDesign).get(selectedSize)));
                } else if (selectOperation == 2) {
                    System.out.println("Enter amount to be subtracted:");
                    int subValue = scanner.nextInt();
                    items.get(selectedDesign).put(selectedSize, value - subValue); //updates hashmap so input can be subtracted
                    System.out.println(selectedSize + " " + selectedDesign + " = " + (items.get(selectedDesign).get(selectedSize)));
                } else {
                    System.out.println("Invalid. Please try again");
                    continue;
                }

                System.out.println("Edit " + selectedSize + " " + selectedDesign + " again? (y/n)"); //ask user if they want to still make changes for a certain design and size of the item stock
                char choice = scanner.next().charAt(0);

                if (choice == 'n') { //if not, goes back to the start (asking for design and size)
                    System.out.println("Proceeding...");
                    break;
                } else if (choice != 'y') {
                    System.out.println("Invalid. Please try again");
                    scanner.next();
                }
            }
            System.out.println("Would you like to edit another item? (y/n)"); //ask user if they want to edit stocks of other items
            char nextChoice = scanner.next().charAt(0);

            if (nextChoice == 'n') {
                System.out.println("Would you like to go back to main? (y/n)"); //ask user if they want to go back to main
                char backMain = scanner.next().charAt(0);

                if (backMain == 'y') {
                    System.out.println("Proceeding...");
                    return;
                } else if (backMain == 'n') {
                    System.exit(0);
                } else {
                    System.out.println("Invalid. Please try again");
                    scanner.next();
                }
            } else if (nextChoice != 'y'){
                System.out.println("Invalid. Please try again");
                scanner.next();
            }
        }
    }
    
    public void listInventory() { //method to check current/updated inventory
        Scanner scanner = new Scanner(System.in);
        for (String design : designs) {
            System.out.println(design);
            for (String size : sizes) {
                int updatedInventory = items.get(design).get(size);
                System.out.println(size + " = " + updatedInventory);

            }
        }
        System.out.println("Would you like to go back to main? (y/n)"); //ask user if they want to go back to main
        char choice = scanner.next().charAt(0);

        if (choice == 'y') {
            return;

        } else if (choice == 'n') {
            System.exit(0);
        } else {
            System.out.println("Invalid. Please try again");
            scanner.next();
        }
        }
    }

class Main2 {
    public static void main(String[] args) {
        Clothing clo = new Clothing();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Welcome to Clothing! What would you like to do?"); //ask user if they want to check or edit inventory
            System.out.println("""
                        Enter:
                        '1' to check inventory level
                        '2' to edit inventory level
                        """);
            int selectPerform = scanner.nextInt();

            if (selectPerform == 1) {
                clo.listInventory();
            } else if (selectPerform == 2) {
                clo.designAndSize();
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
