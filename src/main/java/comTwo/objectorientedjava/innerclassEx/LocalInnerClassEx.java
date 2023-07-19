package comTwo.objectorientedjava.innerclassEx;

public class LocalInnerClassEx {

    private int data =10;

    void msg()
    {
        class LocalClassEx
        {
            void disp()
            {
                System.out.println(data);
            }
        }

        LocalClassEx obj=new LocalClassEx();
        obj.disp();
    }

    public static void main(String[] args) {

        LocalInnerClassEx obj2=new LocalInnerClassEx();
        obj2.msg();
    }
}
