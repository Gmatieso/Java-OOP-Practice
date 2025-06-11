package DaySixteen;

public class Main {
    public static void main(String[] args){
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.start();
//
//        for(int count = 0; count < 5; count ++){
//            System.out.println("In main thread, count is:" +  count);
//        }
//
//        MyThread2 myThread2 = new MyThread2();
//        myThread2.start();
//
//        Thread threadStateExample = new Thread(new ThreadStateExample());
//
//        System.out.println("Thread state:" + threadStateExample.getState()); // NEW
//
//        threadStateExample.start();
//
//        System.out.println("Thread state:" + threadStateExample.getState()); // RUNABLE
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Thread state:" + threadStateExample.getState()); //TERMINATED

        Thread t0 = new Thread(new MyThreadPriority());
        Thread t1 = new Thread(new MyThreadPriority());
        t0.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t0.start();
        t1.start();
   }
}
