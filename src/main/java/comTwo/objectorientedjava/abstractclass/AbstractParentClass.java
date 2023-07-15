package comTwo.objectorientedjava.abstractclass;

public abstract class AbstractParentClass {

 public  abstract void parentProperty();

    public void dna()
    {
        System.out.println("DNA of Parent");
    }
}

class Child extends AbstractParentClass
{
    String bike;
    @Override
    public void parentProperty() {
        System.out.println("Aqure Parent Property by Child class ");
        bike="Yamaha";
        System.out.println("Child having also there property like bike "+ bike);
    }

    public void car()
    {
        System.out.println("Child have sport car");
    }
}

class AbstractMain
{
    public static void main(String[] args) {

        AbstractParentClass obj=new Child();
        obj.parentProperty();
        obj.dna();
        // obj.car();   you can't access child property by parent class reference



    }
}