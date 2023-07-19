package comTwo.objectorientedjava.innerclassEx;

public class StaticNestedClassEx {

    static int data=30;

    static class  Inner
    {
        void msg(){System.out.println("data is "+data);}
    }

    public static void main(String[] args) {
        StaticNestedClassEx.Inner obj=new StaticNestedClassEx.Inner();
        obj.msg();

    }
}
