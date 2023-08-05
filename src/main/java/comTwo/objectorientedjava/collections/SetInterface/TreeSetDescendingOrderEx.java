package comTwo.objectorientedjava.collections.SetInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDescendingOrderEx {

    public static void main(String[] args) {

        TreeSet<String> list=new TreeSet<String>();

        System.out.println(list);
        System.out.println(list.isEmpty());

        list.add("Lalit");
        list.add("Aniket");
        list.add("Ujwal");
        list.add("Sourabh");

        // To Print Descending Order Element

        Iterator iterator=list.descendingIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
