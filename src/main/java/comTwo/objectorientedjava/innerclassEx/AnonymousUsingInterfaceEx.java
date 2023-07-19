package comTwo.objectorientedjava.innerclassEx;

public interface AnonymousUsingInterfaceEx {
    void eat();
}

class TestAnnonymousInner1
{

    public static void main(String[] args) {
        AnonymousUsingInterfaceEx obj=new AnonymousUsingInterfaceEx() {
            @Override
            public void eat() {
                System.out.println("Tasty Food");
            }
        };
             obj.eat();
    }
}
