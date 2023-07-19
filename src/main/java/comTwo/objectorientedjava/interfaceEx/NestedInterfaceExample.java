package comTwo.objectorientedjava.interfaceEx;

public interface NestedInterfaceExample {

    void show();
    interface Message{
        void msg();
    }

}

class TestNestedInterface implements  NestedInterfaceExample.Message
{

    @Override
    public void msg() {
        System.out.println("Hello nested interface");
    }

    public static void main(String[] args) {

        NestedInterfaceExample.Message obj=new TestNestedInterface();
        obj.msg();

    }
}
