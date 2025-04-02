package Dayone.Inheritance.OverridingVsOverloading;

class ABC {
    void m1(int a){
        System.out.println(a);
    }

    void m2(int b){
        System.out.println(b);
    }
}

class XYZ extends ABC {
    void m1(int a){   // Overrided method
        System.out.println(a * a);
    }

    void m2(int b){  //Overrided method
        System.out.println(b * b);
    }

    void m2(int a, int b){  //Overloaded method
        System.out.println(a * b);
    }
}


public class OverridingVsOverloading {
    public static void main(String[] args) {

        XYZ xyzobj = new XYZ();
        xyzobj.m1(10); // called m1() from XYZ
        xyzobj.m2(5); // called m2() from XYZ
        xyzobj.m2(5,15);  // called m2(p1,p1) from xyz.

    }
}
