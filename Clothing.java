import java.util.HashMap;
import java.util.Scanner;

public class Clothing {

    private final String[] designs = {"Plain Red T-shirt", "Orange Jacket", "Light Yellow Dress",
            "Dark Green Cargo Pants", "Blue Polo Shirt", "Indigo Long Sleeve", "Long Violet Skirt"};
    private final String[] sizes = {"XS", "S", "M", "L", "XL", "2XL", "3XL"};

    public Clothing() {}

    public void designAndSize() {
        HashMap<String, HashMap<String, Integer>> items = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (String design : designs) { //displays all designs
            items.put(design, new HashMap<>());
        for (String size : sizes) { //displays sizes
            items.get(design).put(size, 0);}} //

        while (true) {
            System.out.println("Enter a design to edit: "); //ask user for design
            for (int i = 0; i < designs.length; i++) {
                System.out.println(("'" + (i + 1) + "'") + " " + designs[i]);}
            int selectDesign = scanner.nextInt();
            if (selectDesign < 1 && selectDesign > designs.length) {
                System.out.println("Invalid. Please try again");
                continue;}
            String selectedDesign = designs[selectDesign - 1];

            System.out.println("Enter a size to edit: "); //ask user for size
            for (int i = 0; i < sizes.length; i++) {
                System.out.println(("'" + (i + 1) + "'") + " " + sizes[i] + " " + selectedDesign);}
            int selectSize = scanner.nextInt();
            if (selectSize < 1 && selectSize > sizes.length) {
                System.out.println("Invalid. Please try again");
                continue;}
            String selectedSize = sizes[selectSize - 1];

            while (true) { //ask user if they want to add or subtract stocks
                System.out.println(selectedSize + " " + selectedDesign);
                System.out.println("""
                        '1' to add
                        '2' to subtract
                        """);
                int selectOperation = scanner.nextInt();
                int value = items.get(selectedDesign).get(selectedSize);

                if (selectOperation == 1) {
                    System.out.println("Enter amount to be added:");
                    int addValue = scanner.nextInt();
                    items.get(selectedDesign).put(selectedSize, value + addValue); //updates hashmap so input can be added
                    System.out.println(selectedDesign + " = " + (items.get(selectedDesign).get(selectedSize)));
                } else if (selectOperation == 2) {
                    System.out.println("Enter amount to be subtracted:");
                    int subValue = scanner.nextInt();
                    items.get(selectedDesign).put(selectedSize, value - subValue); //updates hashmap so input can be subtracted
                    System.out.println(selectedSize + " "+ selectedDesign + " = " + (items.get(selectedDesign).get(selectedSize)));
                } else {
                    System.out.println("Invalid");
                    continue;
                }

                System.out.println("Perform with " + selectedSize + " "+ selectedDesign + " again? (y/n)"); //ask user if they want to still make changes for a certain design and size of the item stock
                char choice = scanner.next().charAt(0);

                if (choice == 'n') { //if not, goes back to the start (asking for design and size)
                    System.out.println("Proceeding...");
                    break;
                } else if (choice != 'y') {
                    System.out.println("Invalid. Please try again");
                    scanner.next();}
            }
        }
    }
}
class Main2 {
    public static void main(String[] args) {
        Clothing clo = new Clothing();
        clo.designAndSize();
    }
}
