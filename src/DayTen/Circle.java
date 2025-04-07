package DayTen;

// TODO: Circle class implementing Shape and Drawable
public class Circle implements Shape, Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayArea(){
        System.out.println("Calculation of Area of a circle with radius is: " + calculateArea());
    }
}
