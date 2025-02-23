import java.util.Scanner;
public class Catalog {


    public void catalogId(int id) {

        if (id < 202409) {
            System.out.println("Priced according to THIS month's catalog (February 2025)");
        }
        else {
            System.out.println("Priced according to catalog ON-HAND");

        }
    }
}
class CloseOutItems extends Catalog{
    public String section = "Close Out Items";
    public void catalogId(int id) {

        if (id < 202409) {
            System.out.println("Priced according to THIS month's catalog (February 2025)");
        }
        else {
            System.out.println("Priced according to catalog ON-HAND");

        }
    }
    public void section() {
        System.out.println("Welcome to " +section + " Section");
        System.out.println("");

    }
}

class MonthlySpecials extends Catalog{
    public String section = "Monthly Specials";
    public void catalogId(int id) {

        if (id < 202409) {
            System.out.println("Priced according to THIS month's catalog (February 2025)");
        }
        else {
            System.out.println("Priced according to catalog ON-HAND");

        }
    }
    public void section() {
        System.out.println("Welcome to " +section + " Section");
        System.out.println("Limited Edition: ");

    }
}

class NormalPrices extends Catalog{
    public String section = "Normal Prices";
    public void catalogId(int id) {

        if (id < 202409) {
            System.out.println("Priced according to THIS month's catalog (February 2025)");
        }
        else {
            System.out.println("Priced according to catalog ON-HAND");

        }
    }
    public void section() {
        System.out.println("Welcome to " +section + " Section");
        System.out.println("New Collection: ");

    }
}

class Main {
    public static void main(String[] args) {

        Catalog catalog = new Catalog();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Catalog ID: ");
        int id = scanner.nextInt();
        catalog.catalogId(id);
        System.out.println(" ");

        CloseOutItems closeOutItems = new CloseOutItems();
        closeOutItems.section();
        System.out.println(" ");

        MonthlySpecials monthlySpecials = new MonthlySpecials();
        monthlySpecials.section();
        System.out.println(" ");

        NormalPrices normalPrices = new NormalPrices();
        normalPrices.section();
        System.out.println(" ");
    }
}
