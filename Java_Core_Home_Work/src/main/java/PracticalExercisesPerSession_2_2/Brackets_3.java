package PracticalExercisesPerSession_2_2;

/**
 * Created by eua00082 on 15.06.2015.
 */
public class Brackets_3 {

    public static void main(String[] args) {
        String[] a = new String[]{"uno", "dua", "tres"};

        addAngleBrackets(a);
        for (String i : a) {
            System.out.println(i);
        }
    }

    public static void addAngleBrackets(String[] a) {
        int j=0;
        for (String i : a) {
            a[j] = "<" + i + ">";
            j+=1;
        }
    }
}
