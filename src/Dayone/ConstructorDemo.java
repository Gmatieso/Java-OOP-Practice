package Dayone;

public class ConstructorDemo {

    // Constructor overloading means? == Same constructor/ methods can be defined within the same class
    int x,y;

    //lets hv a default constructor
    ConstructorDemo(){
        x = 100;
        y = 200;
        System.out.println(x + y );
    }

    ConstructorDemo(int a,int b){    // This is a parameterized Constructor
        this.x=a;
        this.y=b;
        System.out.println(x + y );
    }

    public static void main(String[] args) {
        ConstructorDemo demo = new ConstructorDemo(100, 30);
    }
}
