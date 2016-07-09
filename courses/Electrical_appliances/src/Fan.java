/**
 * Created by Karina on 09.07.2016.
 */
public class Fan extends ElectricalAppliance {
    private int mode;
    private boolean isRotating;

    public Fan(int power, int weight) {
        super(power, weight);
        ElectricalNetworkUtils.getAllAppliances().add(this);
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public void rotateOff(){
        this.isRotating=false;
    }
    public void rotateOn(){
        this.isRotating=true;
    }

    public int getMode() {
        return mode;
    }

    public boolean isRotating() {
        return isRotating;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "power="+getPower()+
                ",weight=" + getWeight()+
                ",mode=" + mode +
                ", isRotating=" + isRotating +
                '}';
    }
}
