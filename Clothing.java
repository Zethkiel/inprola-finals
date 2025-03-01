import java.util.HashMap;
import java.util.Scanner;

public class Clothing {

    private final String[] designs = {"Plain Red T-shirt", "Orange Jacket", "Light Yellow Dress",
            "Dark Green Cargo Pants", "Blue Polo Shirt", "Indigo Long Sleeve", "Long Violet Skirt"};
    private final String[] sizes = {"XS", "S", "M", "L", "XL", "2XL", "3XL"};

    public Clothing() {
    }

    public void designAndSize() {
        HashMap<String, Integer> items = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (String design : designs) { //loop to display all designs at a time
            items.put(design, 0); } //initialize hashmap
        for (String design : designs) {
            for (String size : sizes) { //loop to display all sizes for each design
                while (true) {
                    System.out.println(size + " " + design); //ask user if they want to add or subtract stocks
                    System.out.println("""
                            '1' to add
                            '2' to subtract
                            """);
                    int select = scanner.nextInt();
                    int valueR = items.get(design);

                    if (select == 1) {
                        System.out.print(size + " ");
                        System.out.println("Enter amount to be added:");
                        int addValue = scanner.nextInt();
                        items.put(design, valueR + addValue); //updates hashmap so input can be added
                        System.out.println(design + " = " + (items.get(design)));
                    } else if (select == 2) {
                        System.out.println("Enter amount to be subtracted:");
                        int subValue = scanner.nextInt();
                        items.put(design, valueR - subValue); //updates hashmap so input can be subtracted
                        System.out.println(design + " = " + (items.get(design)));
                    } else {
                        System.out.println("Invalid");
                        continue;
                    }

                    System.out.println("Perform again? (y/n)"); //ask user if they want to still make changes for a certain design/size of the item stock
                    char choice = scanner.next().charAt(0);

                    if (choice == 'n') { //goes to next design/size
                        System.out.println("Proceeding..."); 
                        break;
                    } else {
                        System.out.println("Invalid. Please try again");
                        scanner.next();
                    }
                }
            }
        }
    }
}
class main {
    public static void main(String[] args) {
        Clothing clo = new Clothing();
        clo.designAndSize();
    }
}
