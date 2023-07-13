package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.AggregationEx;

public class Emp {

    int empId;
    String empName;
    Address address;  // variable of Address class


    public Emp(int empId,String empName,Address address)
    {
        this.empId=empId;
        this.empName=empName;
        this.address=address;
    }

    public void display()
    {
        System.out.println("Id "+empId+" "+"Name "+empName);
        System.out.println("City "+address.city+" "+"State "+address.state+" "+"Country "+address.country);
    }
}
