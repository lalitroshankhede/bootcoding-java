package comTwo.objectorientedjava.collections.CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingElementinReverseOrder {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Chiku");
        list.add("Orange");
        list.add("Banana");
        list.add("Graphs");

        Collections.sort(list,Collections.reverseOrder());

        Iterator iterator=list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
