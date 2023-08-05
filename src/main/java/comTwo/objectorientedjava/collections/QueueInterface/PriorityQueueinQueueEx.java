package comTwo.objectorientedjava.collections.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueinQueueEx {

    public static void main(String[] args) {

        // IMP Note : In Queue Operation the Insertion of Element from End of List and Remove element from Beginning of the List.
        PriorityQueue<Integer> list=new PriorityQueue<Integer>();
        System.out.println(list);
        list.add(30);
        list.add(50);
       // list.add(null);   // gives error becoz priority queur doesn't allow null values
        list.add(30);
        list.add(0);
        list.add(-40);  //set at first element in queue


        System.out.println("Head Element is : "+list.element());
        System.out.println("Head : "+list.peek());
        System.out.println(list);

        list.remove();  //it removes first Head element of queue
        System.out.println(list);

        list.poll();  //it is used to retrieve and remove the head of this queue or returns null if queue is empty.
        System.out.println(list);


    }
}
