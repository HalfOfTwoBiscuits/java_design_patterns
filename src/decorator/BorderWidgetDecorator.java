package decorator;

class BorderWidgetDecorator extends AbstractWidgetDecorator {
    // A decorator for a border at the edge of a widget.

    public BorderWidgetDecorator(WidgetGraphicHandler decorated) {
        // Store the decorated graphic handler.
        super(decorated);
    }
    
    @Override
    public String render() {
        // Defer to previous handler, appending new graphic at the end.
        return super.render() + "\n It has a border.";
    }
}
