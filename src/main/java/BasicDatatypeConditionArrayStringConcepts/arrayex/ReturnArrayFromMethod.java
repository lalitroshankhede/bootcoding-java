package BasicDatatypeConditionArrayStringConcepts.arrayex;

public class ReturnArrayFromMethod {

    static int[] returnArray()
    {
          int arr[]={5,65,67,33,23,76,35};
          return arr;
    }

    public static void main(String[] args) {
        int[] array=returnArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
