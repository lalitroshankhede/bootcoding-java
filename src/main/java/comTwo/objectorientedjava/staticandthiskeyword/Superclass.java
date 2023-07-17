package comTwo.objectorientedjava.staticandthiskeyword;

public class Superclass {
        public static void myMethod() {
            System.out.println("Superclass static method");
        }
    }

    class Subclass extends Superclass {
        public static void myMethod() {
            System.out.println("Subclass static method");
        }
    }

  class Main {
        public static void main(String[] args) {


            Superclass instance = new Subclass();
              instance.myMethod();  // to call Superclass method because static context refer to current class object

            Subclass subclass=new Subclass();
            subclass.myMethod();  // to call Subclass method because static context refer to current class object
            System.out.println("===================================");
            Superclass.myMethod();
            Superclass.myMethod();


        }
    }


