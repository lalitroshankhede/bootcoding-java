package BasicDatatypeConditionArrayStringConcepts.convertingprograms;

public class ConvertHoursDaysandSeconds {

    public static void main(String[] args) {

        int totalSeconds=25300;
        int hours=0;
        int minute=0;
        int seconds=0;

        hours=(totalSeconds/60)/60;
        minute=(totalSeconds/60)%60;
        seconds=(totalSeconds%60);
        System.out.println("Hours :"+hours);
        System.out.println("Minutes :"+minute);
        System.out.println("Seconds :"+seconds);

        System.out.println("H.M.S "+hours+":"+minute+":"+seconds);
    }
}
