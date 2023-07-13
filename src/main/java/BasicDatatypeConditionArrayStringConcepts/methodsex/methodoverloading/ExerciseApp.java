package BasicDatatypeConditionArrayStringConcepts.methodsex.methodoverloading;

public class ExerciseApp {

    public static void main(String[] args) {
        HumanExercise humanExercise=new HumanExercise();
        humanExercise.run(10,20.5,60.7f);
        humanExercise.print();
        humanExercise.run(12.20f,20,60);
        humanExercise.print();


    }

}
