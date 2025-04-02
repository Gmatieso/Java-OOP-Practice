package DayThree;

  class FinalVariableDemo {
    // final is like a restriction level access.
    // when applied you cannot change the value of the variable
    // method = method cannot be override in the child classes.
      int speed = 100;

    public static void main(String[] args) {
        FinalVariableDemo demo = new FinalVariableDemo();
        demo.speed = 10; // incorrect, compile time error

        System.out.println("This is final" + " " + demo.speed);

    }
}
