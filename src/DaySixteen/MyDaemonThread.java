package DaySixteen;

public class MyDaemonThread extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println("My DaemonThread is running...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
