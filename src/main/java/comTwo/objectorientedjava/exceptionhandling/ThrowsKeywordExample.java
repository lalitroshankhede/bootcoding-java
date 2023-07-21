package comTwo.objectorientedjava.exceptionhandling;

import java.io.IOException;

public class ThrowsKeywordExample {
    // Method that throws a checked exception
    public static void methodWithCheckedException() throws IOException {
        // Simulate a situation where an IOException might occur
        throw new IOException("This is a checked IOException.");
    }

    // Method that throws an unchecked exception
    public static void methodWithUncheckedException() {
        // Simulate a situation where an ArithmeticException might occur
        throw new ArithmeticException("This is an unchecked ArithmeticException.");
    }

    public static void main(String[] args) {
        try {
            methodWithCheckedException();
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        methodWithUncheckedException();
    }

}
