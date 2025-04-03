package DayEight;

interface Vehicles {
    /*
        By default variable is final and static
     */
    int max_speed = 120;
    int min_speed = 10;

    // abstract, default, static, private, are allowed in interface.
    void start();  // abstract method. No need to specify abstract keyword, public modifier is associated

    // Default method (supported from java8)
   default void drive(){
        System.out.println("Driving safely...");
    }

    // Static method (supported from java  8)
    static void showMaxSpeed(){
       System.out.println("Max speed: " + max_speed);
    }

    // Private method (supported from java 9)
   private void showMinSpeed(){
       System.out.println("Min speed: " + min_speed);
    }

    default void showSpeeds(){
       showMaxSpeed();
       showMinSpeed();
    }


}

class Car implements Vehicles {

    @Override
    public void start() {
        System.out.println("Car starting...");

    }

}

public class InterfaceDemo {
    public static void main(String[] args) {

        Vehicles v = new Car();
        v.drive();
        v.start();

        Vehicles.showMaxSpeed(); // directly called through interface
        //v.showMinSpeed() cannot access since it is private method

        v.showSpeeds();


    }
}
