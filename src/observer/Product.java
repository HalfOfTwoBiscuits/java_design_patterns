package observer;

class Product extends AbstractSubject {
    private final String name;
    private int amountInStock;

    public Product(String productName, int stock) {
        name = productName;
        amountInStock = stock;
        logAmountInStock();
    }

    public void buy(int amount) throws UnsupportedOperationException {
        System.out.println(String.valueOf(amount) + " " + name + "(s) were sold.");
        if (isInStock(amount)) {
            amountInStock = amountInStock - amount;
            logAmountInStock();
        }
        else {
            throw new UnsupportedOperationException("Attempt to purchase more of a product than is in stock.");
        }
    }
    public void buy() {buy(1);}

    public void restock(int amount) {
        System.out.println("Restocking +" + String.valueOf(amount) + " " + name + "(s).");

        boolean wasInStock = isInStock();
        amountInStock = amountInStock + amount;
        logAmountInStock();

        if (!wasInStock) {
            System.out.println("Back in stock again! Sending notification...");
            notify_();
        }
    }

    private void logAmountInStock() {
        System.out.println("There are " + String.valueOf(amountInStock) + " " + name + "(s) in stock.");
    }
 
    public String getName() {return name;}
    public boolean isInStock() {return amountInStock > 0;}
    public boolean isInStock(int minimum) {return amountInStock >= minimum;}
}
