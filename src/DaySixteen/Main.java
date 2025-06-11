package DaySixteen;

public class Main {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();

        for(int count = 1; count < 5; count ++){
            System.out.println("In main thread, count is:" +  count);
        }

    }
}
