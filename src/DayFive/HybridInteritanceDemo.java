package DayFive;

class A1 {
    void m1() {
        System.out.println("This is  m1 from A1...");
    }
}

interface B1 {
    void m2();
}

interface B2 {
    void m3();
}

public class HybridInteritanceDemo extends A1 implements B1, B2 {

    public static void main(String[] args) {
        HybridInteritanceDemo demo = new HybridInteritanceDemo();

        demo.m1();
        demo.m2();
        demo.m3();

    }


    @Override
    public void m2() {
        System.out.println("This is  m2 from B1...");
    }

    @Override
    public void m3() {
        System.out.println("This is  m3 from B2...");
    }
}
