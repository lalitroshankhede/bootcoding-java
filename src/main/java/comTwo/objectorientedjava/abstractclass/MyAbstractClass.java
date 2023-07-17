package comTwo.objectorientedjava.abstractclass;

    public abstract class MyAbstractClass {
        public void myMethod() {
            System.out.println("Abstract class method");
        }
    }

    class MySubclass extends MyAbstractClass {
        @Override
        public void myMethod() {
            super.myMethod();  // Call the method from the superclass
            System.out.println("Subclass method");
        }

        public static void main(String[] args) {

//            MyAbstractClass obj=new MySubclass();
//            obj.myMethod();

            MySubclass obj2=new MySubclass();
            obj2.myMethod();

        }
    }


