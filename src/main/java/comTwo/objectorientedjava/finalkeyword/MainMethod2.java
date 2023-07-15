package comTwo.objectorientedjava.finalkeyword;



class Superclass {
    public final void finalMethod() {
        System.out.println("Final method without parameters");
    }

    public final void finalMethod(int value) {
        System.out.println("Final method with an int parameter: " + value);
    }
}

class Subclass extends Superclass {
    // This is overloading the final method in the superclass
    public final void finalMethod(String text) {
        System.out.println("Final method with a String parameter: " + text);
    }
}

public class MainMethod2 {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.finalMethod();              // Calls finalMethod() without parameters from the Superclass
        obj.finalMethod(10);            // Calls finalMethod(int value) from the Superclass
        obj.finalMethod("Hello");       // Calls finalMethod(String text) from the Subclass
    }
}


