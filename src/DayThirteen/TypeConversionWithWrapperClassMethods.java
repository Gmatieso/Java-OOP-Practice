package DayThirteen;

public class TypeConversionWithWrapperClassMethods {
    public static void main(String[] args) {
        // 1). String ---> int, double, boolean, char
        //Conversion of string no. to integer
        String s1 = "20"; // this cannot be converted into int
        String s2 = "10";

//        System.out.println(s1+s2);
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        System.out.println(sum);

        // String --> double
        String s3 = "10.5";
        String s4 = "20.5";

      double sumdouble   = Double.parseDouble(s3) + Double.parseDouble(s4);
      System.out.println(sumdouble);


      // String --> boolean
        String s = "true";
        Boolean b = Boolean.parseBoolean(s);
        System.out.println(b);

        // 2). int, double, boolean, char ------> String
        // int --> String
        int x = 100;
        String time = String.valueOf(x);
        System.out.println(time);

        // double --> String
        double  d = 10.5;
        String s12 = String.valueOf(d);
        System.out.println(s12);
    }
}
