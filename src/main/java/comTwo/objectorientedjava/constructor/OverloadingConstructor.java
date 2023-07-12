package comTwo.objectorientedjava.constructor;

public class OverloadingConstructor {

    int pid;
    String pname;
    int age;
    OverloadingConstructor()
    {
        pid=111;
        pname="Ravi";
    }
    OverloadingConstructor(int p,String n)
    {
        pid=p;
        pname=n;
    }

    OverloadingConstructor(int num,String name,int a)
    {
        pid=num;
        pname=name;
        age=a;
    }


    public void display()
    {
        System.out.println("Person Id = "+pid+" "+"Person Name= "+pname+" "+"Person Age= "+age);
    }
    public static void main(String[] args) {

        OverloadingConstructor obj1=new OverloadingConstructor();
        OverloadingConstructor obj2=new OverloadingConstructor(1001,"Rahul");
        OverloadingConstructor obj3=new OverloadingConstructor(1002,"Ashwin",40);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
