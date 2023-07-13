package BasicDatatypeConditionArrayStringConcepts.sumofseries;

public class Sum_of_Series {

    public static void main(String[] args) {
        int num = 5;
        int givenNo = 9;
        int org = givenNo;
        int sum = 0;
        System.out.println(givenNo);
        for (int i = 1; i <= num - 1; i++) {
            givenNo = givenNo * 10 + 9;
            System.out.println(givenNo);
            sum = sum + givenNo;
        }
        System.out.println("The sum of the saries = " + (sum + org));
    }
}
