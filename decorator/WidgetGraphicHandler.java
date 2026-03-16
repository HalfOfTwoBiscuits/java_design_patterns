public interface WidgetGraphicHandler {
    // This interface specifies the `render` method, which
    // constructs and returns some graphics for a widget.
    // It is implemented by both the main widget class and its decorators,
    // and used as the data type for the important 
    // `AbstractWidgetDecorator.nextToRender` variable.

    public String render();
}