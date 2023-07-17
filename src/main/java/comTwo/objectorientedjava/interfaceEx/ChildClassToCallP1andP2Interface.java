package comTwo.objectorientedjava.interfaceEx;


// THIS IS ALSO CALLED AS TO ACHIVE MULTPLE INHERITANCE
public class ChildClassToCallP1andP2Interface implements InterfaceP1,InterfaceP2 {


    @Override
    public void property() {
        System.out.println("To Aqure Parent 1 and Parent 2 Property ");
    }
    public void car()
    {
        System.out.println("Child have own Proprty i.e Car");
    }

    public static void main(String[] args) {
        ChildClassToCallP1andP2Interface obj=new ChildClassToCallP1andP2Interface();
        obj.property();
        obj.car();
    }
}
