package comTwo.objectorientedjava.collections.CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinNousingCollections {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(65);
        list.add(23);
        list.add(13);
        list.add(599);
        list.add(34);
        list.add(56);

        // Maximum Element
        System.out.println("Maximum element of collection is : "+ Collections.max(list));




        //Minimum Element
        System.out.println("Minimun element of collection is : "+Collections.min(list));
    }
}
