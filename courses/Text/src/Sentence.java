import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karina on 08.07.2016.
 */


public class Sentence {

         List <Word> sentence = new ArrayList<>();

    public Sentence(String string) {
        String[] sent = string.split(" ");
        for (String s : sent) {
            Word word = new Word(s);
            sentence.add(word);
        }
    }


    public void outputStructured(){
        for (Word word : sentence) {
            System.out.println(word.getWord());
        }
    }

    public void output(){
        for (Word word : sentence) {
            System.out.print(word.getWord()+" ");
        }
    }


}
