package BasicDatatypeConditionArrayStringConcepts.methodsex.recursion;

public class RecursionEx {

    static int factorial(int n)
    {
        if (n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {

        int num=5;
        System.out.println("Factorial of no is :"+factorial(num));
    }
}
