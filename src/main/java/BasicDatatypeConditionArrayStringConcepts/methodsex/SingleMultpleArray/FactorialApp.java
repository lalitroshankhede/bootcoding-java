package BasicDatatypeConditionArrayStringConcepts.methodsex.SingleMultpleArray;

public class FactorialApp {
    public static void main(String[] args) {
        FactorialService fs = new FactorialService();
        int[] nums = {2,5,6,9};
        int[] results = fs.getFacts(nums);
        PrintService ps = new PrintService();
        ps.printArray(results);


    }
}
