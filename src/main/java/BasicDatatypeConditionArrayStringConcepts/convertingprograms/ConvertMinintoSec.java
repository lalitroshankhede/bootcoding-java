package BasicDatatypeConditionArrayStringConcepts.convertingprograms;

public class ConvertMinintoSec {

    public static void main(String[] args) {


        int arr[]={3,5,10,23,60};
        int sec=0;
        for (int i=0;i< arr.length;i++)
        {
            sec=arr[i]*60;

            System.out.println(arr[i]+" mins"+"-> "+sec+"seconds");
        }
    }
}
