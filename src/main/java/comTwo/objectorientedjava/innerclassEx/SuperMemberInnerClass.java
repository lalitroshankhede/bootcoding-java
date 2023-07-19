package comTwo.objectorientedjava.innerclassEx;


public class SuperMemberInnerClass {

    private int data=100;

    class SubMember
    {
        void  msg()
        {
            System.out.println("Data "+data);
        }
    }

    public static void main(String[] args) {
        SuperMemberInnerClass obj1=new SuperMemberInnerClass();

        SuperMemberInnerClass.SubMember obj2=obj1.new SubMember();  //to create new object of SubMember through Parent object reference

          obj2.msg();
    }

}
