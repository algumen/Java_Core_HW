package PracticalExercisesPerSession_2_1;

/**
 * Created by eua00082 on 15.06.2015.
 */
public class SwitchGrade {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 2;

        System.out.println(meanOf3(a, b, c));
        switch (meanOf3(a, b, c)) {
            case 1:
                System.out.println("Fail");
                break;
            case 2:
                System.out.println("Fail");
                break;
            case 3:
                System.out.println("Fail");
                break;
            case 4:
                System.out.println("Fail");
                break;
            case 5:
                System.out.println("Basic");
                break;
            case 6:
                System.out.println("Basic");
                break;
            case 7:
                System.out.println("Standard");
                break;
            case 8:
                System.out.println("Standard");
                break;
            case 9:
                System.out.println("Standard");
                break;
            case 10:
                System.out.println("Excellent");
                break;
        }
    }

    public static int meanOf3(int a, int b, int c) {
        int mean = (a + b + c) / 3;
        return mean;
    }

}