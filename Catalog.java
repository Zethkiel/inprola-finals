import java.util.Scanner;
import java.util.LocalDate; //to know what the current date is

public class Catalog {
    private LocalDate currentDate;
    private int currentMonth;
    private int currentYear;
    private int month;
    private int year;
    private String id;
    protected double[] price = {150, 170, 400, 450, 300, 320, 380, 410, 200, 220, 280, 300, 180, 200};
    private double totalPrice;
    protected String[] design = {"Plain Red T-shirt", "Orange Jacket", "Light Yellow Dress",
            "Dark Green Cargo Pants", "Blue Polo Shirt", "Indigo Long Sleeve", "Long Violet Skirt"};

    public Catalog() {
    }

    public Catalog(int m, int y) {
        month = m;
        year = y;
        currentMonth = currentDate.getMonthValue();
        currentYear = currentDate.getMonthValue();
    }

    public void setId() {
        id = Integer.toString(year) + "-" + Integer.toString(month); //just creates a String id e.g. feb 2024 -> 2024-2
    }

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
        System.out.println(" " + design[2] + "                " + design[2] + "                   " + design[5] + "                    " + design[5]);
        System.out.println("      XS-L                              XL-3XL                                XS-L                                   XL-3XL");
        System.out.println("      " + price[4] + "                             " + price[5] + "                                 " + price[10] + "                                  " + price[11]);
        System.out.println(" ");
        System.out.println(" " + design[2] + "                " + design[2] + "                   " + design[5] + "                    " + design[5]);
        System.out.println("      XS-L                              XL-3XL                                XS-L                                   XL-3XL");
        System.out.println("      " + price[4] + "                             " + price[5] + "                                 " + price[10] + "                                  " + price[11]);
        System.out.println(" ");
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
        System.out.println(" " + design[1] + "                " + design[1] + "                   " + design[6] + "                    " + design[6]);
        System.out.println("      XS-L                         XL-3XL                           XS-L                              XL-3XL");
        System.out.println("      " + price[2] + "                        " + price[3] + "                            " + price[12] + "                             " + price[13]);
        System.out.println(" ");
        System.out.println(" " + design[1] + "                " + design[1] + "                   " + design[6] + "                    " + design[6]);
        System.out.println("      XS-L                         XL-3XL                           XS-L                              XL-3XL");
        System.out.println("      " + price[2] + "                        " + price[3] + "                            " + price[12] + "                             " + price[13]);
        System.out.println(" ");
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
        System.out.println(" " + design[0] + "                " + design[0] + "                   " + design[3] + "                    " + design[3]);
        System.out.println("      XS-L                              XL-3XL                                XS-L                                   XL-3XL");
        System.out.println("      " + price[0] + "                             " + price[1] + "                                 " + price[4] + "                                  " + price[5]);
        System.out.println(" ");
        System.out.println(" " + design[4] + "                " + design[4]);
        System.out.println("      XS-L                              XL-3XL");
        System.out.println("      " + price[8] + "                             " + price[9]);
        System.out.println(" ");
        System.out.println(" " + design[0] + "                " + design[0] + "                   " + design[3] + "                    " + design[3]);
        System.out.println("      XS-L                              XL-3XL                                XS-L                                   XL-3XL");
        System.out.println("      " + price[0] + "                             " + price[1] + "                                 " + price[4] + "                                  " + price[5]);
        System.out.println(" ");
        System.out.println(" " + design[4] + "                " + design[4]);
        System.out.println("      XS-L                              XL-3XL");
        System.out.println("      " + price[8] + "                             " + price[9]);
        System.out.println(" ");
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
