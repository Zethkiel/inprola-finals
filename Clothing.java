import java.util.Scanner;

public class Clothing {

    private final String[] designs = { "Plain Red T-shirt", "Orange Jacket", "Light Yellow Dress",
            "Dark Green Cargo Pants", "Blue Polo Shirt", "Indigo Long Sleeve", "Long Violet Skirt" };
    private final String[] sizes = { "XS", "S", "M", "L", "XL", "2XL", "3XL" };
    private int quantity;
    private String design;
    private String size;

    public Clothing() {
    }

    public String checkClothing(int d, int s) {
        if (d < designs.length && d > 0) {
            if (s < sizes.length && s > 0) {
                design = designs[d - 1];
                size = sizes[s - 1];
                return sizes[s - 1] + " " + designs[d - 1];
            }
            return "The size for this clothing invalid";
        } 
        return "The design you picked is invalid";
    }

    public void itemCount(int i) {
        quantity = i;
    }

    public String toString() {
        return "You ordered " + quantity + " " + size + " " + design + ".";
    }

    class Main {
        public static void main(String[] args) {

            Clothing c = new Clothing();
            Scanner s = new Scanner(System.in);
            Scanner t = new Scanner(System.in);
            Scanner u = new Scanner(System.in);
            Scanner v = new Scanner(System.in);

            while (true) {
            System.out.println("""
                    clothing design? Type:
                    '1' for Plain Red T-shirt
                    '2' for Orange Jacket
                    '3' for Light Yellow Dress
                    '4' for Dark Green Cargo Pants
                    '5' for Blue Polo Shirt
                    '6' for Indigo Long Sleeve
                    '7' for Long Violet Skirt
                    """);
                    
            int type = s.nextInt();

            if (type < 1 && type > 7) {
                System.out.println(c.checkClothing(type, 0)); 
                break;
            }

            System.out.println("""

                    cloth size? Type:
                    '1' for XS
                    '2' for S
                    '3' for M
                    '4' for L
                    '5' for XL
                    '6' for 2XL
                    '7' for 3XL
                    """);

            int size = t.nextInt();

            if (size < 1 && size > 7) {
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
}
