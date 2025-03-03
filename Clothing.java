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
                items.get(design).put(size, 1000);}} //keys and values of hashmap
    }

    public void printDesigns() {
        System.out.println("Design choices: ");
        int p = 0;
        for (String i : designs) {
            System.out.println("'" + p + "' for " + i);
        }
        System.out.println();
    }

    public void printSizes() {
        System.out.println("Design choices: ");
        int p = 0;
        for (String i : sizes) {
            System.out.println("'" + p + "' for " + i);
        }
        System.out.println();
    }

    public void designAndSize() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter a design to edit: "); //ask user for design
            for (int i = 0; i < designs.length; i++) {
                System.out.println(("'" + (i + 1) + "'") + " " + designs[i]);}
            int selectDesign = scanner.nextInt();
            if (selectDesign < 1 | selectDesign > designs.length) {
                System.out.println("\nInvalid. Please try again");
                continue;}
            String selectedDesign = designs[selectDesign - 1];

            System.out.println("\nEnter a size to edit: "); //ask user for size
            for (int i = 0; i < sizes.length; i++) {
                System.out.println(("'" + (i + 1) + "'") + " " + sizes[i] + " " + selectedDesign);}
            int selectSize = scanner.nextInt();
            if (selectSize < 1 | selectSize > sizes.length) {
                System.out.println("\nInvalid. Please try again\n");
                continue;}
            String selectedSize = sizes[selectSize - 1];

            while (true) { //ask user if they want to add or subtract stocks
                System.out.println("\nSelect an operation to do with: " + selectedSize + " " + selectedDesign);
                System.out.println("""
                        \nEnter:
                        '1' to add stocks
                        '2' to subtract stocks\n
                        """);
                int selectOperation = scanner.nextInt();
                int value = items.get(selectedDesign).get(selectedSize);

                if (selectOperation == 1) {
                    System.out.println("\nEnter amount to be added:");
                    int addValue = scanner.nextInt();
                    items.get(selectedDesign).put(selectedSize, value + addValue); //updates hashmap so input can be added
                    System.out.println(selectedSize + " " + selectedDesign + " = " + (items.get(selectedDesign).get(selectedSize)));
                } else if (selectOperation == 2) {
                    System.out.println("\nEnter amount to be subtracted:");
                    int subValue = scanner.nextInt();
                    items.get(selectedDesign).put(selectedSize, value - subValue); //updates hashmap so input can be subtracted
                    System.out.println(selectedSize + " " + selectedDesign + " = " + (items.get(selectedDesign).get(selectedSize)));
                } else {
                    System.out.println("\nInvalid. Please try again\n");
                    continue;
                }

                System.out.println("\nEdit " + selectedSize + " " + selectedDesign + " again? (y/n)"); //ask user if they want to still make changes for a certain design and size of the item stock
                char choice = scanner.next().charAt(0);

                if (choice == 'n') { //if not, goes back to the start (asking for design and size)
                    System.out.println("\nProceeding...\n");
                    break;
                } else if (choice != 'y') {
                    System.out.println("\nInvalid. Please try again\n");
                    scanner.next();
                }
            }
            System.out.println("\nWould you like to edit another item? (y/n)"); //ask user if they want to edit stocks of other items
            char nextChoice = scanner.next().charAt(0);

            if (nextChoice == 'n') {
                break;
            } else if (nextChoice != 'y'){
                System.out.println("\nInvalid. Please try again\n");
                scanner.next();
            }
        }
    }
    
    public void listInventory() { //method to check current/updated inventory
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        for (String design : designs) {
            System.out.println(design);
            for (String size : sizes) {
                int updatedInventory = items.get(design).get(size);
                System.out.println(size + " = " + updatedInventory);

            }
            System.out.println("\n---------------------------------------------\n");
        }
        }
    }