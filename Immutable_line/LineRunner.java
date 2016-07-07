import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karina on 06.07.2016.
 */
public class LineRunner {

    public static Line findLongestLine(List <Line> linesList){
       Line  max = linesList.get(0);
        for(Line line : linesList){
            if(max.findLength() < line.findLength())
                max = line;
        }
        return  max;
    }

    public static double findSum(List <Line> linesList){
        double sum = 0;
        for(Line line : linesList){
            sum+=line.findLength();
        }
        return sum;

    }




    public static void main(String[] args){

        List <Line> linesList = new ArrayList<>();

        linesList.add(new Line(new Point(63,4), new Point (67,5)));
        linesList.add(new Line(new Point(7,6), new Point (-4,15)));
        linesList.add(new Line(new Point(1,8), new Point (84,50)));
        linesList.add(new Line(new Point(-3,14), new Point (11,-15)));
        linesList.add(new Line(new Point(12,5), new Point (4,5)));
        Line longest = findLongestLine(linesList);

        longest.printLine();
        System.out.println("Sum of all lines' length: "+findSum(linesList));

    }

}
