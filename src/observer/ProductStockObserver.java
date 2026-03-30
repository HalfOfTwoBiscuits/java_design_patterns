package observer;

class ProductStockObserver implements ObserverInterface<Product> {
    // Observer implementation that awaits a product being back in stock,
    // and notifies a customer when it is.
    // In a more complex implementation, the Customer class could be aware of it, too.


    // Store customer being notified.
    private final Customer customer;
    public ProductStockObserver(Customer customerToNotify) {
        customer = customerToNotify;
    }

    // The type variable allows the `product` argument to have the Product type rather than AbstractSubject.
    // An alternative solution is downcasting the AbstractSubject to a Product at the start of the method.
    @Override
    public void update(Product product) {
        // Display a message to the customer about the product.
        System.out.println("Hey " + customer.getName() + ", " + product.getName() + " is back in stock again!");
    }
}
