package comTwo.objectorientedjava.interfaceEx;

public class ClassInterfaceExample implements  SuperInterface{

    @Override
    public void print() {
        System.out.println("Value of Parent class is : "+MIN);
        System.out.println("This is Interface method called by implemented class ClassInterfaceExample");
    }

     public void  childMethod()
     {
         System.out.println("This is chlid method");
     }

    public static void main(String[] args) {
        ClassInterfaceExample obj=new ClassInterfaceExample();
        //Anoher way to call interface data member
//       int value = ClassInterfaceExample.MIN;
//        System.out.println(value);  //5

        obj.print();
        obj.childMethod();
        System.out.println("====================================== ");

        SuperInterface superInterface=new ClassInterfaceExample();

        superInterface.print();
        System.out.println(superInterface.MIN);
        //superInterface.childMethod();  // it cannot be called by SuperInterface because he don't have access to call


    }
}
