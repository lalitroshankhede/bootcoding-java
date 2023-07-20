package comTwo.objectorientedjava.exceptionhandling;

public class FinallyBlockEx {
    public static void main(String[] args) {

        try{

            int num=10/0;
            System.out.println(num);
        }

        finally {

             int a=10+20;
            System.out.println(a);
            System.out.println("Finally Block Always Executed");
        }

    }
}
