package comTwo.objectorientedjava.staticandthiskeyword;

public class ThisWithReuseConstructor {

    int rollno;
    String name,course;
    float fee;

    ThisWithReuseConstructor(int rollno,String name,String course)
    {
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }

    ThisWithReuseConstructor(int rollno,String name,String course,float fee)
    {
        this(rollno, name, course);
        this.fee=fee;
    }

    public void dispValue()
    {
        System.out.println("Roll No"+rollno+"Name"+name+"Course"+course+"Fee"+fee);
    }

    public static void main(String[] args) {

        ThisWithReuseConstructor obj=new ThisWithReuseConstructor(101,"Ankit","Java");
        ThisWithReuseConstructor obj2=new ThisWithReuseConstructor(102,"Nakul","Python",40000);
               obj.dispValue();
               obj2.dispValue();
    }
}
