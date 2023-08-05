package comTwo.objectorientedjava.collections.SetInterface;

import java.util.TreeSet;

public class TreeSetAnotherOperationEx {

    public static void main(String[] args) {


        TreeSet<Integer> list=new TreeSet<Integer>();


        list.add(20);
        list.add(65);
        list.add(95);
        list.add(10);
        list.add(75);
        list.add(35);

        System.out.println("************ Original TreeSet ********* ");

        System.out.println(list);

        //Remove Highest and Lowest Value in Treeset

        System.out.println("Highest Value : "+list.pollLast() );
        System.out.println("Loweset Value : "+ list.pollFirst());

        System.out.println("********* Remanining List ");
        System.out.println(list);
    }
}
