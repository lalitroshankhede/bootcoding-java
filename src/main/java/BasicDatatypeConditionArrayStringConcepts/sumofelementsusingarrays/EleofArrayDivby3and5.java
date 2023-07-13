package BasicDatatypeConditionArrayStringConcepts.sumofelementsusingarrays;

public class EleofArrayDivby3and5 {

    public static void main(String[] args) {
        int arr[]={5,6,9,11,26,63,33,85};
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]%3==0 ||arr[i]%5==0)
            {
                System.out.println(arr[i]);
            }
        }

    }
}
