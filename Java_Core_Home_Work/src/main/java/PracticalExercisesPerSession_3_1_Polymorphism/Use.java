package PracticalExercisesPerSession_3_1_Polymorphism;

/**
 * Created by Oleksii on 01.08.2015.
 */
public class Use {
    public static void main (String[] args){
        Animal d = new Dog();
        Animal c = new Cat();
        d.makeNoise();
        c.makeNoise();

    }
}
