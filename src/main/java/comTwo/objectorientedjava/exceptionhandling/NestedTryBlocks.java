package comTwo.objectorientedjava.exceptionhandling;

public class NestedTryBlocks {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] arr = {1, 2, 3};
            try {
                // Inner try block
                int result = divide(10, 0);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner ArithmeticException caught: " + e.getMessage());
            }
            System.out.println("Array element at index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }


        System.out.println("Rest of Program");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
