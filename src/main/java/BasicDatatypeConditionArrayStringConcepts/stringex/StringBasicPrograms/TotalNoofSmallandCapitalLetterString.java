package BasicDatatypeConditionArrayStringConcepts.stringex.StringBasicPrograms;

public class TotalNoofSmallandCapitalLetterString {
    public static void main(String[] args) {

        String str="HelloWelcomeToTheJavaProgramming";
        char[] ch=str.toCharArray();
        int smallLetter=0,capitalLetter=0;
        for (int i = 0; i < ch.length; i++) {

            if (ch[i]>=97 && ch[i]<=122)  //to check character's ASCII values
            {
                smallLetter++;
            }
            else
            {
                capitalLetter++;
            }
        }
        System.out.println(smallLetter);
        System.out.println(capitalLetter);

    }
}
