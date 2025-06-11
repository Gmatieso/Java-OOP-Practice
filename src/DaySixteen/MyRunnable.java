package DaySixteen;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int count = 0 ; count < 5; count ++){
            System.out.println("In my Runnable, count is:" + count);
        }
    }
}
