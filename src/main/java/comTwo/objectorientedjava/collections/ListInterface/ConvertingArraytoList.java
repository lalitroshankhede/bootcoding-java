package comTwo.objectorientedjava.collections.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConvertingArraytoList {


    public static void main(String[] args) {

        String arr[]={"Boy","Girl","Adult","Senior Citizen","God"};

        // Converting Array into List

        List<String> list=new ArrayList<String>();

        for (String itr:arr) {

            list.add(itr);
        }
        System.out.println("List is : "+list);
    }


}
