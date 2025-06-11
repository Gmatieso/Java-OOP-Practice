package DaySixteen;

public class Main {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        for(int count = 0; count < 5; count ++){
            System.out.println("In main thread, count is:" +  count);
        }

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

    }
}
