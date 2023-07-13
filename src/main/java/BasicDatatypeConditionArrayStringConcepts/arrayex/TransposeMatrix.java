package BasicDatatypeConditionArrayStringConcepts.arrayex;

public class TransposeMatrix {

    public static void main(String[] args) {

        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int FinalArray[][]=new int[3][3];

        System.out.println("=========== Original Array ==========");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                FinalArray[i][j]=arr1[j][i];
            }
        }


        System.out.println("============== Printing Transpose Matrix Array ==========");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                System.out.print(FinalArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
