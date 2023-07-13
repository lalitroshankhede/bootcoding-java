package BasicDatatypeConditionArrayStringConcepts.methodsex;

import java.util.Scanner;

public class ChkPositiveOrNegativeUsingMethod {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int num=0;
        while (true) {
            if (num>=0)
            {
                System.out.println("Enter Any No");
                num = input.nextInt();
                System.out.println(num + " is " + potiveOrNegative(num));
            }
            else
            {
                break;

            }
        }
    }
    public static String potiveOrNegative(int number)
    {
        int result=number;
        if (number>0)
        {
            return "Positive No";
        }
        else
        {
            return "Negative No";
        }
    }
}
