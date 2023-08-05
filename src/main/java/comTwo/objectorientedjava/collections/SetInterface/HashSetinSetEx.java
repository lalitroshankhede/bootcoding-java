package comTwo.objectorientedjava.collections.SetInterface;

import java.util.Collections;
import java.util.HashSet;

public class HashSetinSetEx {

    public static void main(String[] args) {

        HashSet<String> list=new HashSet<String>();
        System.out.println(list);
        list.add("Apple");
        list.add("Mango");
        list.add(null);  //null value postition at first element in set
        list.add("Banana");
        list.add("Mango");         //no gives error but duplicate value find and except those values
        list.add("Graphs");
        list.add(null);  //if you try to add more than one null value it will print only one null becoz he accept only one value in Set
        System.out.println(list);    //to print unordered  list means randomly


        //To remove element from Hashset
        list.remove("Mango");


        System.out.println(list);
     }
}
