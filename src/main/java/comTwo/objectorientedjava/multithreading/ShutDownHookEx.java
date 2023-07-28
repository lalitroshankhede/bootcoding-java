package comTwo.objectorientedjava.multithreading;

public class ShutDownHookEx extends  Thread{

    public void run()
    {
        System.out.println("Shut down hook task completed ...");
    }

    public static void main(String[] args) throws Exception {
        Runtime r= Runtime.getRuntime();
        r.addShutdownHook(new ShutDownHookEx());

        System.out.println("Now main sleeping... press ctrl+c to exit");
        try
        {
            Thread.sleep(4000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
