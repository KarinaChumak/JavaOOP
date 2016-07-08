/**
 * Created by Karina on 08.07.2016.
 */
public class Ocean {
    private  String name;
    private  long area;
    private   int salinity;
    private  int percent;//of all water on the planet

    public Ocean(String name, int area, int salinity, int percent) {
        this.name = name;
        this.area = area;
        this.salinity = salinity;
        this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public long getArea() {
        return area;
    }

    public int getSalinity() {
        return salinity;
    }

    public int getPercent() {
        return percent;
    }
}
