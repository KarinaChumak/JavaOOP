import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karina on 08.07.2016.
 */
public class Planet
{
    String name;
    List<Continent> continents= new ArrayList<>();
    List<Ocean> oceans = new ArrayList<>();
    List<Island>islands = new ArrayList<>();

    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getNumberOfContinents(){
        return continents.size();
    }
    public void addContinent(Continent cont){
        continents.add(cont);
    }
    public void addOcean(Ocean ocean){
        oceans.add(ocean);
    }
    public void addIsland(Island island){
        islands.add(island);
    }


    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", continents=" + continents +
                ", oceans=" + oceans +
                ", islands=" + islands +
                '}';
    }
}
