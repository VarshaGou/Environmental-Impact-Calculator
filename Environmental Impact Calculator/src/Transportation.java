/////////////////////////////////////////////////// //////////////////////////
//
// Title:    Environmental Impact Calculator
//
// Author:   Varsha Gouraram
// Email:    Varshag0105@gmail.com
//
///////////////////////////////////////////////////////////////////////////////
public class Transportation {
    //instance fields
    private int car; //how many miles user travelled today in a car
    private int bike;
    private int bus;
    private int plane;
    private int walk;
    private int totalDistanceTravelled;
    private boolean isElectric;

    //getters
    public int getCar() {
        return this.car;
    }

    public int getBike() {
        return this.bike;
    }

    public int getBus() {
        return this.bus;
    }

    public int getPlane() {
        return this.plane;
    }

    public int getWalk() {
        return this.walk;
    }

    public int getTotalDistanceTravelled() {
        return this.totalDistanceTravelled;
    }

    public boolean getIsElectric() {
        return this.isElectric;
    }


    //setters
    public void setCar(int distance) {
        this.car += distance;
    }

    public void setBike(int distance) {
        this.bike += distance;
    }

    public void setBus(int distance) {
        this.bus += distance;
    }

    public void setPlane(int distance) {
        this.plane += distance;
    }

    public void setWalk(int distance) {
        this.walk += distance;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    //methods

    //calculate car consumption
    public int carEmissions() {
        //gas cars - 350 grams of CO2 per mile
        //electric cars - 200 grams of C02 per mile
        //https://climate.mit.edu/ask-mit/are-electric-vehicles-definitely-better-climate-gas-powered-cars#:~:text=The%20researchers%20found%20that%2C%20on,vehicle%20created%20just%20200%20grams.
        int gramsCarConsumption = 0;

        if (this.isElectric) {
            gramsCarConsumption = getCar() * 200;
        } else {
            gramsCarConsumption = getCar() * 350;
        }
        return gramsCarConsumption;
    }

    //Calculate bus emissions
    //177 grams per passenger mile.
    public int busEmissions() {
        int busGramsConsumption = 0;
        busGramsConsumption = getBus() * 177;
        return busGramsConsumption;
    }

    //calculate bike consumption
    public int bikeEmissions() {
        int bikeGramsConsumption = 0;
        return bikeGramsConsumption;
    }

    //calculate plane consumption
    public int planeEmissions() {
        //63 grams of CO2 per passenger per mile
        int planeGramsConsumption = 0;
        planeGramsConsumption = getPlane() * 63;
        return planeGramsConsumption;
    }

    //calculate walk consumption
    public int walkEmissions() {
        int walkGramsConsumption = 0;
        return walkGramsConsumption;
    }

    //calculate total transportation consumption
    public int calculateTotalEmissions() {
        int totalTravelEmissions = 0;
        totalTravelEmissions += carEmissions() + bikeEmissions() + planeEmissions() + walkEmissions() + busEmissions();
        return totalTravelEmissions;
    }

}
