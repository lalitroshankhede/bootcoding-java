package comTwo.objectorientedjava.collections.ListInterface;

import java.util.ArrayList;

public class GettingandSettingArrayListElementEx {


    public static void main(String[] args) {

        ArrayList<String> list =new ArrayList<String>();
        System.out.println(list);
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");         //duplicate value
        list.add("Graphs");
        list.add(null);   //null value

        System.out.println("Getting Element "+list.get(1)); // return mango because Array Start from 0.

        list.set(1,"Orange");  //set value at 1st index position

        System.out.println(list);


    }
}
