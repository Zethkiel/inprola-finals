import java.util.Scanner;

public class Clothing {
    public String color;
    public String size;
    public Character gender;
    public int quantity;


    public Clothing() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return this.size;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
    public Character getGender() {
        return this.gender;
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

        String [] colors = {"Red", "Blue", "Green", "Orange"};

        System.out.println("Select a color: (0 = Red, 1 = Blue, 2 = Green, 3 = Orange)");
        int selectColor = scanner.nextInt();
        if (selectColor >= 0 && selectColor < colors.length) {
            clothing.color = colors[selectColor];
        }

        String [] sizes = {"XS" ,"S", "M", "L", "XL"};

        System.out.println("Select a size: (0 = XS, 1 = S, 2 = M, 3 = L, 4 = XL)");
        int selectSize = scanner.nextInt();
        if (selectSize >= 0 && selectSize < sizes.length) {
            clothing.size = sizes[selectSize];
        }


        System.out.println("CLOTHING DETAILS");
        System.out.println("Color = "+ clothing.getColor());
        System.out.println("Size = "+ clothing.getSize());
        System.out.println("Gender = "+ clothing.gender);
        System.out.println("Quantity =" + clothing.quantity);
    }
}
