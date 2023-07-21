package comTwo.objectorientedjava.exceptionhandling;

public class ThrowExample {

    public static void main(String[] args) {
        int a=10;
        if (a>0)
        {
            a=a/0;
            System.out.println("Result :"+a);
            throw  new ArithmeticException("Can't Divide by 0");
        }
        else
        {
            System.out.println("Value is negative ");
        }

    }
}
