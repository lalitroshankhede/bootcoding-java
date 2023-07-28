package comTwo.objectorientedjava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample implements Runnable{

    private String taskName;

    public ThreadPoolExample(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " is being executed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate some work for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit tasks to the thread pool
        for (int i = 1; i <= 5; i++) {
            Runnable task = new ThreadPoolExample("Task " + i);
            executorService.submit(task);
        }

        // Shutdown the thread pool
        executorService.shutdown();
    }
}
