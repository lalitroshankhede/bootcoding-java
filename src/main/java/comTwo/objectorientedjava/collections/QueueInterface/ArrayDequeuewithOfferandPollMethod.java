package comTwo.objectorientedjava.collections.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeuewithOfferandPollMethod {

    public static void main(String[] args) {
  //Note : Array Deque to Perform Insertion and Deletion Opration from both ends i.e Front and Rear
        Deque<String> list=new ArrayDeque<String>();

        System.out.println(list);
        list.offer("Arvind");
        list.offer("Vimal");
        // list.add(null);   // gives error becoz priority queur doesn't allow null values
        list.add("Mukul");
        list.add("Jai");
        list.offerFirst("Rahul");    // set at last element in queue

        System.out.println("********* Traverse Elements ********* ");

        for (String ele:list) {

            System.out.println(ele);
        }

        list.poll();  //remove front element from the Queue

        System.out.println("********* Traverse Elements Again ********* ");
        for (String ele:list) {

            System.out.println(ele);
        }

        list.pollLast();  //to remove last element from the Queue

        System.out.println("********* Traverse Elements Again and Again ********* ");
        for (String ele:list) {

            System.out.println(ele);
        }


    }
}
