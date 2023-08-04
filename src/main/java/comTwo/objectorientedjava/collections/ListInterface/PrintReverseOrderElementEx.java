package comTwo.objectorientedjava.collections.ListInterface;

import java.util.ArrayList;
import java.util.ListIterator;

public class PrintReverseOrderElementEx {

    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<String>();
        System.out.println(list);
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");         //duplicate value
        list.add("Graphs");


        ListIterator<String> listIterator=list.listIterator(list.size());
        while (listIterator.hasPrevious())   // to execute loop in reverse direction
        {
            String str=listIterator.previous();   //to store reverse element in String
            System.out.println(str);        //print reverse ArrayList elements.
        }

    }

}
