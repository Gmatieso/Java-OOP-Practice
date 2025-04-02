package DayThree;

// when we make  method as final, we cannot override .
// class cannot be extend into another

class Bike {
     void run(){
        System.out.println("Bike running.........");
    }
}

class Honda extends Bike {
    void run(){
        System.out.println("Started .........");
    }
}

public class FinalMethodDemo {
}
