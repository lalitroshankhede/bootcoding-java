package comTwo.objectorientedjava.abstractclass;

public abstract  class SuperClass {

    public final void finalMethod() {
        System.out.println("This is final method");
    }

    public abstract void abstractMethod();

}

class SubClass extends SuperClass
{

    @Override
    public void abstractMethod() {
        System.out.println("This is Superclass method which has to be inherited by the subclass");
    }
}

class SuperSubMain{
    public static void main(String[] args) {

        SubClass obj=new SubClass();
        obj.abstractMethod();
        obj.finalMethod();
    }
}