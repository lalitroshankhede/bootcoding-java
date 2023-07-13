package BasicDatatypeConditionArrayStringConcepts.sumofelementsusingarrays;

public class FirstIndexLastIndexEleSame {
    public static void main(String[] args) {

        int arr[] = {7,22,19,44,7,7,7};

              if ( arr[0] ==  arr[arr.length-1])
              {
                  System.out.println("Same");
                  System.out.print("\t"+arr[arr.length-1]);
              }
              else
              {
                  System.out.println("Not Same");
              }
        }
    }

