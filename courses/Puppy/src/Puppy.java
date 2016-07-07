/**
 * Created by Karina on 07.07.2016.
 */
public class Puppy extends Dog {
    int cuteness;

    public Puppy(int age, String habitat, boolean isWild, String gender, String breed, String name, int cuteness) {
        super(age, habitat, isWild, gender, breed, name);
        this.cuteness = cuteness;
    }

    public int getCuteness() {
        return cuteness;
    }



    public void bite(){
        System.out.println("How cute!");
    }

    public void run(){
        System.out.println("Puppy is running");
    }

    public void jump(){
        System.out.println("Puppy is jumping");
    }



}
