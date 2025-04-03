package DayEight;

abstract class Bike {

    void Start(){
        System.out.println("Starting Bike...");
    }

    abstract  void driver(); // abstract method. since there's no implementation

    static void park(){  // directly access through class
        System.out.println("Parking Bike...");
    }

    final void stop(){    // final method, cannot override in child class
        System.out.println("Stopping Bike...");
    }
}

class Honda extends Bike {

    @Override
    void driver() {
        System.out.println("Driving  safely ...");
    }
}

public class AbstractionDemo {

public static void main(String[] args) {

//    Bike bike = new Bike() // invalid. Bike is abstract class. we cannot create object

    Honda house = new Honda(); // valid bt we cannot achive data abstraction
    house.Start(); //normal
    house.driver(); // abstract
    house.park(); // final
    house.stop();

    Bike h = new Honda(); // valid
    h.Start(); //normal
    h.driver(); // abstract
    h.park();  // final
    h.stop();

}
}
