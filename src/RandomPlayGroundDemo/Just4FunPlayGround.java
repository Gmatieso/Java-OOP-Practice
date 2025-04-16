package RandomPlayGroundDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Just4FunPlayGround {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Printing my Array list:" + list);

        List<Integer> nums = Arrays.asList(4,5,6,7,8,9);

        // introduced in java 8.
        // using internal loop
        nums.forEach(n -> System.out.println("Using lambda expression:" + n));

        // lets use external loop to fetch data
        for(int i = 0; i < nums.size(); i++){
            System.out.println("Using external for loop:" + nums.get(i));
        }
        // using enhanced for loop.
        for(int n :nums){
            System.out.println("Using external enhanced for loop:" + n);
        }
    }
}