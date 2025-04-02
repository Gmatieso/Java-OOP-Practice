package DayFour;

interface Woman {
    int age = 20;
    void canEat();
}

interface Man  {
    int age = 25;
    void canSing();
}

public class MultipleInheritanceDemo implements Woman, Man {
    public static void main(String[] args) {

        MultipleInheritanceDemo demo = new MultipleInheritanceDemo();
        demo.canEat();
        demo.canSing();

    }

    @Override
    public void canSing() {
        System.out.println("I can Sing" + Man.age + 100);
    }

    @Override
    public void canEat() {
        System.out.println("I can Eat" + Woman.age);
    }

}
