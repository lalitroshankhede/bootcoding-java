package comTwo.objectorientedjava.inheritance.TypesandConstructorInheritance.banner;


public class BannerApp {
    public static void main(String[] args) {
        FlexBanner fb = new FlexBanner();
        fb.type = "Flex Banner";
        fb.matter = "New Java batches are going to start!";
       
        
        fb.create(); 
        fb.price = 100;
        fb.print2();
        
        
        // Constructor Chaining
        // Can you inherit Constructor - No
        //
    }
}
