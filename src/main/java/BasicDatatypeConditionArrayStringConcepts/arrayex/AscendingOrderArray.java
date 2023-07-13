package BasicDatatypeConditionArrayStringConcepts.arrayex;

public class AscendingOrderArray {

    public static void main(String[] args) {

        int arr[]={2,5,4,3,8,4,7,3,1,6};
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j<arr.length ; j++) {

                if (arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorting Element in Ascending Order");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
