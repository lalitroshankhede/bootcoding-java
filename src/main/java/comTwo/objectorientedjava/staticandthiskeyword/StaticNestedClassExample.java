package comTwo.objectorientedjava.staticandthiskeyword;

public class StaticNestedClassExample {
    private static String str = "GeeksforGeeks";

    static class MyNestedClass {

        // non-static method
        public void disp(){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        StaticNestedClassExample.MyNestedClass obj=new StaticNestedClassExample.MyNestedClass();
        obj.disp();

    }

}
