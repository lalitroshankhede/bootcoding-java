package comTwo.objectorientedjava.collections.QueueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueinQueuePriorityEx {

    public static void main(String[] args) {

        PriorityQueue<String> list=new PriorityQueue<String>();
        System.out.println(list);
        list.add("Amit");
        list.add("Vijay");
        // list.add(null);   // gives error becoz priority queur doesn't allow null values
        list.add("Karan");
        list.add("Jai");
        list.add("Rahul");

        System.out.println("Return Head of The Queue : "+list.element());

        System.out.println("Return Head Element and Null If Queue is Empty : "+list.peek());


        System.out.println("*********** Iterating Element **********");

        Iterator iterator=list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("Remove Element From Queue : "+list.remove()); // remove Amit

        System.out.println("Retrive and Remove Element in Queue : "+list.poll());


        System.out.println("*********** Iterating Element **********");

        Iterator iterator2=list.iterator();
        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next());
        }


    }
}
