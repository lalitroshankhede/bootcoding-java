package com.stringex;

public class toStringMethodExample {

    int roll;
    String name;

    public toStringMethodExample(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {    // override toString method compiler calls internally
        return "toStringMethodExample{" +        //to return value of the object of obj1 and obj2
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

     toStringMethodExample obj1=new toStringMethodExample(101,"ABC"); // compiler writes here obj1.toString()
     toStringMethodExample obj2=new toStringMethodExample(102,"XYZ"); // compiler writes here obj2.toString()
        System.out.println(obj1);                                               // i.e obj1.roll and obj1.name
        System.out.println(obj2);


    }
}
