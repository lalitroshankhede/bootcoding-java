package comTwo.objectorientedjava.multithreading;

public class SimpleThreadGroupExample {
    public static void main(String[] args) {
        // Create a new thread group
        ThreadGroup myThreadGroup = new ThreadGroup("MyThreadGroup");

        // Create threads and assign them to the thread group
        Thread thread1 = new Thread(myThreadGroup, new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(myThreadGroup, new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(myThreadGroup, new MyRunnable(), "Thread 3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished.");
    }

    // Simple Runnable implementation
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running.");
            try {
                Thread.sleep(2000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has finished.");
        }
    }
}
