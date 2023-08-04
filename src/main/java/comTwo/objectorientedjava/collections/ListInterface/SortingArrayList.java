package comTwo.objectorientedjava.collections.ListInterface;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<String>();
        System.out.println(list);
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");         //duplicate value
        list.add("Graphs");


        System.out.println("************ Original List **********");
        System.out.println(list);

        System.out.println("************ Sorted List *************");

        Collections.sort(list);


        System.out.println(list);

    }
}
