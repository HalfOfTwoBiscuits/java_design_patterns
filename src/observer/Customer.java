package observer;

class Customer {
    // Class storing data used by the observer:
    // the name of the customer watching for when the product is in stock.
    private final String name;

    public Customer(String customerName) {
        name = customerName;
    }

    public String getName() { return name; }
}