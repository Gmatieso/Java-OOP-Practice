package DaySix;

/*
    case:1 Exception occured, catch block handled ...> finally block will execute
    case:2 Exception occured, catch block NOT handled --> finally block will execute
    case: 3 Exception does not occured, catch block ignored ---> finally block will execute ..
 */

public class FinallyBlockExample {
    public static void main(String[] args) {
        System.out.println("Program is starting...");
        System.out.println("Program is in progress...");

        int a = 100;

        try {
            System.out.println(a/2);  //ArithmeticException
        } catch ( ArithmeticException e) {
            System.out.println("ArithmeticException.....");
        }
        finally {
            System.out.println("FinallyBlockExample...");
        }
        System.out.println("Program is completed...");
        System.out.println("Program is in exited.....");
    }
}
