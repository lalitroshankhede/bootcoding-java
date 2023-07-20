package comTwo.objectorientedjava.exceptionhandling;

public class MultipleCatchBlockException {

    public static void main(String[] args) {

        try{
//            int a[]=new int[5];
//            a[5]=30/0;

            String str="hello";
            int value=Integer.parseInt(str);        // Did't define any exception for  this error so it will called Parent Exception
                                                   // class i.e Exception
            System.out.println(value);

        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array size is exceed");
        }
       catch (ArithmeticException e)
       {
           System.out.println("Arithmetic Exception Occur");
       }
       catch (NullPointerException e)
       {
           System.out.println("Null Value Occur");
       }
        System.out.println("Rest of Code Executed");
    }
}
