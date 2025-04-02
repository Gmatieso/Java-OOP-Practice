package DayTwo;

public class CallByValue {

    // IN Call By Value: We hv to pass a value to a method as a parameter
    // In Call By reference: We hv to pass object to a method as parameter

    int x ;

    public void addition(int a){
        x = a + 5;
        System.out.println("Hey TEch g... you guys know each other for : " + x + "Years. Happy Annvesery");
    }

    public static void main(String[] args) {
        CallByValue obj = new CallByValue();
//        obj.addition( 5);
        obj.addition(obj.x);

        obj.addition(obj.x);

        System.out.println(obj.x); // 10
    }
}
