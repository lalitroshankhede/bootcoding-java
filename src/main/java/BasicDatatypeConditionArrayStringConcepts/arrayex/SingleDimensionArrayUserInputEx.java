package BasicDatatypeConditionArrayStringConcepts.arrayex;

import java.util.Scanner;

public class SingleDimensionArrayUserInputEx {
    public static void main(String[] args) {

        //Declare Size of Array and take input from user
        int arr[]=new int[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element for index["+i+"]");
            arr[i]=input.nextInt();
        }

        System.out.println("========== Print Array ===========");
        for (int i = 0; i < arr.length ; i++) {

            System.out.println(arr[i]);
        }
    }
}
