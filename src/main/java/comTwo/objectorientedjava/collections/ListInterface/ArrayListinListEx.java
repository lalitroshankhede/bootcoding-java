package comTwo.objectorientedjava.collections.ListInterface;

import java.util.ArrayList;

public class ArrayListinListEx {

    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<String>();
        System.out.println(list);
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");         //duplicate value
        list.add("Graphs");
        list.add(null);   //null value
        System.out.println(list);
    }


}
