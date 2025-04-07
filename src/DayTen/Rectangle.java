package DayTen;

// TODO: Rectangle class implementing Shape and Drawable
public class Rectangle implements Shape , Drawable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with " + width + " x " + height);

    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public void displayArea(){
        System.out.println("Area of the rectangle is: " + calculateArea());
    }
}
