package comTwo.objectorientedjava.collections.ListInterface;

import java.util.LinkedList;

public class LinkedListinListEx {

    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<String>();
        System.out.println(list);
        list.add("Car");
        list.add("Bike");
        list.add("Truck");
        list.add("Bus");
        list.add("Bike");  //duplicate value
        list.add("Train");
        list.add(null);   //null value
        list.add("Airplane");
        System.out.println(list);
    }
}
