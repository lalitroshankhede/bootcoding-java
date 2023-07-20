package comTwo.objectorientedjava.exceptionhandling;

public class MultipleTryBlocks {
    public static void main(String[] args) {
        try {
            // Code in the first try block
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
            // Code in the second try block
            int[] arr = { 1, 2, 3 };
            System.out.println("Array element at index 5: " + arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // Other code in the main method
        System.out.println("End of the program.");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

