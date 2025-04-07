package DayNine;

public class While {
    public static void main(String[] args) {
        System.out.println("This is a while Loop");
        int counter = 0;
        // while a condition is always true do this action.
        while (counter < 10) {
            System.out.println("Counter:" + counter++);
        }
    }
}
