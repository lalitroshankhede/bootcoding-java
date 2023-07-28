package comTwo.objectorientedjava.multithreading;

public class GarbageCollectionEx {

    public void finalize()
    {
        System.out.println("Object is garbage Collected");
    }

    public static void main(String[] args) {

        GarbageCollectionEx obj1=new GarbageCollectionEx();
        GarbageCollectionEx obj2=new GarbageCollectionEx();
        obj1=null;
        obj2=null;

        System.gc();

    }
}
