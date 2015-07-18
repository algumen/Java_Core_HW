package PracticalExercisesPerSession_2_1;

/**
 * Created by eua00082 on 15.06.2015.
 */
public class MaxOf_3 {

    public static void main(String[] args) {
        int a = 35;
        int b = 0;
        int c = -10;


        System.out.println(maxOf3(a, b, c));

    }

    public static int maxOf3(int a, int b, int c) {
        int max;
        if (a > b) max = a;
        else max = b;
        if (max < c) max = c;
        return max;
    }

}
