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
        drawingcircle.calculateArea();
        drawingcircle.displayArea();

    }
}
