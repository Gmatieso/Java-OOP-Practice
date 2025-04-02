package DayThree;

class Parent {
//    int a;
    void display(int a) {
        System.out.println(a);
    }
}

class Child1 extends Parent {
//    int x;
    void show(int b){
        System.out.println(b);
    }

}

class Child2 extends Parent {
    int y;
    void show(int c){
        System.out.println(c);
    }
}

public class Hierachical {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
//        child1.a = 100;
//        child1.x = 200;
        child1.show(10);
        child1.display(20);


        Child2 child2 = new Child2();
//        child2.y = 200;
//        child2.a = 600;
        child2.display(40);
        child2.show(20);
    }
}
