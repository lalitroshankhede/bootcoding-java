package com.methodsex;

public class EvenNowithPosition {

  public static void evenValue(int allElements[])
  {

      System.out.println("============= Original Array ===========");

      for (int i = 0; i < allElements.length ; i++) {

              System.out.print(allElements[i]);

      }

      System.out.println();
      for (int i = 0; i < allElements.length ; i++) {
          if (allElements[i]%2==0)
          {
              System.out.println("Even Element is "+allElements[i]+" "+"On"+" "+(i+1)+" "+"Position");
          }
      }

  }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int arrele[]=arr;
        evenValue(arrele);
    }
}
