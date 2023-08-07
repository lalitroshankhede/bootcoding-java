package comTwo.objectorientedjava.collections.MapIterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {

    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"Graphs");
        map.put(102,"Orange");
        map.put(103,"Apple");
        map.put(104,"Banana");
        map.put(107,null);
        map.put( null,null);  //it allows null key also
        map.put(105,"Chiku");
        map.put(106,"Apple");
       //  map.put(103,"Papaya");  dones not allowed duplicate key but you have duplicate value
        for (Map.Entry m:map.entrySet())

       {
           System.out.println(m.getKey()+" "+m.getValue());
       }

    }
}
