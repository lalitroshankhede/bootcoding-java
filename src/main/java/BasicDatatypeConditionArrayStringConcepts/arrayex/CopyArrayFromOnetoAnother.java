package BasicDatatypeConditionArrayStringConcepts.arrayex;

public class CopyArrayFromOnetoAnother {

    public static void main(String[] args) {
        int arr1[]={2,3,4,5,6};
        int arr2[]=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
        System.out.println("================ Printing Elements of Array1 ============");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("=============================");

        System.out.println("================ Printing Elements of Array2 ============");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
