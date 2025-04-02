package DayThree;

public class SuperAnimal {
    /*
        SuperKeyword can be used to refer immediate parent class instance variable.
        SuperKeyword can be used to invoke immediate parent class method.
        it represents the parent class
        it's only used in inheritance
     */
    String color = "White";

    void eating(){
        System.out.println("Eating......");
    }

}

class Dog extends SuperAnimal{
    String color = "Black";

    void eating(){
        System.out.println("Eating bread.....");
        // lets invoke immediate parent method..
        super.eating();
    }

    void display(){
        System.out.println(color); //Black
        System.out.println(super.color);  // white since we refering to imediate parent class instance variable
    }
}
