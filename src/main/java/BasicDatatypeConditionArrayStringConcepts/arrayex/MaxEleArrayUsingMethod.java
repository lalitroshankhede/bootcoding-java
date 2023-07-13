package BasicDatatypeConditionArrayStringConcepts.arrayex;
public class MaxEleArrayUsingMethod {

    public static int getMaxEle(int num[])
    {


        int max= num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max)
            {
                max=num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int arr[]={5,7,9,6,14,3};
        int result=getMaxEle(arr);
        System.out.println("Maximun element of array is" +result);
    }
}
