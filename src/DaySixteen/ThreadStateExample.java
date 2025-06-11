package DaySixteen;

public class ThreadStateExample implements Runnable{
    @Override
    public void run() {
        System.out.println("You are seeing this because my 1 minute thread pause is over .. now  do thread  running...");
    }
}
