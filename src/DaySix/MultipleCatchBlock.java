package DaySix;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        System.out.println("Program is started.....");
        System.out.println("Program is running.......");

        int a = 100;
//
//        try {
////            System.out.println(a/0); // ArithmeticException
//            String s = "Welcome";
//            int   n = Integer.parseInt(s);
//        }
//        catch (ArithmeticException e) {
//            System.out.print("Exception is occured ... and handled successfully");
//        }
//        catch (NullPointerException e) {
//            System.out.print("Exception is occured ... and handled successfully");
//        }
//        catch (NumberFormatException e) {
//            System.out.print("Exception is occured ... and handled successfully");
//        }

        try {
            String s = "Welcome";
            int n = Integer.parseInt(s);
//          System.out.println(a/0);
        }
        catch (Exception e) {
            System.out.println("OOPS ...Program  failed");
        }

        System.out.println("Program is completed ......");
        System.out.println("Program is exited..........");
    }
}
