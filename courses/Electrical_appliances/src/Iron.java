/**
 * Created by Karina on 09.07.2016.
 */
public class Iron extends ElectricalAppliance {
    private int heat;//degrees
    private boolean containsWater;

    public Iron(int power, int weight) {
        super(power, weight);
        ElectricalNetworkUtils.getAllAppliances().add(this);
    }

    public void steam(){
        if (this.containsWater)
            System.out.println("Steaming..");
        else System.out.println("I need water to steam");
    }

    public void addWater(){
        this.containsWater = true;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }


    @Override
    public String toString() {
        return "Iron{" +
                "power="+getPower()+
                ",weight=" + getWeight()+
                ",heat=" + heat +
                ", containsWater=" + containsWater +
                '}';
    }
}
