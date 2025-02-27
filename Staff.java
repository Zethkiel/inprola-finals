import java.util.Scanner;

interface Orderable {
    void takeOrder();
}

public class Staff implements Orderable {
    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.takeOrder();
    }

    @Override
    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to order? (yes/no)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Here is the order form.");
        } else {
            System.out.println("Okay, have a great day!");
        }

        scanner.close();
    }
}