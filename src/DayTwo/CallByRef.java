package DayTwo;

public class CallByRef {
    //call by reference: we have to pass object to a method as a parameter

    //Static keyword
    // Static varriables
    // Static methods

    int x;

    public void addition(CallByRef a){
        x = a.x + 5;
        System.out.println(x); //15
    }

    public static void main(String[] args) {
        CallByRef ref = new CallByRef();

        ref.x = 10;

        ref.addition(ref);
        System.out.println(ref.x); //15


    }
}
