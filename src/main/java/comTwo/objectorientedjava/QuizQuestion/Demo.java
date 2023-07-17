package comTwo.objectorientedjava.QuizQuestion;

public class Demo {

     static final int speed=100;
    public Demo()

    {
        System.out.println("Speed"+speed);
    }



}

class Example extends  Demo
{
      void getValue()
    {
        System.out.println("This is final method you cannot override it but you can inherited ");
    }

}

final class MainMethod   //this is final class you can not inherited or extended with another class
{
    public static void main(String[] args) {
//        Demo demo=new Example();
     // demo.getValue(); //can not call getValue() method because object of Demo class call only whose method that have own class
         Example obj=new Example();
        obj.getValue();
    }
}