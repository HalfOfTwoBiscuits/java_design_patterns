package observer;

class ProductStockObserver implements Observer {
    private Product product;

    ProductStockObserver(Product subject) {
        product = subject;
    }

    public void update() {
        System.out.println(product.getName() + " is back in stock again!");
    }
}
