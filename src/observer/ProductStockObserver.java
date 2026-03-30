package observer;

class ProductStockObserver implements ObserverInterface<Product> {

    @Override
    public void update(Product product) {
        System.out.println(product.getName() + " is back in stock again!");
    }
}
