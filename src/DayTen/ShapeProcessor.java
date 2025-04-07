package DayTen;

// ! High-level module to process shapes.
// ! instead of hardcoding dependencies, we'll depend on abstractions
public class ShapeProcessor {
    private final Shape shape;

    public ShapeProcessor(Shape shape) {
        this.shape = shape;
    }

    public void process() {
        double area = shape.calculateArea();
        System.out.println("Area is: " + area);
    }
}

/*
    ! DIP: ShapeProcessor depends on Shape interface, not concrete classes like Circle or Rectangle.
    ! for this we can inject any Shape implementation.

 */
