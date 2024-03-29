package comTwo.objectorientedjava.classesandobjects;

public class CloneMethodEx implements Cloneable {

    int roll;
    String name;


    CloneMethodEx(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }


    public Object clone() throws CloneNotSupportedException {   //writing clone method to defining clone method of superclass otherwise
                                                               // gives error
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            CloneMethodEx obj=new CloneMethodEx(1001,"Rajat");

            CloneMethodEx obj2=(CloneMethodEx)obj.clone();   // cloning object from object of CloneMethodEx to anther object

            System.out.println("Roll No="+obj.roll+" "+"Name= "+obj.name);
            System.out.println("Roll No="+obj2.roll+" "+"Name= "+obj2.name);

        }
        catch (CloneNotSupportedException e)
        {

        }
    }
}
