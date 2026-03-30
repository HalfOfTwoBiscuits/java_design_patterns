package decorator;

class ScrollbarWidgetDecorator extends AbstractWidgetDecorator {
    // A decorator for a vertical scrollbar.

    public ScrollbarWidgetDecorator(WidgetGraphicHandler decorated) {
        // Store the decorated graphic handler.
        super(decorated);
    }
    
    @Override
    public String render() {
        // Defer to previous handler, appending new graphic at the end.
        return super.render() + "\n It has a scrollbar.";
    }
}
