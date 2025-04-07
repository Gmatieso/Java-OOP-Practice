package DayTen;
/*
    !Let's Create a simple example in Java that demonstrates all five SOLID principles with OOP patterns.
   ! we will design a shape management system to manage shapes. This should help us understand how SOLID improves
   ! code maintainability, flexibility and scalability.

    !SOLID PRINCIPLES OVERVIEW:
    ! Single Responsibility Principle:
         A class should hv only one reason to change i.e one  responsibility.
    ! Open/Closed Principle:
         Class should be opened for extension bt closed for modification.
    ! Liskov Substitution Principle:
        Subtypes must be substitutable for their base types without breaking the program.
    ! Interface Segregation Principle:
        Client should not be forced to depend on interfaces they don't use.
   ! Dependency Inversion Principle:
        High-Level modules should depend on abstractions, not concrete implementation.
 */

public class Main {
    public static void main(String[] args) {

        Circle drawingcircle = new Circle(6);
        drawingcircle.draw();
        drawingcircle.displayArea();

        Rectangle drawingrectangle = new Rectangle(6, 6);
        drawingrectangle.draw();
        drawingrectangle.displayArea();

        Triangle calculate_area_of_a_triangle = new Triangle(6, 6);
        calculate_area_of_a_triangle.calculateArea();
        calculate_area_of_a_triangle.displayArea();


        // Create shapes using the factory
        Shape circle = ShapeFactory.createShape("Circle", 5.0);
        Shape rectangle = ShapeFactory.createShape("Rectangle", 4.0, 6.0);
        Shape triangle = ShapeFactory.createShape("Triangle", 3.0, 4.0);

        // Process shapes
        ShapeProcessor circleProcessor = new ShapeProcessor(circle);
        ShapeProcessor rectangleProcessor = new ShapeProcessor(rectangle);
        ShapeProcessor triangleProcessor = new ShapeProcessor(triangle);

        System.out.println("Processing Circle");
        circleProcessor.process();

        System.out.println("\nProcessing Rectangle:");
        rectangleProcessor.process();

        System.out.println("\nProcessing Triangle:");
        triangleProcessor.process();

    }
}
