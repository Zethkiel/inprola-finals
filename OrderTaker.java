public class OrderTaker {
    private Customer c;
    private Catalog cat;

    public void checkCustomerType() {
        if (c.getCustomerType().equalsIgnoreCase("subscriber")) {
            catalogOrder();
        } else if (c.getCustomerType().equalsIgnoreCase("online")) {
            onlineOrder();
        }
    }

    public void catalogOrder() {
        //csr gives form
        //pagsamahin ang order info dito(order id, etc)
        //oec will send the form to itemOrder
    }
    public void onlineOrder() {
        //shows the current catalog to user
        //user buys
        //send the 'cart' to itemorder
    }
}