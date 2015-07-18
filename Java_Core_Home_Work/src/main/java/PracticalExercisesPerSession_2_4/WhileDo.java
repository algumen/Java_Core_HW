package PracticalExercisesPerSession_2_4;

/**
 * Created by eua00082 on 15.06.2015.
 */
public class WhileDo {
    public static void main(String[] args) {
        int x = 55;
        addFive(x);
    }

    public static void addFive(int b) {
        int i = 0;
        while (b < 50) {
            b += 5;
            i += 1;
        }
        System.out.println(i);
//        System.out.println(b);
        return;
    }

}
