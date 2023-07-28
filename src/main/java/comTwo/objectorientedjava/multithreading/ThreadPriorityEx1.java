package comTwo.objectorientedjava.multithreading;

public class ThreadPriorityEx1 extends Thread {

    public void run()
    {
        System.out.println("Running Run Method");
    }

    public static void main(String[] args) {

        ThreadPriorityEx1 obj1=new ThreadPriorityEx1();
        ThreadPriorityEx1 obj2=new ThreadPriorityEx1();
        ThreadPriorityEx1 obj3=new ThreadPriorityEx1();
   // Show Default Thread Priority
        System.out.println("Priority of Thread 1 is : "+obj1.getPriority());
        System.out.println("Priority of Thread 2 is : "+obj2.getPriority());
        System.out.println("Priority of Thread 3 is : "+obj3.getPriority());


        //Setting the Priority of Thread using setPriority() method
        obj1.setPriority(6);
        obj2.setPriority(3);
        obj3.setPriority(9);

// getting the priority of each thread
        System.out.println("Priority of Thread 1 is : "+obj1.getPriority());
        System.out.println("Priority of Thread 2 is : "+obj2.getPriority());
        System.out.println("Priority of Thread 3 is : "+obj3.getPriority());




      //Display name of current executing thread

        System.out.println("Currently Executing Thread is "+Thread.currentThread().getName());


        //get defualt main thread priority
        System.out.println("Priority of Main thread is : "+Thread.currentThread().getPriority());

   // set priority of main thread
        Thread.currentThread().setPriority(10);

        // getting priorty of main thread
        System.out.println("Priority of Main Thread is : "+Thread.currentThread().getPriority());

    }

}
