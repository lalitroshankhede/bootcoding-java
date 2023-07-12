package comTwo.objectorientedjava.staticandthiskeyword;

public class ThisPassAsArgumentinMethod {

    public  void superMethod(ThisPassAsArgumentinMethod obj)
    {
        System.out.println("Super method called");
    }

    public void subMethod()
    {
        superMethod(this);
        System.out.println("Sub Method called");
    }

    public static void main(String[] args) {
        ThisPassAsArgumentinMethod obj=new ThisPassAsArgumentinMethod();
        obj.subMethod();
    }
}
