package comTwo.objectorientedjava.encapsulationEx;

public class WriteOnlyMain {
    public static void main(String[] args) {

        WriteOnlyEx obj=new WriteOnlyEx();
        obj.setAge(24);

        //System.out.println(obj.age);  // gives compile time error because age is private data member of WriteOnly class it can't be access
                                      // by outside class
    }
}
