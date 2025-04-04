package DayEight.assignment;

interface  A {

    // public and abstract
    void methodA();
    void methodB();
    void methodC();
    void methodD();
}

// can abstract class implement interface.? YES.

abstract  class B implements A {
   public   void methodC(){
        System.out.println("I am method C");
    }
}

class M extends B {

    /**
     *
     */
    @Override
    public void methodA() {
        System.out.println("I am method A");
    }

    /**
     *
     */
    @Override
    public void methodB() {
        System.out.println("I am method B");
    }

    /**
     *
     */
    @Override
    public void methodD() {
        System.out.println("I am method D");
    }
}


public class AbstractClassVsInterface {

    public static void main(String[] args) {

    }
}
