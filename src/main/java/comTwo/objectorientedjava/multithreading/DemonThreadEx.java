package comTwo.objectorientedjava.multithreading;

public class DemonThreadEx extends Thread {

    public void run()
    {
        if (Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon Thread Running...");
        }
        else
        {
            System.out.println("User Thread Running...");
        }

    }

    public static void main(String[] args) {
        DemonThreadEx obj1=new DemonThreadEx();
        DemonThreadEx obj2=new DemonThreadEx();
        DemonThreadEx obj3=new DemonThreadEx();


          obj1.setDaemon(true); //now obj1 is Daemon Thread

        obj1.start();
        obj2.start();
        obj3.start();

       }
}
