package DayNine;

public class Array {
    public static void main(String[] args) {
        int[] arr;  // one way of creating an array
        int arr2[];  // another way of creating an array
        arr = new int[10];
//        arr2 = new int[10];
        System.out.println(arr.length);
        System.out.println(arr[0]);

        double[] arr3 = new double[10];
        System.out.println(arr3[0]);

        boolean[] arr4 = new boolean[10];
        System.out.println(arr4[0]);
    }
}
