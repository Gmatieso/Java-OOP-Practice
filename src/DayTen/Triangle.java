package DayTen;

// TODO: A shape that doesn't need drawing i.e for calculations only
public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public void  displayArea(){
        System.out.println("Area of the Triangle is: " + calculateArea());
    }
}

/*
    ! SRS: Each class i.e Circle, Rectangle, Triangle) has one responsibility, managing it's own data
    ! and behaviour i.e area calculation and optionally drawing.
    ! LSP: Circle, Rectangle and Triangle can all be used anywhere a Shape is expected and the program will work
    ! correctly e.g area calculation . Similar, Circle and Rectangle can substitute for Drawable.


 */
