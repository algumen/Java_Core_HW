package PracticalExercisesPerSession_3_5_Super_in_constructor;

/**
 * Created by Oleksii on 02.08.2015.
 */
public class Parent extends Grandparent {
    int b;
    Parent (int a, int b){
        super(a);
        this.b=b;
              }
    void show(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

}
