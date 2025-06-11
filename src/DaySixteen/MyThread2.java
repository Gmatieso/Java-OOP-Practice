package DaySixteen;

public class MyThread2 extends Thread {
    @Override
    public void run(){
        System.out.println( Thread.currentThread().getName() + "running (before sleep)");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "running (after sleep)");
        }
    }

