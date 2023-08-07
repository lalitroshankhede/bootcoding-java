package comTwo.objectorientedjava.collections.CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableInterfaceEx implements Comparable<ComparableInterfaceEx> {

    int rollno;
    String name;
    int age;

    ComparableInterfaceEx(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }


    @Override
    public int compareTo(ComparableInterfaceEx obj) {

        if (age==obj.age)
        return 0;
        else if (age>obj.age) {

            return 1;
        }
        else
        return -1;
    }


    public static void main(String[] args) {

        ArrayList<ComparableInterfaceEx> list=new ArrayList<>();
        list.add(new ComparableInterfaceEx(101,"Ajay",23));
        list.add(new ComparableInterfaceEx(106,"Vijay",27));
        list.add(new ComparableInterfaceEx(105,"Jai",21));

        Collections.sort(list);

        for (ComparableInterfaceEx obj:list) {

            System.out.println("Student Roll "+obj.rollno+" "+"Student Name "+obj.rollno+" "+"Student Age "+obj.age);
        }




    }


}
