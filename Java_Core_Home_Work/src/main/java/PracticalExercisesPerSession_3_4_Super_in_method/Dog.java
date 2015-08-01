package PracticalExercisesPerSession_3_4_Super_in_method;

/**
 * Created by Oleksii on 02.08.2015.
 */
public class Dog extends Animal {
    void eat(){
        System.out.println("Dog eats");
    }

    void anothereat(){
        super.eat();
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.anothereat();
    }
}
