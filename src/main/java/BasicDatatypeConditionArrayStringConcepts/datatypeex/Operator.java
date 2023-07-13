package BasicDatatypeConditionArrayStringConcepts.datatypeex;

public class Operator {
    public static void main(String[] args) {
        int mathMark=75;
        int sciMark=89;

        // Arithmetic Operator

        int add=mathMark+sciMark;
        int sub=mathMark-sciMark;
        int mul=mathMark*sciMark;
        int div=mathMark/sciMark;
        int mod=mathMark%sciMark;

        System.out.println("Addition = "+add);
        System.out.println("Subtraction = "+sub);
        System.out.println("Multiplication = "+mul);
        System.out.println("Division = "+div);
        System.out.println("Modulus = "+mod);


        //Increment and Decrement Operator

        int a=10;
        int b=10+a++;
        System.out.println(b);


        int aa=10;
        int bb=10+a--;
        System.out.println(b);

    }
}
