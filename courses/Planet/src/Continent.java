/**
 * Created by Karina on 08.07.2016.
 */
public class Continent {
    private String name;
   private long area;
   private long population;
   private String city;//most populous city

    public Continent(String name, long area, long population, String city) {
        this.name = name;
        this.area = area;
        this.population = population;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public long getArea() {
        return area;
    }

    public long getPopulation() {
        return population;
    }

    public String getCity() {
        return city;
    }
}
