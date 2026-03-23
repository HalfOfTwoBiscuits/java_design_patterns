package src.decorator;
public class TestimonialWidgetDecorator extends AbstractWidgetDecorator {
    // A decorator for a testimonial.
    // It could be applied to a widget multiple times to show various testimonials together.
    // It stores the number of stars awarded by the speaker.

    private int numStars;

    public TestimonialWidgetDecorator(WidgetGraphicHandler decorated, int stars) {
        // Store the decorated graphic handler.
        super(decorated);

        // Store stars awarded.
        numStars = stars;
    }

    @Override
    public String render() {
        // Render graphic using the stored number of stars.
        String s = String.valueOf(numStars);
        String testimonialGraphic = "\n It contains a " + s + " star testimonial.";
        
        // Defer to previous handler, appending new graphic at the end.
        return super.render() + testimonialGraphic;
    }
}
