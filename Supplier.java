public class Supplier{

 public static void purchaseShirt(int[] stock, String[] shirtTypes, int shirtIndex, int quantity) {
        if (stock[shirtIndex] >= quantity) {
            stock[shirtIndex] -= quantity;
            System.out.println("You have purchased " + quantity + " " + shirtTypes[shirtIndex] + " shirts.");
        } else {
            System.out.println("Sorry, your item is back ordered " + "you may proceed");
            
        }
    }
}
