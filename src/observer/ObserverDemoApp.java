package observer;

public class ObserverDemoApp {
    public static void test() {
        Product chair = new Product("Wonderful Chair", 2);

        ProductStockObserver stockObserver = new ProductStockObserver();
        chair.attach(stockObserver);

        chair.buy();
        chair.buy();
        chair.restock(3);
    }
}
