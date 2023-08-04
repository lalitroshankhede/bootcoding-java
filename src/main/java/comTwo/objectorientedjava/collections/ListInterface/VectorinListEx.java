package comTwo.objectorientedjava.collections.ListInterface;

import java.util.LinkedList;
import java.util.Vector;

public class VectorinListEx {

    public static void main(String[] args) {

        Vector<String> list=new Vector<>();
        System.out.println(list);
        list.add("Table");
        list.add("Chair");
        list.add("Fan");
        list.add("TV");
        list.add("Cooler");

        System.out.println(list);
    }
}
