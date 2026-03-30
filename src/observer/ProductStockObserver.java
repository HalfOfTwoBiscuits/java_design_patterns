package observer;

class ProductStockObserver implements ObserverInterface<Product> {
    private final Customer customer;

    public ProductStockObserver(Customer customerToNotify) {
        customer = customerToNotify;
    }

    @Override
    public void update(Product product) {
        System.out.println("Hey " + customer.getName() + ", " + product.getName() + " is back in stock again!");
    }
}
