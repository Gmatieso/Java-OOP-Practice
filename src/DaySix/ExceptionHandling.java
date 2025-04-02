package DaySix;

import java.util.Scanner;

public class ExceptionHandling {
    /*
        Errors:
       1. Syntax Errors.
       2. Logical Errors.
       3.  Exception occur at runtime based on user input. it destruputs normal flow of the program.

       NumberFormat Exception
       ArithmeticException..
       Null pointer Exception..
       ArrayIndexOut of BoundsException..

     2 kind of Exceptions.
        1. Checked Exceptions:
                This kind of exceptions are identified by the compiler
        2. Un-checked Exceptions.
                This kind of exceptions are not identified by the compiler




     */
    public static void main(String[] args) {
        System.out.println("Program is started.........");
        System.out.println("Program is in progress.........");

        // Capture values from the user ..
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter A number: ");
        int num = input.nextInt();
//
        int a = 100;
        try {
            System.out.println(a / num);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


        //NumberFormatException
        String s = "welcome";

        int n = 0;
        try {
            n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        System.out.println(n + 100);

        // NullPointerException
//        String s = null;
//        System.out.println(s.length());


        // ArrayIndexOutOfBoundsException
//        int a[] = new int[5];
//        a[10] = 100;


        System.out.println("Program is completed.........");
        System.out.println("Program is exited.........");
    }
}
