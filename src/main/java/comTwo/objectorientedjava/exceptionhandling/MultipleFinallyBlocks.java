package comTwo.objectorientedjava.exceptionhandling;

public class MultipleFinallyBlocks {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            System.out.println("Inside try block");
        } catch (Exception e) {
            // Code to handle the exception
            System.out.println("Inside catch block");
        } finally {
            // Cleanup code block 1
            System.out.println("Inside first finally block");
            cleanup1();
        }

        try {
            // Another code section that might throw an exception
            System.out.println("Inside second try block");
        } catch (Exception e) {
            // Another code to handle the exception
            System.out.println("Inside second catch block");
        } finally {
            // Cleanup code block 2
            System.out.println("Inside second finally block");
            cleanup2();
        }



        System.out.println("Rest of Program");
    }

    public static void cleanup1() {
        // Cleanup tasks for the first section
        System.out.println("Performing cleanup tasks 1...");
    }

    public static void cleanup2() {
        // Cleanup tasks for the second section
        System.out.println("Performing cleanup tasks 2...");
    }
}
