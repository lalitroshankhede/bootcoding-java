package BasicDatatypeConditionArrayStringConcepts.arrayex;

public class TotalElementinArra {

    public static void main(String[] args) {

        int arr[]={2,3,5,6,7,8,9,0,6,4,3,3};
        int countEle=0;
        for (int i = 0; i < arr.length; i++) {
            countEle++;
        }
        System.out.println(countEle);
    }
}
