package BasicDatatypeConditionArrayStringConcepts.methodsex;

import java.util.Scanner;

public class EvenOddUsingMethod {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int num=0;
        while (true) {
           if (num>=0)
           {
               System.out.println("Enter Any No");
                num = input.nextInt();
               System.out.println(num + " is " + evenOdd(num));
           }
           else
           {
               break;
           }
        }
    }
    public static String evenOdd(int number)
    {
        int result=number;
        if (result%2==0)
        {
            return "Even No";
        }
        else
        {
            return "Odd No";
        }
    }
}
