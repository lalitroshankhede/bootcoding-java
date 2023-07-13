package BasicDatatypeConditionArrayStringConcepts.methodsex;

import java.util.Scanner;

public class SumOfTwoUsingMethod {

    public static void main(String[] args) {
        int num1,num2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter No 1");
        num1=input.nextInt();
        System.out.println("Enter No 2");
        num2=input.nextInt();
        System.out.println("Addition of Num1 and Num2 is :"+sumOfTwo(num1,num2));  //calling method

    }

    public static int sumOfTwo(int x, int y)   //passing argument
    {
             int sum=x+y;   //addition
             return sum;   //return value to main
    }

}
