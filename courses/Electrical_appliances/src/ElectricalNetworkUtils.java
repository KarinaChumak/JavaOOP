import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Karina on 09.07.2016.
 */
public class ElectricalNetworkUtils {
    private static List<ElectricalAppliance> appliancesTurnedOn = new ArrayList<>();
    private static List<ElectricalAppliance> allAppliances = new ArrayList<>();




    public static List<ElectricalAppliance> getAllAppliances() {
        return allAppliances;
    }

    public static List<ElectricalAppliance> getAppliancesTurnedOn() {
        return appliancesTurnedOn;
    }

    public static void outputTurnedOn(){
        for (ElectricalAppliance electricalAppliance : appliancesTurnedOn) {
            System.out.println(electricalAppliance);
        }
    }

    public static void outputAll(){
        for (ElectricalAppliance allAppliance : allAppliances) {
            System.out.println(allAppliance);
        }
    }

    public static void  sortByPower(){
        Collections.sort(allAppliances);
    }


    public static List <ElectricalAppliance> findApplianceByCriterion (int power, int weight){
        List <ElectricalAppliance> result = new ArrayList<>();
        for (ElectricalAppliance appliance : allAppliances) {
            if(appliance.getPower() < power && appliance.getWeight()<weight )
                result.add(appliance);
        }
        return  result;
    }

    public static int summaryPower(){
        int res=0;
        for (ElectricalAppliance electricalAppliance : appliancesTurnedOn) {
            res+=electricalAppliance.getPower();
        }
        return res;
    }
}
