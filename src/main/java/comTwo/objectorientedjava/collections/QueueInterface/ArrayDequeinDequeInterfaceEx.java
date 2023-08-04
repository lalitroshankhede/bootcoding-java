package comTwo.objectorientedjava.collections.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeinDequeInterfaceEx {

    public static void main(String[] args) {

        Deque<Integer> list=new ArrayDeque<Integer>();

        System.out.println(list);
        list.add(30);
        list.add(50);
        // list.add(null);   // gives error becoz priority queur doesn't allow null values
        list.add(30);
        list.add(0);
        list.add(-40);    // set at last element in queue

        System.out.println(list);
    }
}
