import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karina on 08.07.2016.
 */
public class Text {
   private String heading;
   private List <Sentence> text = new ArrayList<>();

//constructor
    public Text(String string, String heading) {
        this.heading=heading;
        formText(string);
    }

//Getters and setters
    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

//methods
    private void formText(String string) {
        String[] t = string.split("\\.");
        for (String s : t) {
            Sentence sentence = new Sentence(s);
            text.add(sentence);
        }
    }
//to see the structure of text as array of sentences, which are implemented as array of words
    public void outputStructured(){
        for (Sentence sentence : text) {
            sentence.outputStructured();
            System.out.println("-------Next sentence-------");
        }
    }

    public void output(){
        for (Sentence sentence : text) {
            sentence.output();
            System.out.print(".");

        }
    }


    public void edit(String string){
        formText(string);
    }

}
