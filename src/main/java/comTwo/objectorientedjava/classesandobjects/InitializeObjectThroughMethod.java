package comTwo.objectorientedjava.classesandobjects;

public class InitializeObjectThroughMethod {

    int pid;
    String name;

    public void getData(int p,String n)
    {
        pid=p;
        name=n;
    }
    public void dispInfo()
    {
        System.out.println("Person Id "+pid);
        System.out.println("Person name "+name);
    }

    public static void main(String[] args) {

        InitializeObjectThroughMethod obj=new InitializeObjectThroughMethod();
        obj.getData(10,"Lalit");
        obj.dispInfo();
     }
}
