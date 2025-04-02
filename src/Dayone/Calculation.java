package Dayone;

public class Calculation {

    int x, y ;

    //case 1: not taking params, not return output
//    void sum() {
//        System.out.println( x + y);
//    }
    // case 2: not taking params, return output
//    int sum() {
//        return(x + y );
//    }

    // case 3: taking params, not return output
//    void sum(int a, int b){
//        x = a;
//        y = b;
//        System.out.println(x+y);
//    }

    //Case 4: Takes a parameter, and return an output
    int sum(int a, int b){
        x = a;
        y = b;
        return x+y;
    }

    public static void main(String[] args) {
        /*
        Java methods contains logic
        1. not taking params, not return output,
        2. not taking params, return output,
        3. taking params, not return output
        4. taking params, return output.
         */

        Calculation calculation = new Calculation();
        calculation.x = 10;
        calculation.y = 20;
//        int result = calculation.sum();
//        System.out.println(result);
//        calculation.sum(10, 20);

        System.out.println(calculation.sum(10,20));


    }
}
