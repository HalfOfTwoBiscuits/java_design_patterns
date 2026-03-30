package observer;
// Example of the observer design pattern.

public class ObserverDemoApp {
    public static void test() {
        // Create products to act as subjects.
        Product chair = new Product("Wonderful Chair", 0);
        Product bag = new Product("Beautiful Bag", 0);

        // Create customer objects as parameters to observers.
        Customer emily = new Customer("Emily");
        Customer john = new Customer("John");
        Customer ali = new Customer("Ali");

        // Create observer objects.
        ProductStockObserver notifyEmily = new ProductStockObserver(emily);
        ProductStockObserver notifyJohn = new ProductStockObserver(john);
        ProductStockObserver notifyAli = new ProductStockObserver(ali);

        // Attach, or subscribe, the observers to the subjects.
        // When this product is back in stock, the customer will be notified.
        // The same observer can be attached to more than one subject.
        chair.attach(notifyEmily);
        chair.attach(notifyJohn);
        bag.attach(notifyEmily);
        bag.attach(notifyAli);

        // Restock chairs. A notification will be sent.
        chair.restock(3);

        // This restock doesn't send a notification because there were already chairs in stock.
        chair.restock(1);

        // Bag is back in stock!
        bag.restock(1);
        bag.buy(1);
        // Emily bought it: detach her observer.
        bag.detach(notifyEmily);

        // Now only Ali is notified.
        bag.restock(1);
    }
}
