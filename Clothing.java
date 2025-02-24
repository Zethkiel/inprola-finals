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
        if (d <= designs.length && d > 0) {
            if (s <= sizes.length && s > 0) {
                design = designs[d - 1];
                size = sizes[s - 1];
                return sizes[s - 1] + " " + designs[d - 1];
            }
            return "The size for this clothing is invalid";
        } 
        return "The design you picked is invalid";
    }

    public void itemCount(int i) {
        quantity = i;
    }

    public String toString() {
        return "You ordered " + quantity + " " + size + " " + design + ".";
    }
}
