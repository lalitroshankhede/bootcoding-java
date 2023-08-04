package comTwo.objectorientedjava.collections.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class CovertListintoArrayEx {

    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<String>();
        System.out.println(list);
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");
        list.add("Graphs");


        //Converting List into Array

            String arr[]=list.toArray(new String[list.size()]);
        System.out.println("Printing Arrays "+ Arrays.toString(arr));
    }

}
