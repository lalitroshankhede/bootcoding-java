package comTwo.objectorientedjava.innerclassEx;


public abstract class AnonymousUsingClassEx {

    abstract void eat();
}

class TestAnonymousClassEx
{
    public static void main(String[] args) {

        AnonymousUsingClassEx obj=new AnonymousUsingClassEx() {
            @Override
            void eat() {
                System.out.println("nice fruits");
            }
        };

        obj.eat();

    }
}