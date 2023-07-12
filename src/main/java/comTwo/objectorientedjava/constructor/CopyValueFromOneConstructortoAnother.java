package comTwo.objectorientedjava.constructor;

public class CopyValueFromOneConstructortoAnother {

    int pid;
    String pname;

   protected CopyValueFromOneConstructortoAnother(int p,String n)
    {
        pid=p;
        pname=n;


    }

    public CopyValueFromOneConstructortoAnother(CopyValueFromOneConstructortoAnother constVal) {
        pid=constVal.pid;
        pname=constVal.pname;
    }

    public void dispValue()
    {
        System.out.println("Person Id= "+pid+" "+"Person Name= "+pname);
    }

    public static void main(String[] args) {
        CopyValueFromOneConstructortoAnother const1=new CopyValueFromOneConstructortoAnother(1001,"Lalit");
        CopyValueFromOneConstructortoAnother const2=new CopyValueFromOneConstructortoAnother(const1); //

        const1.dispValue();
        const2.dispValue();

    }
}
