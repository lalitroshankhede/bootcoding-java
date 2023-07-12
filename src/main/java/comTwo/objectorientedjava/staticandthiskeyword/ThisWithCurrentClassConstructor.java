package comTwo.objectorientedjava.staticandthiskeyword;

public class ThisWithCurrentClassConstructor {

    ThisWithCurrentClassConstructor()
    {
        System.out.println("This is super Constructor");
    }

    ThisWithCurrentClassConstructor(int x)
    {
        this(); // to calling current class constructor (super constructor)

        System.out.println("Value of X is : "+x);

    }

    public static void main(String[] args) {

        ThisWithCurrentClassConstructor obj=new ThisWithCurrentClassConstructor(100);
    }
}

