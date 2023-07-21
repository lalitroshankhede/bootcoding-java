package comTwo.objectorientedjava.exceptionhandling;

// CustomException.java
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
// Example.java
 class Example {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (CustomException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int divideNumbers(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
