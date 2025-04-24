package Dayone;

public class Example {
    int x;
    int y;

    Example(){
        this(10,20); //Calls the parameterized constructor
        System.out.println("Default constructor");
    }

    Example(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Parameterized constructor");
    }

    void print(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Example example = new Example();// Calls the default constructor
        example.print();
    }
}
