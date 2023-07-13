package BasicDatatypeConditionArrayStringConcepts.stringex.StringBasicPrograms;

public class DuplicateWordsInString {
    public static void main(String[] args) {

        String str="Hello java is the is prgramming the Hello language is good for application development hello good";
        String arr[]=str.split(" ");

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length; j++) {

                if (arr[i].equals(arr[j]))
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
