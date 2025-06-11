package DaySixteen;

public class MyGivingThreadToOtherThreads implements Runnable{
    @Override
    public void run() {
        for(int count = 0; count < 5; count ++){
            System.out.println("In my Giving Thread to other threads, count is:" + count);
            Thread.yield(); // here we are saying wen you've run an instance of a thread you can give other threads to execute
        }
    }
}
