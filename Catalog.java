import java.util.Scanner;
public class Catalog {


    public void catalogType(int id) {

        if (id < 202409) {
            System.out.println("Priced according to THIS month's catalog (February 2025)");
        }
        else {
            System.out.println("Priced according to catalog ON-HAND");

        }
    }
}
class Main {
    public static void main(String[] args) {

        Catalog catalog = new Catalog();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Catalog ID: ");
        int id = scanner.nextInt();
        catalog.catalogType(id);
    }
}
