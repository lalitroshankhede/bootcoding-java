package comTwo.objectorientedjava.collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingIterator {

    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<String>();
        System.out.println(list);
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");         //duplicate value
        list.add("Graphs");
        list.add(null);   //null value


        Iterator<String> str=list.iterator();
        while (str.hasNext())
        {
            System.out.println(str.next());
        }

    }
}
