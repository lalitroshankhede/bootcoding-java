package comTwo.objectorientedjava.collections.ListInterface;

import java.util.LinkedList;

public class AddListinAnotherListinLinkedListEx {

    public static void main(String[] args) {

        LinkedList<String> collection1=new LinkedList<String>();
        collection1.add("Apple");
        collection1.add("Mango");
        collection1.add("Banana");
        collection1.add("Mango");         //duplicate value
        collection1.add("Graphs");

        collection1.add(1,"Berry"); // add value with specified position in ArrayList


        System.out.println(collection1);

        //Create Collection 2
        LinkedList<Integer> collection2=new LinkedList<Integer>();
        collection2.add(34);
        collection2.add(23);
        collection2.add(67);
        collection2.add(12);

        System.out.println(collection2);

        collection1.add(String.valueOf(collection2));  // adding collection 2 into collection 1
        //consider Integer as String with using valueOf () method

        System.out.println(collection1);

        collection1.removeFirst();
        collection1.remove("Mango");      //remove specific element from List
        collection1.removeLast();
        System.out.println(collection1);

        collection1.removeAll(collection2);         // to remove complete collection 2 from collection 1

        System.out.println(collection1);


        System.out.println("Check Collection 1 is Empty :" +collection1.isEmpty());  // to check list is Empty or Not
        // if list is empty return true otherwise false.

        System.out.println("The Size of List Collection 1 is: "+collection1.size()+"\n"+"The Size of List Collection 2 is : "+collection2.size());
    }
}
