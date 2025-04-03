package DayEight.assignment;

// This is multiple inheritance ..  Child class interits from Two parents class

interface Animal {
    void eat();
    void walk();
}

interface Bird {
    void fly();
}



public class MultipleInheritanceDemo implements Animal, Bird {

    /**
     *
     */
    @Override
    public void eat() {
        System.out.println("eat");
    }

    /**
     *
     */
    @Override
    public void walk() {
        System.out.println("walk");
    }

    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("fly");
    }

    public static void main(String[] args) {

        MultipleInheritanceDemo demo = new MultipleInheritanceDemo();
        demo.eat();
        demo.walk();
        demo.fly();


    }
}
