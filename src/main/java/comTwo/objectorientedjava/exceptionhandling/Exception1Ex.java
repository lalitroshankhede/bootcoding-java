package comTwo.objectorientedjava.exceptionhandling;

public class Exception1Ex {
    public static void main(String[] args) {

        int num1 = 50;
        int num2 = 0;
        int result;
        try {
//            int a=10/0;                              // Arithmetic Exception
//            System.out.println("Result="+a);

//            String str=null;                          // NullPointer Exception
//            System.out.println(str.length());


//            String string="hello";
//            int num=Integer.parseInt(string);              //Number Format Exception
//            System.out.println(num);

//            int arr[]=new int[5];
//            arr[10]=50;                       //ArrayIndexOutOfBoundException
//            System.out.println(arr[10]);



             result = num1 / num2;


        } catch (ArithmeticException e) {
            System.out.println(e);

             //to resolving exception occuered by try block
//            System.out.println(num1/(num2+2));



        }
        System.out.println("Rest of Code");

    }
}
