package decorator;
// Example of the decorator design pattern.

public class DecoratorDemoApp {
    // Main class.
    public static void test() {

        // Create new object for the widget.
        WidgetGraphicHandler handler = new WidgetImplementation();

        // Add decorators to extend the graphics displayed.
        handler = new ScrollbarWidgetDecorator(handler);
        handler = new BorderWidgetDecorator(handler);

        // Decorators can take arguments to use for rendering.
        handler = new TestimonialWidgetDecorator(handler, 5);
        handler = new TestimonialWidgetDecorator(handler, 3);

        // Obtain graphic (represented as a string for demonstration).
        // The widget renders its graphic first, then all decorators render in order.
        String graphic = handler.render();

        // Display graphic onscreen
        System.out.println(graphic);
    }
}