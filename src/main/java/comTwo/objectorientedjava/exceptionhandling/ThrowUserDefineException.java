package comTwo.objectorientedjava.exceptionhandling;

public class ThrowUserDefineException extends Exception {

    public ThrowUserDefineException(String str)
    {
        super(str);
    }

}

class TestThrow
{

    public static void main(String[] args) {

        try

        {
            throw new ThrowUserDefineException("This is User Define Exception");

        }
        catch (ThrowUserDefineException e)
        {
            System.out.println("Caught the Exception");

            System.out.println(e.getMessage());
        }

    }
}