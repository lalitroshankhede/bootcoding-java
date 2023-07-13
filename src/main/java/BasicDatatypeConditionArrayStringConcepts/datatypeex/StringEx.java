package BasicDatatypeConditionArrayStringConcepts.datatypeex;

public class StringEx {
    public static void main(String[] args) {

        //How to create String in Java
//        String name = "SamSung";
//        // [S,a,m,S,u,n,g]
//        // [0,1,2,3,4,5,6]
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trim());
//        System.out.println(name.charAt(0));
//        System.out.println(name.indexOf("S"));
//        System.out.println(name.lastIndexOf("S"));

        // equals() - compare 2 strings

        String tech1 = "aniket";
        String tech2 = "LALIT";

        System.out.println(tech1==tech2);
        System.out.println(tech1.equals(tech2));
        System.out.println(tech1.compareTo(tech2));

        // == -> Equality comparison
        // equals() -> Equality comparison
        // == - Compares References of 2 strings
        // equals() - compares values of 2 strings

        // split(",") - "HTML,CSS,MySQL,JAVA"
        //"HTML"
        //"CSS"
        //"MySQL"
        //"JAVA"

        // subString(beginIndex, lastIndex) - "SpringBoot"
        // subString(0,5) -> Spring
    }
}
