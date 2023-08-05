package comTwo.objectorientedjava.collections.SetInterface;

import java.util.TreeSet;

public class DemoTree {

    public static void main(String[] args) {

        TreeSet<Integer> collection1=new TreeSet<Integer>();

        collection1.add(20);
        collection1.add(65);
        collection1.add(95);
        collection1.add(10);
        collection1.add(75);
        collection1.add(35);

        System.out.println("***************** Original List of Collection 1 *************");
        System.out.println(collection1);

        //To Remove element from Treeset
        System.out.println(collection1.remove(10));




        TreeSet<Integer> collection2=new TreeSet<Integer>();

        collection1.add(10);   //to adding value collection1 in collection 2


        collection2.add(24);
        collection2.add(65);
        collection2.add(25);
        collection2.add(90);
        collection2.add(45);
        collection2.add(55);


        System.out.println("************* Original List of Collection 2 *******************");
        System.out.println(collection2);

      collection1.addAll(collection2);    //adding collection 2 into collection 1

        System.out.println(collection1);


    }
    
    
    
}
