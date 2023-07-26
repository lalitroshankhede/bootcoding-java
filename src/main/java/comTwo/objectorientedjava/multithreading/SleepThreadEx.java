package comTwo.objectorientedjava.multithreading;

public class SleepThreadEx extends  Thread{
    public void run()
    {
        for (int i = 1; i <=5 ; i++) {


            try{

                Thread.sleep(500);   // if you passed (negative) value in sleep method it will give IllegalArgumentException

            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);

        }
    }

    public static void main(String[] args) {

        SleepThreadEx obj1=new SleepThreadEx();
        SleepThreadEx obj2=new SleepThreadEx();

        obj1.start();
        obj2.start();
    }
}
