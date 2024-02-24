/////////////////////////////////////////////////// //////////////////////////
//
// Title:    Environmental Impact Calculator
//
// Author:   Varsha Gouraram
// Email:    Varshag0105@gmail.com
//
///////////////////////////////////////////////////////////////////////////////
public class ElectricityUsage {

    //instance fields
    private int timeTv;
    private int lightUsage;
    private int numDevicesCharged;
    private int fanUsage;
    private boolean useSolarPanels;

    //Getters
    public int getTimeTv() {
        return this.timeTv;
    }

    public int getLightUsage() {
        return this.lightUsage;
    }

    public int getNumDevicesCharged() {
        return this.numDevicesCharged;
    }

    public int getFanUsage() {
        return this.fanUsage;
    }

    public boolean getUseSolarPanels() {
        return this.useSolarPanels;
    }

    //Setters
    public void setTimeTv(int timeTv) {
        this.timeTv = timeTv;
    }

    public void setLightUsage(int timeLightUse) {
        this.lightUsage = timeLightUse;
    }

    public void setNumDevicesCharged(int numDevicesCharged) {
        this.numDevicesCharged = numDevicesCharged;
    }

    public void setFanUsage(int fanUsage) {
        this.fanUsage = fanUsage;
    }

    public void setUseSolarPanels(boolean useSolarPanels) {
        this.useSolarPanels = useSolarPanels;
    }

    //Methods

    //Calculate electricity usage from TV
    public int elecUseTv() {
        //2 watts per minute
        int elecUsage = getTimeTv() * 2;
        return elecUsage;
    }

    //Calculate electricity usage from light
    public int elecUseLight() {
        //40 lightbulbs
        final int LIGHTBULBS = 40;
        //10 watts a minute
        int elecUsage = getLightUsage() * LIGHTBULBS * 10;
        return elecUsage;
    }

    //Calculate electricity usage from charging devices
    public int elecUseCharging() {
        //5 watts per
        int elecUse = getNumDevicesCharged() * 5;
        return elecUse;
    }

    //Calculate electricity usage from a ceiling fan
    public double elecUseFan() {
        //0.3 watts a minute
        double elecUse = getFanUsage() * 0.3;
        return elecUse;
    }

    //Calculate the energy retained from solar energy
    public int solarEnergy() {
        int solarEnergy = 0;
        if (getUseSolarPanels()) {
            solarEnergy = 300;
        }
        return solarEnergy;
    }

    //calculate total energy usage
    public double totalElectricityUsage() {
        double electricityUsage = elecUseTv() + elecUseLight() + elecUseCharging() + elecUseFan() - solarEnergy();
        if (electricityUsage >= 0) {
            return electricityUsage;
        } else {
            electricityUsage = 0;
        }
        return electricityUsage;
    }

}
