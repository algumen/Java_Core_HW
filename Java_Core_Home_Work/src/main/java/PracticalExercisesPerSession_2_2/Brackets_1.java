package PracticalExercisesPerSession_2_2;

/**
 * Created by eua00082 on 15.06.2015.
 */
public class Brackets_1 {

    public static void main(String[] args) {
        String[] a = new String[]{"uno", "dua", "tres"};

        addAngleBrackets(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void addAngleBrackets(String[] a) {

        for (int i = 0; i < a.length; i++)
            a[i] = "<" + a[i] + ">";
    }

}
