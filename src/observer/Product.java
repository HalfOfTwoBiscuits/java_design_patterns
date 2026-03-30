package observer;

class Product extends AbstractSubject {
    // Implementation of a subject to observe: a product on an ecommerce site.
    // It sends a notification to observers when back in stock again.

    private final String name;
    private int amountInStock;

    public Product(String productName, int stock) {
        // Store name and amount in stock.
        name = productName;
        amountInStock = stock;
        System.out.println(name + ": " + String.valueOf(amountInStock) + " in stock.");
    }

    public void buy(int amount) throws UnsupportedOperationException {
        // Someone purchased the product.
        // In a more complex example, the Customer object could be passed here,
        // and their observer could be detached automatically if they're the one who bought it.

        if (isInStock(amount)) {
            // Reduce the amount in stock.
            amountInStock = amountInStock - amount;
            System.out.println(name + ": " + String.valueOf(amount) + " sold.");
        }
        else {
            // Exception for if not enough are in stock to purchase.
            throw new UnsupportedOperationException("Attempt to purchase more of a product than is in stock.");
        }
    }

    public void restock(int amount) {
        // Increase stock.
        // If it was previously out of stock, send a notification to attached customers.

        System.out.println(name + ": " + String.valueOf(amount) + " restocked.");

        // Check whether it was out of stock before.
        boolean wasInStock = isInStock();

        // Increase amount in stock.
        amountInStock = amountInStock + amount;

        // Send notification using the `notify_` method of the base class.
        if (!wasInStock) {
            System.out.println("Back in stock again! Sending notification...");
            notify_();
        }
    }

    // Getter for product name.
    public String getName() {return name;}

    // Utility methods used to check amount in stock.
    public boolean isInStock() {return amountInStock > 0;}
    public boolean isInStock(int minimum) {return amountInStock >= minimum;}
}
