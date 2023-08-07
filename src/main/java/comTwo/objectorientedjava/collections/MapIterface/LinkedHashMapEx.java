package comTwo.objectorientedjava.collections.MapIterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

    public static void main(String[] args) {


        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(101,"Graphs");
        map.put(102,"Orange");
        map.put(103,"Apple");
        map.put(104,"Banana");
        map.put(107,null);
        map.put(null,null);  //it allows null key also
        map.put(105,"Chiku");
        map.put(106,"Apple");
        //  map.put(103,"Papaya");  dones not allowed duplicate key but you have duplicate value

        map.remove(104);  //remove element bases of key i.e 104 Banana has been removed from the list



        map.replace(102,"Mango");  //replace element


        for (Map.Entry m:map.entrySet())

        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
