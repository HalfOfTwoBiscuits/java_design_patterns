import decorator.DecoratorDemoApp;
import observer.ObserverDemoApp;

public class App {
    public static void main(String[] args) {
        System.out.println("Testing decorator design pattern:");
        DecoratorDemoApp.test();
        System.out.println();
        System.out.println("Testing observer design pattern:");
        ObserverDemoApp.test();
    }
}