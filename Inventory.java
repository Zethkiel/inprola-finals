import java.util.Scanner;

public class Inventory{
    public static void main(String[] args) {
        String[] shirtTypes = {"Red", "Green", "Blue", "Yellow"};
        int[] stock = {100, 100, 100, 100};
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many would you like to get");
        int quantity = scanner.nextInt();
        if(quantity <=0) {
            System.out.println("Invalid quantity");
        }
        }
        
        public static void purchaseShirt(int[] stock, String[] shirtTypes,int shirtIndex, int quantity){

            if (stock[shirtIndex] >= quantity) {
                stock[shirtIndex] -= quantity;
                System.out.println("you have purchased: " + quantity );
            }
        }

    }
        }

    }




