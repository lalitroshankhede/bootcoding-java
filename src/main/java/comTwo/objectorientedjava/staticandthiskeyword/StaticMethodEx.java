package comTwo.objectorientedjava.staticandthiskeyword;

public class StaticMethodEx {

    int rollno;
    String name;
    static String college = "ITS";

    //static method to change the value of static variable
    static void change() {
        college = "BBDIT";
    }

    StaticMethodEx(int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {

        StaticMethodEx.change();

        StaticMethodEx obj1=new StaticMethodEx(111,"Karan");
        StaticMethodEx obj2=new StaticMethodEx(222,"Aryan");
        StaticMethodEx obj3=new StaticMethodEx(333,"Sonoo");

        obj1.display();
        obj2.display();
        obj3.display();
    }

}
