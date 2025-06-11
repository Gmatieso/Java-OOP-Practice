package DaySixteen;

public class MyThreadPriority implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Started" + threadName);
        for (int count = 0; count < 5; count ++){
            System.out.println("In" + threadName + "count is" + count);
        }
    }
}
