package comTwo.objectorientedjava.multithreading;

public class ThreadPriorityExample extends Thread {

    public ThreadPriorityExample(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " is running. Count: " + i);
            try {
                Thread.sleep(1000); // Simulate some work for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Thread thread1 = new ThreadPriorityExample("Thread 1");
        Thread thread2 = new ThreadPriorityExample("Thread 2");
        Thread thread3 = new ThreadPriorityExample("Thread 3");

        // Set thread priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
