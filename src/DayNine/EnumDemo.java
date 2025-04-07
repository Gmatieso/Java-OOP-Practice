package DayNine;

public class EnumDemo {
    public static void main(String[] args) {
//        Priority priority = Priority.LOW;
        Priority priority = Priority.valueOf("HIGH");

        switch (priority) {
            case HIGH -> System.out.println("High priority");
            case MEDIUM -> System.out.println("Medium priority");
            case LOW -> System.out.println("Low priority");
        }
    }
}
