package observer;

class ProductStockObserver implements ObserverInterface {
    private final Customer customer;

    public ProductStockObserver(Customer customerToNotify) {
        customer = customerToNotify;
    }

    @Override
    public void update(AbstractSubject product) {
        Product p = (Product) product;
        System.out.println("Hey " + customer.getName() + ", " + p.getName() + " is back in stock again!");
    }
}
