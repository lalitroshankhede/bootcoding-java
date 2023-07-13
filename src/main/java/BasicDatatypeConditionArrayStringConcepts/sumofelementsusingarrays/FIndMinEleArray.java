package BasicDatatypeConditionArrayStringConcepts.sumofelementsusingarrays;

public class FIndMinEleArray {
    public static void main(String[] args) {

        int arr[] = {5, 0, 92, 1, 62};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in array is :" + min);
    }
}
