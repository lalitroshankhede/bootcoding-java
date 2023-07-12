package comTwo.objectorientedjava.classesandobjects;

public class InitilizeObjectThroughRef {
    int pid;
    String name;
    public static void main(String[] args) {
        InitilizeObjectThroughRef obj=new InitilizeObjectThroughRef();
        obj.pid=1001;
        obj.name="Aniket";
        System.out.println(obj.pid+" "+obj.name);

    }
}
