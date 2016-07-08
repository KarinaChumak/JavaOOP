import java.util.Scanner;

/**
 * Created by Karina on 08.07.2016.
 */
public class TextRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2,s3;
        System.out.println("Enter the heading:");
        s3 = sc.nextLine();
        System.out.println("Enter the text:");
        s1 = sc.nextLine();
        Text text = new Text(s1,s3);
       // text.output();
        text.outputStructured();


        System.out.println("\nAdd new sentence:");
        s2= sc.nextLine();
        text.edit(s2);
        text.outputStructured();
        text.output();


    }
}
//New York
//The City of New York, often called New York City or simply New York, is the most populous city in the United States.
// Located at the southern tip of the State of New York, the city is one of the most populous urban agglomerations in the world.
// Situated on one of the world's largest natural harbors, New York City consists of five boroughs, each of which is a separate county of New York State.
// New York City traces its roots to its 1624 founding as a trading post by colonists of the Dutch Republic and was named New Amsterdam in 1626.