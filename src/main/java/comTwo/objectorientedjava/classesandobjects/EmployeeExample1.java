package comTwo.objectorientedjava.classesandobjects;

public class EmployeeExample1 {

    int Salary;
    String name;

    public int getSalary()
    {
        return  Salary;
    }
    public String getName()
    {
        return name;
    }

    public static void main(String[] args) {

        EmployeeExample1 obj=new EmployeeExample1();
        obj.Salary=10000;
        obj.name="Aniket";
        System.out.println(obj.getSalary());
        System.out.println(obj.getName());
    }
}
