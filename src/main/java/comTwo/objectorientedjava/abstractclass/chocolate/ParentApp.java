package comTwo.objectorientedjava.abstractclass.chocolate;

public class ParentApp {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();
        Child3 ch3 = new Child3();

        ch1.purchase(10);
        ch2.purchase(10);
        ch3.purchase(10);

        System.out.println(ch1.message);
        System.out.println(ch2.message);
        System.out.println(ch3.message);
    }






    public static void print(Parent object){
        object.print();
    }
}
