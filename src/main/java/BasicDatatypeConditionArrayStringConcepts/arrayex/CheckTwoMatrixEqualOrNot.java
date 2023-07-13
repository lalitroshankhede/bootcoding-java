package BasicDatatypeConditionArrayStringConcepts.arrayex;

public class CheckTwoMatrixEqualOrNot {

    public static void main(String[] args) {

        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        int flag=0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

               if (arr1[j][j]==arr2[i][j])
               {
                   flag=1;
               }
            }
        }

        if (flag==1)
        {
            System.out.println("Both Array are Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
