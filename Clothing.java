import java.util.Scanner;

public class Clothing {
    public String design;
    public String size;
    public int quantity;


    public Clothing() {
    }

    public void setDesign(String color) {
        this.design = design;
    }

    public String getDesign() {
        return this.design;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
}

class Main{
    public static void main(String[] args) {

        Clothing clothing = new Clothing();
        Scanner scanner = new Scanner(System.in);

        String [] designs = {"Plain Red T-shirt", "Orange Jacket", "Light Yellow Dress", "Dark Green Cargo Pants", "Blue Polo Shirt", "Indigo Long Sleeve", "Long Violet Skirt"};

        System.out.println("Select a design: ");
        System.out.println("0 = Plain Red T-shirt");
        System.out.println("1 = Orange Jacket");
        System.out.println("2 = Light Yellow Dress");
        System.out.println("3 = Dark Green Cargo Pants");
        System.out.println("4 = Blue Polo Shirt");
        System.out.println("5 = Indigo Long Sleeve");
        System.out.println("6 = Long Violet Skirt");
        int selectColor = scanner.nextInt();
        if (selectColor >= 0 && selectColor < designs.length) {
            clothing.design = designs[selectColor];
        }

        String [] sizes = {"XS" ,"S", "M", "L", "XL", "2XL", "3XL"};

        System.out.println("Select a size: ");
        System.out.println("0 = XS");
        System.out.println("1 = S");
        System.out.println("2 = M");
        System.out.println("3 = L");
        System.out.println("4 = XL");
        System.out.println("5 = 2XL");
        System.out.println("6 = 3XL");
        int selectSize = scanner.nextInt();
        if (selectSize >= 0 && selectSize < sizes.length) {
            clothing.size = sizes[selectSize];
        }

        System.out.println("Enter Quantity: ");
        int quantity = scanner.nextInt();
        clothing.setQuantity(quantity);


        System.out.println("CLOTHING DETAILS");
        System.out.println("Design = "+ clothing.getDesign());
        System.out.println("Size = "+ clothing.getSize());
        System.out.println("Quantity = " + clothing.getQuantity());
    }
}
