package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.AggregationEx;

public class EmpMain {

    public static void main(String[] args) {

        Address address1=new Address("Nagpur","Maharashtra","India");
        Address address2=new Address("Bihar","Uttar Pradesh","India");

        Emp obj1=new Emp(111,"Lalit",address1);
        Emp obj2=new Emp(222,"Kishan",address2);

        obj1.display();
        obj2.display();
    }
}
