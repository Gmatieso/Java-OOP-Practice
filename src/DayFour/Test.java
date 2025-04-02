package DayFour;

interface A {

    // We hv 4 access Modifier  i.e public, default, protected, private.
    int a = 10;   // by default variable in interface are static and final

    void m1();  //  abstract  method , by default public

}


public class Test  implements A {

    @Override
    public void m1() {
        System.out.println(a);
    }

    public static void main(String[] args) {

        Test obj = new Test();   // A obj = new Test();
        obj.m1();

    }


}
