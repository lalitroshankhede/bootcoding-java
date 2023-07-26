package comTwo.objectorientedjava.multithreading;

public class RunnableEx1 implements  Runnable{

    public void run()
    {
        System.out.println("Thread is Running ... ");
    }

    public static void main(String[] args) {
        RunnableEx1 obj=new RunnableEx1();
        Thread th=new Thread(obj);
        th.start();

    }
}
