/**
 * Created by Karina on 08.07.2016.
 */
public class PlanetRunner {
    public static void main(String[] args) {
        Continent asia = new Continent("Asia", 43400000, 420000000, "Shanghai");
        Continent europe = new Continent("Europe", 3930000, 738199000, "Moscow");
        Continent africa = new Continent("Africa", 30370000, 1022234000, "Lagos");
        Continent antarctica = new Continent("Antarctica", 13720000, 4490, "McMurdo Station");
        Continent australia = new Continent("Australia", 3478200, 29127000, "Sydney");
        Continent nAmerika = new Continent("North America", 9460000, 542056000, "Mexico City");
        Continent sAmerika = new Continent("South America", 6890000, 392555000, "São Paulo");
        Planet earth = new Planet("Earth");
        earth.addContinent(asia);
        earth.addContinent(europe);
        earth.addContinent(africa);
        earth.addContinent(antarctica);
        earth.addContinent(australia);
        earth.addContinent(nAmerika);
        earth.addContinent(sAmerika);

        Ocean pacific = new Ocean("Pacific",1652500000,34,46);
        earth.addOcean(pacific);

        Island greenland = new Island("Greenland",2166086, 55847);
        earth.addIsland(greenland);


        System.out.println("Planet:" + earth.getName());
        System.out.println("Number of continents:" + earth.getNumberOfContinents());
        System.out.println("Second continent:"+earth.continents.get(1).getName());



    }



}
