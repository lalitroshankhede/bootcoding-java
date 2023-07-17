package comTwo.objectorientedjava.interfaceEx;

public class CallingPrintableandShowableInterface implements ShowableInterface{
    @Override
    public void print() {
        System.out.println("method from PrintableInterface");
    }

    @Override
    public void show() {
        System.out.println("method from ShowableInterface");
    }

    public static void main(String[] args) {
        CallingPrintableandShowableInterface obj=new CallingPrintableandShowableInterface();
        obj.print();
        obj.show();

    }
}
