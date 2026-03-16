public abstract class AbstractWidgetDecorator implements WidgetGraphicHandler {
    // Base class for the decorators that add functionality to a widget.

    // This object will render its graphic before the current decorator.
    // It's either another decorator, or the main widget itself.
    // Each decorator defers to the previous one using super(),
    // and the first decorator defers to the main widget graphic.
    private final WidgetGraphicHandler decoratedHandler;

    public AbstractWidgetDecorator(WidgetGraphicHandler decorated) {
        // Store decorated widget.
        decoratedHandler = decorated;
    }

    @Override
    public String render() {
        // This method renders the previous graphic in the order.
        return toRenderFirst.render();
    }
}