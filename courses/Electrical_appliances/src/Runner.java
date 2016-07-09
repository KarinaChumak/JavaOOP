import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Karina on 09.07.2016.
 */
public class Runner {

    public static void main(String[] args) {

        Fan f1 = new Fan(45,3);
        Fan f2 = new Fan(56,4);
            f1.setTurnedOn();
            f1.setMode(4);
            f1.rotateOn();
        Iron i1 = new Iron(2000,1);
        Iron i2 = new Iron(1500,2);
            i2.addWater();
            i2.setTurnedOn();
            i2.setHeat(12);
            i2.steam();
        Microwave m1 = new Microwave(200,11);
        Microwave m2 = new Microwave(300,12);
            m1.setTurnedOn();
            m1.heat();


        System.out.println("Appliances in electrical network:");
        ElectricalNetworkUtils.outputTurnedOn();
        System.out.println("\nSummary power: " + ElectricalNetworkUtils.summaryPower());


        System.out.println("\nAll appliances sorted by power:");
        ElectricalNetworkUtils.sortByPower();
        ElectricalNetworkUtils.outputAll();


        int power=1000;
        int weight = 12;
        System.out.println("\nAppliances with power less than " + power +
                " and weight less than " + weight + ElectricalNetworkUtils.findApplianceByCriterion(power,weight));

    }
}
