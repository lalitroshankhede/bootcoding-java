package BasicDatatypeConditionArrayStringConcepts.datatypeex;

import java.util.*;



public class Datatype
{


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int principle=input.nextInt();
        float rate=input.nextFloat();
        int time=input.nextInt();

        int intrest= (int) (principle*rate*time/100);

        System.out.println(intrest);
    }
}