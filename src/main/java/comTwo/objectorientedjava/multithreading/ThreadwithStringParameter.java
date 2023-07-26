package comTwo.objectorientedjava.multithreading;

public class ThreadwithStringParameter {

    public static void main(String[] args) {

        Thread obj=new Thread("This is Main Thread");


        obj.start();

        String str= obj.getName();
        System.out.println("Name of Thread is : "+ str);
    }
}
