package comTwo.objectorientedjava.collections.SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetInHashSetEx {

    public static void main(String[] args) {

        LinkedHashSet<String> list =new LinkedHashSet<String>();
        System.out.println(list);
        list.add("Apple");
        list.add("Mango");
        list.add(null);
        list.add("Banana");
        list.add("Mango");         //no gives error but duplicate value find and except those values
        list.add("Graphs");
        list.add(null);  //if you try to add more than one null value it will print only one null becoz he accept only one value in Set
        System.out.println(list);    //to print  insertion list means same as Insertion Input values


        //remove element from LinkedHashSet

        list.remove("Banana");

        System.out.println(list);

    }
}
