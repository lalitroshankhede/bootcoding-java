package comTwo.objectorientedjava.interfaceEx;

public class StaticInterfaceClassEx implements StaticInterfaceEx {


    @Override
    public void draw() {
        System.out.println("Drawing Shapes");
    }

    public static void main(String[] args) {
        StaticInterfaceEx obj=new StaticInterfaceClassEx();
        obj.draw();

        int cubeofResult=StaticInterfaceEx.cube(3);
        System.out.println(cubeofResult);

    }
}
