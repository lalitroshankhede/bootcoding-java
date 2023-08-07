package comTwo.objectorientedjava.collections.MapIterface;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
    public static void main(String[] args) {

        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(3,"Amit");
        hashtable.put(5,"Suraj");
     //   hashtable.put(3,"Ritik");    //to replace first value automatically
        hashtable.put(1,"Pratik");
       //  hashtable.put(4,"Chandan");   //does not allow duplicate key
        hashtable.put(4,"Ujwal");
        hashtable.put(6,"Pratik");  //it contains duplicate value also.
        hashtable.put(2,"Karan");
      //  hashtable.put(7,null);   //it does not allow null value


        for (Map.Entry map:hashtable.entrySet())
        {
            System.out.println(map.getKey()+" "+map.getValue());
        }


    }
}
