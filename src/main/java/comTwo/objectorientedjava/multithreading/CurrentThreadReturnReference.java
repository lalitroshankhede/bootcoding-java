package comTwo.objectorientedjava.multithreading;

public class CurrentThreadReturnReference extends Thread{


        public void run(){
            System.out.println(Thread.currentThread().getName());
        }
        public static void main(String args[]){
            CurrentThreadReturnReference t1=new CurrentThreadReturnReference();
            CurrentThreadReturnReference t2=new CurrentThreadReturnReference();

            t1.start();
            t2.start();
        }
    }

