package BasicDatatypeConditionArrayStringConcepts.datatypeex;

import java.util.*;



public class Datatype
{


    public static void main(String args[]) {

        // Write code here

        Scanner input=new Scanner(System.in);

        int fact=1;
        int num=input.nextInt();

        if(num>=0)
        {
            while(num!=0)
            {
                fact=fact*num;

                num--;
            }


            System.out.println(fact);

        }
        else

        {
            System.out.println("Error");
        }


    }
}