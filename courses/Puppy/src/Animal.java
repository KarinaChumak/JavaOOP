/**
 * Created by Karina on 07.07.2016.
 */
public class Animal {
    private int age;
    private String habitat;
    private boolean isWild;
   private String gender;

    public Animal(int age, String habitat, boolean isWild, String gender) {
        this.age = age;
        this.habitat = habitat;
        this.isWild = isWild;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getHabitat() {
        return habitat;
    }

    public boolean isWild() {
        return isWild;
    }

    public String getGender() {
        return gender;
    }


    public void move(){
        System.out.println("Moving...");
    }


    public void sleep(){
        System.out.println("Sleeping..zzz");
    }

    public void eat(){
        System.out.println("Eating...");
    }



}
