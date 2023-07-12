package comTwo.objectorientedjava.staticandthiskeyword;

public class ThisWithCurrentClassMethod {

    public void superMethod()
    {
        System.out.println("This is Super Method");
    }

    public void subMethod()
    {
        this.superMethod();
        System.out.println("Calling subMethod");
    }

    public static void main(String[] args) {
        ThisWithCurrentClassMethod obj=new ThisWithCurrentClassMethod();
        obj.subMethod();
    }
}
