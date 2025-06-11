package DaySixteen;

/*
    Multithreading Enables execution of multiple task within a program
    Lets say we hv Task A, Task B, and Task C, we can execute all this task in a separate thread or run them concurrently
    Threads are lightweight process that  operate independently within main program process

    Implementing Multithreading in Java:
        Java utilizes the Thread class and interfaces like Runnable and Callable
    Creating a new thread in Java:
        1. Let Extend the Thread class
        2. Lets Implement the Runnable interface and pass it to a Thread constructor
    Starting and Running threads:
        1. use the start() method to initiate a thread
        2. the run() method is executed on a separate thread
   Conclusion: In Java, multithreading is facilitated through the Thread class and interface like Runnable. Creating and starting new threads involves
                extending or implementing these classes and invoking the start() method, leading to concurrent execution in separate thereads.
     So what's Concurrency:
     In Concurrency we execute multiple task at the same time. not simultaneously but at the same time. example
     an Api fetching data at the same time performing calculation
     So what's Parallelism:
     Executing task simultaneously, often across multiple processors or cores

 */

public class MyThread extends Thread {
    @Override
    public void run(){
        for(int count = 0; count < 5; count ++){
            System.out.println("In MyThread, count is:" + count);
        }
    }
}
