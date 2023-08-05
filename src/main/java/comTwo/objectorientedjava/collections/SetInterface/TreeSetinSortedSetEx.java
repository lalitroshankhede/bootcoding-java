package comTwo.objectorientedjava.collections.SetInterface;

import java.util.TreeSet;

public class TreeSetinSortedSetEx {

    public static void main(String[] args) {



            TreeSet<String> list = new TreeSet<String>() ;
            System.out.println(list);
            list.add("Apple");
            list.add("Mango");
          //  list.add(null);       //  it will gives error becoz Tree Set does not allowed null values
            list.add("Banana");
            list.add("Mango");         //no gives error but duplicate value find and except those values
            list.add("Graphs");

            System.out.println(list);  // to print ascending order



    }
}
