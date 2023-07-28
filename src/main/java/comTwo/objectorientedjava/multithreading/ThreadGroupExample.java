package comTwo.objectorientedjava.multithreading;

public class ThreadGroupExample implements Runnable{

    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupExample obj=new ThreadGroupExample();
        ThreadGroup threadGroup=new ThreadGroup("Parent Thread Group");

        Thread thread1=new Thread(threadGroup,obj,"One");
        thread1.start();
        Thread thread2=new Thread(threadGroup,obj,"Two");
        thread2.start();
        Thread thread3=new Thread(threadGroup,obj,"Three");
        thread3.start();

        System.out.println("Thread Group Name is : "+threadGroup.getName());
        threadGroup.list();


    }
}
