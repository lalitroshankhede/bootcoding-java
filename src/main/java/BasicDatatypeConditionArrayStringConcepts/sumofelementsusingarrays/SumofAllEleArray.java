package BasicDatatypeConditionArrayStringConcepts.sumofelementsusingarrays;

import java.util.Scanner;

public class SumofAllEleArray {

    public static void main(String[] args) {

        int arrSize=0;
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        arrSize=input.nextInt();

        int arr[]=new int[arrSize];
        System.out.println("Enter Element of Array");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
             sum=sum+arr[i];
        }
        System.out.println("Total sum of all element of array is : "+sum);

    }
}
