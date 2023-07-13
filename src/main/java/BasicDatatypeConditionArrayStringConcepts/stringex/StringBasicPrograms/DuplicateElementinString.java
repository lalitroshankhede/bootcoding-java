package BasicDatatypeConditionArrayStringConcepts.stringex.StringBasicPrograms;

public class DuplicateElementinString {
    public static void main(String[] args) {

        String str="HelloJavaHii";
        String finalString=str.toLowerCase();

        char[] ch=finalString.toCharArray();

        int count=0;
        for (int i = 0; i < ch.length; i++) {

            for (int j = i+1; j < ch.length; j++) {

                if (ch[i]==ch[j])
                {
                    System.out.println(ch[j]);
                }
            }

        }


    }
}
