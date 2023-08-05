package comTwo.objectorientedjava.collections.SetInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetFromAnotherCollection {

    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Ravi");
        arrayList.add("Vijay");
        arrayList.add("Ajay");

    // To Adding ArrayList into HashSet
        HashSet<String> hashSet=new HashSet<>(arrayList);
        hashSet.add("Gaurav");

        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());   //print the value randomly not insertion order.
        }

    }
}
