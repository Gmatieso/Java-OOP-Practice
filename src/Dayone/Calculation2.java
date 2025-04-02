package Dayone;

public class Calculation2 {
    int x, y, z ;

    public Calculation2(int number1, int number2, int number3) {
        x = number1;
        y = number2;
        z = number3;
    }

    public  void  sum(){
        int total = x + y + z;
        System.out.println("The sum of X + Y + Z  values are: " + total);
    }


    public static void main(String[] args) {

        // Creating an object
        Calculation2 calculation2 = new Calculation2(1, 2, 3);
        calculation2.sum();
    }
}
