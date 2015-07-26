package PracticalExercisesPerSession_2_5;


import java.util.Arrays;

public class ArrayCheck {


    public static void arrayCheck(int[] a, int b) {

        if (a.length <= 3) {
            System.out.println("Length must be greater than 3");
            return;
        }
        if (!(b > 3 && b < 10)) {
            System.out.println("Second parameter must be greater than 3 and less than 10");
            return;
        }
        int[] c = new int[b];

        for (int i = 2; i < b; i++) {
            c[i] = 10;
        }
        Arrays.sort(c);
        for (int i = 0; i < b; i++) {
            System.out.println(c[i]);

        }
        return;

    }
}