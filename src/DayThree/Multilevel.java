package DayThree;

class C {
    int a;
    void print(){
        System.out.println(a);
    }
}

class D extends C {
    int b;
    void display(){
        System.out.println(b);
    }

}

class E extends D {
    int c;
    void show(){
        System.out.println(c);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        C cobj = new C();
        cobj.a = 200;
        cobj.print();

        D dobj = new D();
        dobj.a = 100;
        dobj.b = 300;
        dobj.display();
        dobj.print();

        E eobj = new E();
        eobj.a = 400;
        eobj.b = 500;
        eobj.display();
        eobj.print();
        eobj.c = 600;
        eobj.show();
    }

}
