package DayTen;

public class ShapeFactory {

    public static Shape createShape(String shapeType, double ... dimensions) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle(dimensions[0]);
            case "rectangle":
                return new Rectangle(dimensions[0], dimensions[1]);
            case "triangle":
                return new Triangle(dimensions[0], dimensions[1]);
            default:
                throw new IllegalArgumentException("Invalid shape type" + shapeType);
        }
    }
}

/*
    ! OCP: To add a new shape e.g Pentagon, we wud extend the factory with a new case, bt existing shape
    ! classed remain unchanged.
 */
