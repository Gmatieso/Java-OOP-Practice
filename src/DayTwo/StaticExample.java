package DayTwo;

public class StaticExample {

    // Static methods can access only static stuff (static variables and static methods) Direct

    static  int a = 10;  // static variable
    int b = 20;  // non static variable

    static void m1(){
        System.out.println(" this is m1 static method");
    }

    void m2(){
        System.out.println(" this is m2 Non-static method");
    }

    void m3(){
        System.out.println(" this is m3 Non-static method");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }


    public static void main(String[] args) {
        // static methods can acces only static stuff  i.e static variables and static methods
        System.out.println(a);
        m1();
        // static methods can also access non-static stuff but through object.
        StaticExample m = new StaticExample();
        m.b = 100;
        System.out.println(m.b);
        m.m2();

        // Non-static methods can access everything.
        m.m3();


    }
}
