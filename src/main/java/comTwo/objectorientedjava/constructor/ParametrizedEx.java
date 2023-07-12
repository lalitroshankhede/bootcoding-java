package comTwo.objectorientedjava.constructor;

public class ParametrizedEx {

    int pid;
    String pname;
    ParametrizedEx(int p,String n)
    {
        pid=p;
        pname=n;
    }
    public void dispValue()
    {
        System.out.println("Person Id= "+pid+" "+"Person Name= "+pname);
    }
    public static void main(String[] args) {
         ParametrizedEx obj=new ParametrizedEx(101,"Rahul");
         obj.dispValue();
    }
}
