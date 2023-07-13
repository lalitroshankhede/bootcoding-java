package BasicDatatypeConditionArrayStringConcepts.methodsex.SingleMultpleArray;

public class FactorialService {
    public int getFact(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }
    public int[] getFacts(int[] nums){
        for(int i = 0; i < nums.length; i++){

            nums[i] = getFact(nums[i]);
        }
        return nums;
    }

    public void printFact(int[] number){
        PrintService ps = new PrintService();
        ps.printArray(number);
    }
}
