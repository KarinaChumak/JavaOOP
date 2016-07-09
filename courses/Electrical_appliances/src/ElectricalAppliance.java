/**
 * Created by Karina on 09.07.2016.
 */
public class ElectricalAppliance implements Comparable<ElectricalAppliance> {
    private int power;
    private int weight;
    private boolean isTurnedOn;

    public ElectricalAppliance(int power, int weight ) {
        this.power = power;
        this.weight = weight;
        this.isTurnedOn = false;
    }

    public void setTurnedOn(){
        this.isTurnedOn=true;
        ElectricalNetworkUtils.getAppliancesTurnedOn().add(this);
    }
    public void setTurnedOff(){
        this.isTurnedOn=false;
        ElectricalNetworkUtils.getAppliancesTurnedOn().remove(this);
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(ElectricalAppliance o)
    {
        return this.getPower() - o.getPower();
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" +
                "power=" + power +
                ", weight=" + weight +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
}
