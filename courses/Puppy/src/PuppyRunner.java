/**
 * Created by Karina on 07.07.2016.
 */
public class PuppyRunner {


    public static void main(String[] args) {
        Puppy Bailey = new Puppy(1,"Ukraine", false,"male","Terrier","Bailey",100);
        Bailey.sleep();
        Bailey.eat();
        Bailey.bark();
        Bailey.bite();
        Bailey.jump();
        Bailey.run();
        getInfo(Bailey);

    }

    public static void getInfo(Puppy puppy){
        System.out.println("\nAge:" +puppy.getAge()+
                "\nHabitat:"+puppy.getHabitat() +
                "\nWild:" +puppy.isWild()+
                "\nGender"+puppy.getGender()+
                "\nBreed:"+puppy.getBreed()+
                "\nName:" + puppy.getName()+
                "\nCuteness"+puppy.getCuteness());

    }



}
