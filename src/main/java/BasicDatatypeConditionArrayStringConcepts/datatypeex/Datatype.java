package BasicDatatypeConditionArrayStringConcepts.datatypeex;

import java.util.*;


class A
{
    private  void msg()
    {
        System.out.println("Hello");
    }
    private void getInfo()
    {
        System.out.println("Get Info Method");
    }

}

public class Datatype extends A
{
    void  msg()
    {
        System.out.println("Hello Datatype class");
    }

    public static void main(String[] args) {

        Datatype obj=new Datatype();

        obj.msg();
    }
}