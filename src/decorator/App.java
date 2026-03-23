package src.decorator;
// Example of the decorator design pattern.

public class App {
    // Main class.
    public static void main(String[] args) {

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
        System.out.print(graphic);
    }
}