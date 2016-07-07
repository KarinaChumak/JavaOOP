import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karina on 06.07.2016.
 */
public class Line {
    private Point start;
    private Point finish;

    public Line(Point finish, Point start) {
        this.finish = finish;
        this.start = start;
    }

    public Point getStart() {
        return start;
    }

    public Point getFinish() {
        return finish;
    }

    public double findLength(){
        return Math.sqrt(Math.pow(finish.getX() - start.getX(),2)+ Math.pow(finish.getY() - start.getY(),2));
    }

    public void printLine()
    {
        System.out.println("Start:("+start.getX()+","+start.getY()+")\nFinish:("+finish.getX()+","+finish.getY()+")");
        System.out.println("Length:"+findLength());
    }

}
