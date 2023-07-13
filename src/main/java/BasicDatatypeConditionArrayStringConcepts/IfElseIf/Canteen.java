package BasicDatatypeConditionArrayStringConcepts.IfElseIf;

import java.util.Scanner;

public class Canteen {
    public static void main(String[] args) {

        System.out.println("************ Welcome To South Indian Food ****************");
        System.out.println("Choose Item");
        System.out.println(" 1.Masala Dosa \n 2.Sambhar Vada \n 3.Idli");
        Scanner input=new Scanner(System.in);
        int item=input.nextInt();
         if (item==1)
         {
             System.out.println("Masala Dosa Rs. 30");

         } else if (item==2) {

             System.out.println("1.Full Plate 2.Half Plate");
             int item2=input.nextInt();
             if (item2==1)
             {
                 System.out.println("Sambhar Vada Full Plate Rs. 30");
             }
             else {
                 System.out.println("Sambhar Vada Half Plate Rs. 20 ");
             }
         }

         else if (item==3) {

             System.out.println("1.Full Plate 2.Half Plate");
             int item3=input.nextInt();
             if (item3==1)
             {
                 System.out.println("Idli Full Plate Rs. 30");
             }
             else {
                 System.out.println("Idli Half Plate Rs. 15 ");
             }
         }

         else {
             System.out.println("Invalid Option");
         }

    }
}
