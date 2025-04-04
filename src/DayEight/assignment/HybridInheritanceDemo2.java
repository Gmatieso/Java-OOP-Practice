package DayEight.assignment;

interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

interface CombinedInterface  extends Interface1, Interface2 {}

class Cuea {
    void method3() {
        System.out.println("C method3 from C class");
    }
}

public class HybridInheritanceDemo2 extends   Cuea implements Interface1, Interface2 {
    /**
     *
     */
    @Override
    public void method1() {

    }

    /**
     *
     */
    @Override
    public void method2() {

    }
}
