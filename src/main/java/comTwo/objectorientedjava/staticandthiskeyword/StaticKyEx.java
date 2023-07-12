package comTwo.objectorientedjava.staticandthiskeyword;

public class StaticKyEx {

    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable

    StaticKyEx(int r, String n){
        rollno = r;
        name = n;

    }

    void display (){
        college="BDITS"; // Note: non sstatic method can allow to change the value of static variable
        System.out.println(rollno+" "+name+" "+college);
      }

    public static void main(String[] args) {

        StaticKyEx s1 = new StaticKyEx(111,"Karan");
        StaticKyEx s2 = new StaticKyEx(222,"Aryan");
        college="BGMT";   // Note: static method can allow to change the value of static variable
        s1.display();
        s2.display();
    }

}
