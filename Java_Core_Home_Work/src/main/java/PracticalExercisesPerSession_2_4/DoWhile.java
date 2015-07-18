package PracticalExercisesPerSession_2_4;

/**
 * Created by eua00082 on 15.06.2015.
 */
public class DoWhile {
    public static void main(String[] args) {
        int x = 3;
        addFive(x);
    }

    public static void addFive(int b) {
        int i = 0;
        do {
            if (b >= 50) break;
            b += 5;
            i += 1;
        }
        while (b < 50);

        System.out.println(i);
//        System.out.println(b);
        return;
    }

}
