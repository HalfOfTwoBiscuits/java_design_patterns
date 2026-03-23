package src.observer;

public class App {
    public static void main(String[] args) {
        Product chair = new Product("Wonderful Chair", 2);

        ProductStockObserver stockObserver = new ProductStockObserver(chair);
        chair.attach(stockObserver);

        chair.buy();
        chair.buy();
        chair.restock(3);
    }
}
