/**
 * Created by Karina on 07.07.2016.
 */
public class Dog  extends Animal {
    private String breed;
    private String name;

    public Dog(int age, String habitat, boolean isWild, String gender, String breed, String name) {
        super(age, habitat, isWild, gender);
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }


    public void bark(){
        System.out.println("Woof-woof!");
    }


    public void bite(){
        System.out.println("-Rrrr.. - Ouch!");
    }

    public void run(){
        System.out.println("Dog is running");
    }

    public void jump(){
        System.out.println("Dog is jumping");
    }






}
