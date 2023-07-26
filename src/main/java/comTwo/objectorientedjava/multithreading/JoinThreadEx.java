package comTwo.objectorientedjava.multithreading;

public class JoinThreadEx extends  Thread {

    private String threadName;

    public JoinThreadEx(String name) {
        this.threadName = name;
    }


    public void run()
    {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new JoinThreadEx("Thread 1");
        Thread thread2 = new JoinThreadEx("Thread 2");

        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish using join()
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have completed their execution.");
    }

}
