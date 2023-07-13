package BasicDatatypeConditionArrayStringConcepts.stringex.StringBasicPrograms;

import java.util.Scanner;

public class ReverseStringWithoutMethod {

    public static void main(String[] args) {

        //Approch 1 with using another String

//        String str="HelloWelcomeToTheJavaProgramming";
//        String reversedStr = "";
//        System.out.println(str);
//
//        for (int i =str.length()-1; i>=0 ; i--) {
//            reversedStr=reversedStr+str.charAt(i);
//        }
//        System.out.println(reversedStr);


        //Approch 2 using ForLoop

//        String s;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a String: ");
//        s = sc.nextLine();                    //reading string from user
//        System.out.print("After reverse string is: ");
//        for (int i = s.length(); i > 0; --i)                //i is the length of the string
//        {
//            System.out.print(s.charAt(i - 1));            //printing the character at index i-1
//        }


        //Approch 3 using while loop

//        String s;
//        Scanner sc=new Scanner(System.in);                    //reading string from user
//        System.out.print("Enter a String: ");
//        s=sc.nextLine();
//        System.out.print("After reverse string is: ");
//        int i=s.length();                   //determining the length of the string
//        while(i>0)
//        {
//            System.out.print(s.charAt(i-1));                 //printing the character at index i-1
//            i--;                               //decreasing the length of the string
//        }


        //Approch 4 using static method

//        ReverseStringWithoutMethod rev=new ReverseStringWithoutMethod();
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter a string : ");
//        String  s=sc.nextLine();
//        System.out.println("Reverse String  is : "+rev.reverse(s)); //calling method
//    }
//    //calling method
//    static String reverse(String str)
//    {
//        String rev="";
//        for(int i=str.length();i>0;--i)
//        {
//            rev=rev+(str.charAt(i-1));
//        }
//        return rev;



    }
}
