package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.banner;

public class Banner {
    String type;
    String matter;
    double price;

    Banner(){
        System.out.println("Banner object is created");
    }

    public void create(){
        System.out.println("Banner is created!");
    }

    public void print(){
        System.out.println("Banner is printed!");
        System.out.println("Price + " + price); 
    }
}
