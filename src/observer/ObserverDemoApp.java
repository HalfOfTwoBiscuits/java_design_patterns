package observer;

public class ObserverDemoApp {
    public static void test() {
        Customer emily = new Customer("Emily");
        Customer john = new Customer("John");
        Customer ali = new Customer("Ali");

        Product chair = new Product("Wonderful Chair", 2);
        Product bag = new Product("Beautiful Bag", 1);

        ProductStockObserver notifyEmily = new ProductStockObserver(emily);
        ProductStockObserver notifyJohn = new ProductStockObserver(john);
        ProductStockObserver notifyAli = new ProductStockObserver(ali);

        chair.attach(notifyEmily);
        chair.attach(notifyJohn);
        bag.attach(notifyEmily);
        bag.attach(notifyAli);

        chair.buy();
        chair.buy();
        chair.restock(3);
    }
}
