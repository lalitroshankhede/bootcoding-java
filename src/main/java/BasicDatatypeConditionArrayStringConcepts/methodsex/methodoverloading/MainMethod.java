package BasicDatatypeConditionArrayStringConcepts.methodsex.methodoverloading;

public class MainMethod {

    public static void main(String[] args) {


        WristWatch wristWatch = new WristWatch();
        Watch watch = wristWatch;  // object of wristWatch assign to Watch
        WristWatch wristWatch1 = (WristWatch) watch;
        WallWatch wallWatch = new WallWatch();
        Watch watch1 = wallWatch;  //object of wallWatch assign to watch
        WallWatch wallWatch1 = (WallWatch) watch1;

        // WallWatch wallWatch2=wristWatch;    //  trying to assign WristWatch object to WallWatch

        watch.getWatch();
        ((WristWatch) watch).wristWatch();

        System.out.println("===============");

        wristWatch1.getWatch();  //calling
        wristWatch1.wristWatch();

        System.out.println("==============");

        wallWatch.getWatch();
        ;
        wallWatch.wallWatch();

        System.out.println("=============");
        wallWatch1.getWatch();
        wallWatch1.wallWatch();
    }


}
