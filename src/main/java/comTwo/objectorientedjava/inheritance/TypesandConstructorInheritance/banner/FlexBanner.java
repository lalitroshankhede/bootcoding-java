package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.banner;

public class FlexBanner extends Banner{

    double price;
    
    
    FlexBanner(){
        System.out.println("FlexBanner object is created");
    }

    public void print2(){
        System.out.println("Before - ");
        super.print(); //0 
        super.price = this.price;   // assign value from FlexBanner to Banner 
        System.out.println("After - ");
        super.print();   // 100 
    }
}
