package BasicDatatypeConditionArrayStringConcepts.stringex;

public class StringAllBaiscMethodsExample {

    public static void main(String[] args) {

        //All Basic String methods Examples

   //1. equals
//    String str1="javatpoint";
//    String str2="javatpoint";
//    String str3="JAVATPOINT";
//    String str4="Python";
//
//        System.out.println(str1.equals(str2)); //true
//        System.out.println(str1.equals(str3)); //false
//        System.out.println(str1.equals(str4)); //false


        //2. equalsIgnoreCase

//        String str1="javatpoint";
//    String str2="javatpoint";
//    String str3="JAVATPOINT";
//    String str4="Python";
//
//        System.out.println(str1.equalsIgnoreCase(str2)); //true
//        System.out.println(str1.equalsIgnoreCase(str3)); //true
//        System.out.println(str1.equalsIgnoreCase(str4)); //false

        //3.isEmpty

//        String str="";
//        String str2="Hii";
//        System.out.println(str.isEmpty()); // true if string is Empty otherwise return false
//        System.out.println(str2.isEmpty());

        //4.length

//        String str="Hii my name is Mr. Lalit Roshankhede";
//        int result=str.length();
//        System.out.println("Length of String is :" +result);

        //5.replace

//        String str="javatpoint";
//        String result=str.replace("java","hava");
//        System.out.println(result);

        //6.replaceAll
//        String str="Java T Point";
//        String replaceResult=str.replaceAll(" ","");  //to remove white space between String
//        System.out.println(replaceResult);

     //7.toLowerCase

//         String str="HELLO MY NAME IS LALIT";
//         String lowerResult=str.toLowerCase();
//        System.out.println(lowerResult);

        //8. toUpperCase
//        String str="hello welcome to JavaTpoint";
//         String upperResult=str.toUpperCase();
//        System.out.println(upperResult);

        //9. trim

//        String str=" Java is Secure Programming Language ";
//        System.out.println("------- Before Trim method ---------- ");
//        System.out.println(str);
//        System.out.println("---------- After Trim method ------------ ");
//        String resultTrim=str.trim();
//        System.out.println(resultTrim);


        //10. startsWith
//        String str="Mr.Lalit Roshankhede you are great";
//         if (str.startsWith("Mr"))
//         {
//             System.out.println("Prefix is Mr.");
//         }
//        else {
//             System.out.println("Prefix is different");
//         }

        //11.endsWith

//        String str="Hello Welcome to the Java World";
//        if (str.startsWith("Hello") && str.endsWith("Programming"))
//        {
//            System.out.println("String is : Hello Welcome to the Java Programming");
//        }
//        else {
//            System.out.println("String is Different");
//        }


        //12. concat

//        String str="Welcome";
//        str.concat(" to Java World");
//        System.out.println(str); //to print only Welcome because String is immutable if you want to contact you need to assign explicitly
//         String st=str.concat(" to Java World");  // assign String explicitly to String variable
//        System.out.println(st); // Welcome to Java World


        //13. join


//        String str=String.join("-","Welcome","to","javatpoint");
//        System.out.println(str);
//

        //14. contains

//        String str="Java is portable platform independent and secure programming language";
//        System.out.println(str.contains("platform"));
//        System.out.println(str.contains("multithreaded"));
//        System.out.println(str.contains("secure"));


        //---------------------- End of String Basic Methods ------------------



    }
}
