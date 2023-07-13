package BasicDatatypeConditionArrayStringConcepts.methodsex;
public class MiddleChaofString {
    public static void main(String[] args) {
        String str1 = "350";
        String result = minCh(str1);
        System.out.println(result);
    }
    public static String minCh(String str) {
        String data = str.substring(1, 2);
        return data;
    }
}
