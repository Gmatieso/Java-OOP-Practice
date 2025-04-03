package DayEight.day18pack2;

import DayEight.day18pack1.Test1;

/*
    Here we are doing an indirect access, since we have to extend Test1 to Test2,
    inorder to access the properties of Test1.
    We don't create an instance of an object directly.
 */

public class Test2 extends Test1 {
    public static void main(String[] args) {

        Test2 test2 = new Test2();
        System.out.println(test2.x);
        test2.m1();
    }
}
