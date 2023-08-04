package comTwo.objectorientedjava.collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseElementinLinkedListEx {

    public static void main(String[] args) {

        LinkedList<String> list =new LinkedList<String>();
        System.out.println(list);
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");         //duplicate value
        list.add("Graphs");

        System.out.println(list.contains("Banana")); //returns true because Banana is present in the list
        //Another Way to Reverse Element in LinkedList

        Iterator itr=list.descendingIterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
