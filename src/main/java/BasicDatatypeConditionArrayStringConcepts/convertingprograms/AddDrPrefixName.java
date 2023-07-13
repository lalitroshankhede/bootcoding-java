package BasicDatatypeConditionArrayStringConcepts.convertingprograms;

public class AddDrPrefixName {

    public static void main(String[] args) {

        String names[]={"Rajesh", "Tushar", "Anil", "Megha"};
        String designation="Dr.";

        for (int i=0;i< names.length;i++)
        {
            System.out.println(designation+names[i]);
        }
    }
}
