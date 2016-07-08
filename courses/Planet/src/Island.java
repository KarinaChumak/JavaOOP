/**
 * Created by Karina on 08.07.2016.
 */
public class Island {
    private  String name;
    private  long area;//name of ocean/sea island is surrounded by
    private int population;

    public Island(String name, long area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public long getArea() {
        return area;
    }

    public int getPopulation() {
        return population;
    }
}
