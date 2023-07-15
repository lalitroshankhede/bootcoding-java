package comTwo.objectorientedjava.abstractclass;

public abstract class AbstractClass {
    // Static variable declaration and definition
    public static int staticVariable = 10;

    // Abstract method (no implementation)
    public  abstract  void abstractMethod();

    // Non-abstract method with implementation
    public void nonAbstractMethod() {
        System.out.println("This is a non-abstract method.");
    }
}

class ConcreteClass extends AbstractClass {
    // Implementation of the abstract method
    public void abstractMethod() {
        System.out.println("This is the implementation of the abstract method.");
    }
}

class AbstractClassExMain {
    public static void main(String[] args) {
        ConcreteClass instance1 = new ConcreteClass();
        ConcreteClass instance2 = new ConcreteClass();

        // Accessing the static variable through instances
        System.out.println(instance1.staticVariable); // Output: 10
        System.out.println(instance2.staticVariable); // Output: 10

        // Modifying the static variable through instances
        instance1.staticVariable = 20;
        System.out.println(instance1.staticVariable); // Output: 20
        System.out.println(instance2.staticVariable); // Output: 20

        // Accessing the static variable through the abstract class
        System.out.println(AbstractClass.staticVariable); // Output: 20
    }
}

