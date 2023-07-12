package comTwo.objectorientedjava.constructor;

public class DefaultEx {

    int pid;
    String pname;
    DefaultEx()
    {
        pid=1001;
        pname="ABC";
    }
    public void dispValue()
    {
        System.out.println("Person Id= "+pid+" "+"Person Name= "+pname);
    }
    public static void main(String[] args) {
     DefaultEx defaultEx=new DefaultEx();
     defaultEx.dispValue();

    }
}
