package decorator;

class WidgetImplementation implements WidgetGraphicHandler {
    // Implementation of an arbitary widget for the demonstration.
    // It can be rendered on its own, or passed to the constructor of an
    // `AbstractWidgetDecorator` to extend it with additional graphics.

    @Override
    public String render() {
        // This method returns the base graphic for the widget.
        // For demonstration purposes, it is represented as a string.
        return "A widget.";
    }
}