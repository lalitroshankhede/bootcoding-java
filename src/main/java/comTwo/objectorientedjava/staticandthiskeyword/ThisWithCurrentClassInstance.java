package comTwo.objectorientedjava.staticandthiskeyword;

import comTwo.objectorientedjava.classesandobjects.ArrayOfObjectExample;

public class ThisWithCurrentClassInstance {

    int rollno;
    String name;
    float fee;

    ThisWithCurrentClassInstance(int rollno,String name, float fee)
    {
        this.rollno= rollno;
        this.name=name;
        this.fee=fee;

    }

    void display(){System.out.println(rollno+" "+name+" "+fee);}

    public static void main(String[] args) {
        ThisWithCurrentClassInstance obj1=new ThisWithCurrentClassInstance(111,"ankit",5000f);
        ThisWithCurrentClassInstance obj2=new ThisWithCurrentClassInstance(112,"sumit",6000f);
        obj1.display();
        obj2.display();

    }


}
