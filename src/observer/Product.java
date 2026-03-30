package observer;

import java.lang.UnsupportedOperationException;

class Product extends Subject {
    private String name;
    private int amountInStock;

    public Product(String productName, int stock) {
        name = productName;
        amountInStock = stock;
    }

    public void buy(int amount) throws UnsupportedOperationException {
        System.out.println("Buying " + String.valueOf(amount) + " of " + name + ". " + String.valueOf(amountInStock) + " in stock.");
        if (isInStock(amount)) {
            amountInStock = amountInStock - amount;
        }
        else {
            throw new UnsupportedOperationException("Attempt to purchase more of a product than is in stock.");
        }
    }
    public void buy() {buy(1);}

    public void restock(int amount) {
        System.out.println("Restocking " + String.valueOf(amount) + " of " + name + ". " + String.valueOf(amountInStock) + " in stock.");
        boolean wasInStock = isInStock();
        amountInStock = amountInStock + amount;
        if (!wasInStock) {
            System.out.println("Sending notification...");
            notify_();
        }
    }

    public String getName() {return name;}
    public boolean isInStock() {return amountInStock > 0;}
    public boolean isInStock(int minimum) {return amountInStock >= minimum;}
}
