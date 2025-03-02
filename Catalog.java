import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Date; //to know what the current date is

public class Catalog {
    public LocalDate currentDate;
    private int currentMonth;
    private int currentYear;
    public int month;
    public int year;
    private String id;
    protected double[] price = {150, 170, 400, 450, 300, 320, 380, 410, 200, 220, 280, 300, 180, 200};
    protected String[] design = {"Plain Red T-shirt", "Orange Jacket", "Light Yellow Dress",
            "Dark Green Cargo Pants", "Blue Polo Shirt", "Indigo Long Sleeve", "Long Violet Skirt"};

    public Catalog() {
        currentDate = LocalDate.now();
        currentMonth = currentDate.getMonthValue();
        currentYear = currentDate.getYear();
    }

    public Catalog(int m, int y) {
        this();
        month = m;
        year = y;

    }

    public void setDetails() {
        id = Integer.toString(year) + "-" + Integer.toString(month); //just creates a String id e.g. feb 2024 -> 2024-2
    }

    public String getDetails() {
        return id;
    }

    public void catalogMonth(int catalogMonth, int catalogYear) {
        LocalDate catalogDate = LocalDate.of(catalogYear, catalogMonth,1);
        long checkDate = ChronoUnit.MONTHS.between(catalogDate, currentDate);
        if (checkDate > 6) { //checks if the catalog used is 6 months older

        } else { //has a 3% discount if the catalog is within 6 months
            double discount = 1 - (checkDate * 0.03);
            for (int i = 0; i < price.length; i++)
                price[i] *= discount;
            }
        }

    }
class CloseOutItems extends Catalog{
    public String section = "Close Out Items";

    public CloseOutItems() {
        super();
    }
    public void catalogMonth(int catalogMonth, int catalogYear) { //override
        LocalDate catalogDate = LocalDate.of(catalogYear, catalogMonth,1);
        long checkDate = ChronoUnit.MONTHS.between(catalogDate, currentDate);
        if (checkDate > 6) {

        } else {
            double discount = 1 - (checkDate * 0.03);
            for (int i = 0; i < price.length; i++)
                price[i] *= discount;
        }
    }
    public void section() { //displays the closeout section of the catalog; contains 2 products with prices depending on size range.
        catalogMonth(month, year);
        System.out.printf("""
                %s Section:
                %s (XS-L) = %2f
                %s (XL-3XL) = %2f
                %s (XS-L) = %2f
                %s (XL-3XL) = %2f
                """, section, design[2], price[4], design[2], price[5], design[5], price[10], design[5], price[11]);
        }
    }

class MonthlySpecials extends Catalog{
    public String section = "Monthly Specials";

    public MonthlySpecials() {
        super();
    }
    public void catalogMonth(int catalogMonth, int catalogYear) { //override
        LocalDate catalogDate = LocalDate.of(catalogYear, catalogMonth,1);
        long checkDate = ChronoUnit.MONTHS.between(catalogDate, currentDate);
        if (checkDate > 6) {

        } else {
            double discount = 1 - (checkDate * 0.03);
            for (int i = 0; i < price.length; i++)
                price[i] *= discount;
        }
    }
    public void section() { //displays the monthly special section of the catalog; contains 2 products with prices depending on size range.
        catalogMonth(month, year);
        System.out.printf("""
                %s Section:
                %s (XS-L) = %2f
                %s (XL-3XL) = %2f
                %s (XS-L) = %2f
                %s (XL-3XL) = %2f
                """, section, design[1], price[2], design[1], price[3], design[6], price[12], design[6], price[13]);
        }
    }

class NormalPrices extends Catalog{
    public String section = "Normal Prices";

    public NormalPrices() {
        super();
    }
    public void catalogMonth(int catalogMonth, int catalogYear) { //override
        LocalDate catalogDate = LocalDate.of(catalogYear, catalogMonth,1);
        long checkDate = ChronoUnit.MONTHS.between(catalogDate, currentDate);
        if (checkDate > 6) {

        } else {
            double discount = 1 - (checkDate * 0.03);
            for (int i = 0; i < price.length; i++)
                price[i] *= discount;
        }
    }
    public void section() { //displays the monthly special section of the catalog; contains 3 products with prices depending on size range.
        catalogMonth(month, year);
        System.out.printf("""
                %s Section:
                %s (XS-L) = %2f
                %s (XL-3XL) = %2f
                %s (XS-L) = %2f
                %s (XL-3XL) = %2f
                %s (XS-L) = %2f
                %s (XL-3XL) = %2f
                """, section, design[0], price[0], design[0], price[1], design[3], price[4], design[3], price[5], design[4], price[8], design[4], price[9]);
        }
    }

class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asks user to input catalog details: month and year
        System.out.println("Find the pricelist of our items based on the date of the catalog."); 
        System.out.print("Enter Month number: ");
        int month = scanner.nextInt();
        System.out.print("Enter Year number: ");
        int year = scanner.nextInt();
        System.out.println("\n---------------------------------------------");

        Catalog catalog = new Catalog(month, year); //displays user's catalog details
        catalog.setDetails();
        System.out.println("\nCatalog date: " + catalog.getDetails() + "");
        System.out.println("\n---------------------------------------------\n");

        CloseOutItems closeOutItems = new CloseOutItems();
        closeOutItems.month = month; //initialize values properly
        closeOutItems.year = year;
        closeOutItems.section(); 
        System.out.println("---------------------------------------------");

        MonthlySpecials monthlySpecials = new MonthlySpecials();
        monthlySpecials.month = month;
        monthlySpecials.year = year;
        monthlySpecials.section();
        System.out.println("---------------------------------------------");

        NormalPrices normalPrices = new NormalPrices();
        normalPrices.month = month;
        normalPrices.year = year;
        normalPrices.section();
    }
}
