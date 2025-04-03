package DayEight.assignment;

interface I1 {
    void method1();
}


interface I2 {
    void method2();
}

class C {
    void method3() {
        System.out.println("C method3 from C class");
    }
}

public class HybridInheritanceDemo  extends C implements I1, I2 {

    /**
     *
     */
    @Override
    public void method1() {
        System.out.println("method1 from I1 .... interface ");
    }

    /**
     *
     */
    @Override
    public void method2() {
        System.out.println("method2 from I2 .... interface ");

    }

    public static void main(String[] args) {

        HybridInheritanceDemo demo = new HybridInheritanceDemo();
        demo.method1();
        demo.method2();
        demo.method3();

    }
}
