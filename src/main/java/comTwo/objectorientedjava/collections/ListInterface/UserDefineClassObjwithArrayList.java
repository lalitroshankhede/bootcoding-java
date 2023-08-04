package comTwo.objectorientedjava.collections.ListInterface;

import comTwo.objectorientedjava.encapsulationEx.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefineClassObjwithArrayList {

    int roll;
    String name;
    int age;

    UserDefineClassObjwithArrayList(int roll,String name,int age)
    {
        this.roll=roll;
        this.name=name;
        this.age=age;
    }


    public static void main(String[] args) {

        //Creating object for Student

        UserDefineClassObjwithArrayList obj1=new UserDefineClassObjwithArrayList(101,"ABC",23);
        UserDefineClassObjwithArrayList obj2=new UserDefineClassObjwithArrayList(102,"PQR",45);
        UserDefineClassObjwithArrayList obj3=new UserDefineClassObjwithArrayList(103,"XYZ",26);


        //creating ArrayList
        ArrayList<UserDefineClassObjwithArrayList> list=new ArrayList<UserDefineClassObjwithArrayList>();

        list.add(obj1);
        list.add(obj2);
        list.add(obj3);


        Iterator iterator= list.iterator();
        while (iterator.hasNext())
        {
           UserDefineClassObjwithArrayList str= (UserDefineClassObjwithArrayList) iterator.next();
            System.out.println("Roll "+str.roll+" "+"Name "+str.name+" "+"Age "+str.age);
        }

    }
}
