package comTwo.objectorientedjava.exceptionhandling;

public class ExceptionPropgationEx {

    void m()
    {
        int a=50/0;
    }
    void n()
    {
        m();
    }

    void  p()
    {
        try

        {
            n();
        }

        catch (Exception e)
        {
            System.out.println("Exception Handled");
        }
        System.out.println("Rest of Code Excecuted");
    }

    public static void main(String[] args) {

        ExceptionPropgationEx obj=new ExceptionPropgationEx();
        obj.p();
    }
}
