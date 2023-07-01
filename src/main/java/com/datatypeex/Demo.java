package com.datatypeex;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {

         ArrayList list=new ArrayList<>();
         list.add(10);
         list.add("Apple");
         list.add(45.675);
         list.add('A');
         list.add(3453545353455.34534543535345);

        Iterator lis=list.iterator();
        while (lis.hasNext())
        {
            System.out.println(lis.next());
        }

    }
}
