/////////////////////////////////////////////////// //////////////////////////
//
// Title:    Environmental Impact Calculator
//
// Author:   Varsha Gouraram
// Email:    Varshag0105@gmail.com
//
///////////////////////////////////////////////////////////////////////////////
public class WaterUsage {
    //instance fields
    private int timeShowering;
    private int sinkTime;
    private int timeDishes;
    private int numLoadsLaundry; //
    private int totalWaterUsage;

    //Getters
    public int getTimeShowering() {
        return this.timeShowering;
    }

    public int getSinkTime() {
        return this.sinkTime;
    }

    public int getTimeDishes() {
        return this.timeDishes;
    }

    public int getNumLoadsLaundry() {
        return this.numLoadsLaundry;
    }

    public int getTotalWaterUsage() {
        return this.totalWaterUsage;
    }

    //Setters
    public void setTimeShowering(int timeShowering) {
        this.timeShowering = timeShowering;
    }

    public void setSinkTime(int sinkTime) {
        this.sinkTime = sinkTime;
    }

    public void setTimeDishes(int timeDishes) {
        this.timeDishes = timeDishes;
    }

    public void setNumLoadsLaundry(int numLoadsLaundry) {
        this.numLoadsLaundry = numLoadsLaundry;
    }

    //methods
    //calculate water usage showering
    public double waterUseShowering() {
        //2 gallons a minute
        double waterUsage = getTimeShowering() * 2.0;
        return waterUsage;
    }

    //calculate water usage sink time
    public double waterUseSink() {
        //2.5 gallons per minute
        double waterUsage = getSinkTime() * 2.5;
        return waterUsage;

    }

    //calculate water usage dishes
    public double waterUseDishes() {
        //2.5 gallons per minute
        double waterUsage = getTimeDishes() * 2.5;
        return waterUsage;
    }

    //calculate water usage laundry
    public double waterUseLaundry() {
        //15 gallons a load
        double waterUsage = getNumLoadsLaundry() * 15.0;
        return waterUsage;
    }

    //total gallons used
    public double calcTotalGallonsUsed() {
        return waterUseShowering() + waterUseSink() + waterUseDishes() + waterUseLaundry();
    }
}
