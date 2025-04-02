package DayThree;


class A { // Parent
    int a;

    void  display(){
        System.out.println(a);
    }
}

class B extends A {  // B is child class
    int b;
    void  print(){
        System.out.println(b);
    }
}

public class Single {

    public static void main(String[] args) {
        A aobj = new A();
        aobj.a = 100;
        aobj.display();

        B bobj = new B();
        bobj.a = 200;
        bobj.display();
        bobj.b = 300;
        bobj.print();

    }
}
