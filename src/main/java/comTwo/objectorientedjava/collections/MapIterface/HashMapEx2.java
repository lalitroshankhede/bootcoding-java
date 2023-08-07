package comTwo.objectorientedjava.collections.MapIterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {

    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"Graphs");
        map.put(102,"Orange");
        map.put(103,"Apple");
        map.put(104,"Banana");
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
