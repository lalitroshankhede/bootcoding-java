package BasicDatatypeConditionArrayStringConcepts.stringex.StringBasicPrograms;
public class RemoveAllPuntuationinString {

    public static void main(String[] args) {

        String str="He said,'The mailman loves you.' I heard it with my own ears.";
       String finalStr=null;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {

                System.out.println(str.replaceAll("[^a-zA-Z]",""));
            }
        }
    }



}
