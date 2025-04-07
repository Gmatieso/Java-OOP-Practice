package DayNine;

public class ForEachLoop {

public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int sum = 0;
    for(int number: arr){
        sum += number;
        System.out.println("Number:" + number);
    }
    System.out.println("Sum:" + sum);
}
}
