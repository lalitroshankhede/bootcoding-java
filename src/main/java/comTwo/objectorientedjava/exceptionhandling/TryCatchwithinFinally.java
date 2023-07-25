package comTwo.objectorientedjava.exceptionhandling;

public class TryCatchwithinFinally {


    public static void main(String[] args) {


        int a=10;
        int b=0;
        try
        {
            int val=a+b;
            System.out.println(val);
        }
        finally {
            try
            {
                int result=a/b;
                System.out.println("Result is :" +result);
            }

            catch (ArithmeticException e)
            {
                System.out.println("Exception Handled");
            }

            System.out.println("Always Executed");
        }

    }
}
