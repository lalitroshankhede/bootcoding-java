package comTwo.objectorientedjava.multithreading;

public class ThreadwithRunnableandString implements Runnable {


    @Override
    public void run() {
        System.out.println("Now the Thread is Running... ");
    }

    public static void main(String[] args) {

        Runnable obj=new ThreadwithRunnableandString();

        Thread thread=new Thread(obj,"Main Thread");

        thread.start();

        String str=thread.getName();
        System.out.println(str);

    }
}
