package PracticalExercisesPerSession_2_1;

public class Behaviour2 {

    public static void main(String[] args) {
        int a = 35;
        int b = 12;

        System.out.println(behaviour(a, b));

    }

    public static int behaviour(int a, int b) {
        int beh;
        if (a % 2 == 1 && b % 2 == 1) beh = a + b;
        else beh = a * b;
        return beh;
    }

}