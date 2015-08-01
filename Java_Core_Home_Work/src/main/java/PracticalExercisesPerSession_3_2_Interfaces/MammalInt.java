package PracticalExercisesPerSession_3_2_Interfaces;

/**
 * Created by Oleksii on 01.08.2015.
 */
public class MammalInt implements Animal {

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void trevel() {
        System.out.println("Mammal travels");
    }

    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.trevel();
    }


}
