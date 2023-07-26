package comTwo.objectorientedjava.multithreading;

public class ThreadStatesDemo   {


    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());

        System.out.println("Thread State: " + thread.getState()); // Thread state should be NEW

        thread.start();
        System.out.println("Thread State: " + thread.getState()); // Thread state should be RUNNABLE

        try {
            Thread.sleep(100); // Sleep for a short time to allow the thread to run
            System.out.println("Thread State: " + thread.getState()); // Thread state might be TIMED_WAITING (due to sleep)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread.join();
            System.out.println("Thread State: " + thread.getState()); // Thread state should be TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(500); // Sleep for some time to simulate thread's activity
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread is finishing...");
        }
    }


}
