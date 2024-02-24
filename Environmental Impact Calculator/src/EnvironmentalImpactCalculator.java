/////////////////////////////////////////////////// //////////////////////////
//
// Title:    Environmental Impact Calculator
//
// Author:   Varsha Gouraram
// Email:    Varshag0105@gmail.com
//
///////////////////////////////////////////////////////////////////////////////

import javax.swing.JOptionPane;

public class EnvironmentalImpactCalculator {

    //Calculate total carbon emissions from travel based on user input
    public static int totalTravel(int carDistance, int busDistance, int bikeDistance, int planeDistance, int walkDistance) {
        Transportation user = new Transportation();
        user.setCar(carDistance);
        user.setBus(busDistance);
        user.setBike(bikeDistance);
        user.setPlane(planeDistance);
        user.setWalk(walkDistance);

        return user.calculateTotalEmissions();
    }

    //calculate total water usage in gallons based on user input
    public static double totalWaterUsage(int showerTime, int sinkTime, int dishTime, int numLaundryLoads) {
        WaterUsage user = new WaterUsage();
        user.setTimeShowering(showerTime);
        user.setSinkTime(sinkTime);
        user.setTimeDishes(dishTime);
        user.setNumLoadsLaundry(numLaundryLoads);

        return user.calcTotalGallonsUsed();
    }

    //calculate total electricity usage in watts based on user input
    public static double totalElectricityUsage(int tvTime, int timeLightUsed, int numDevices, int timeFan, boolean solarEnergy) {
        ElectricityUsage user = new ElectricityUsage();
        user.setTimeTv(tvTime);
        user.setLightUsage(timeLightUsed);
        user.setNumDevicesCharged(numDevices);
        user.setFanUsage(timeFan);
        user.setUseSolarPanels(solarEnergy);

        return user.totalElectricityUsage();
    }

    //Method to determine what feedback user needs based on their environmental impact
    // and prints a report back to the user.
    public static String printResults(int totalTravel, double totalWaterUsage, double totalElectricityUsage) {
        String results = "";
        results += "********************************************************************** \n"; //70
        results += "Total CO2 Emissions From Travel: " + totalTravel + " grams\n";
        if (totalTravel < 4970) {
            results += "    Feedback - Good job you are under the average C02 emitted from a person per day! Continue to stay mindful of your carbon footprint when it comes to transportation choices.\n";
        } else {
            results += "    Feedback - You are over the average C02 emissions. Tomorrow please pick a more sustainable travel option (biking, walking, busing).";
        }
        results += "-------------------------------------------------------------------------\n";
        results += "Total Water Usage: " + totalWaterUsage + " gallons\n";
        if (totalWaterUsage <= 26.5) {
            results += "    Feedback - Great job you are practicing sustainable water usage! Continue to stay mindful of the way you consume water.\n";
        } else {
            results += "    Feedback - You are currently using more than a sustainable amount of water.";
        }
        results += "-------------------------------------------------------------------------\n";
        results += "Total Electricity Usage: " + totalElectricityUsage + " watts\n";
        if (totalElectricityUsage <= 1000.0) {
            results += "    Feedback - You are currently using a sustainable amount of energy. Good job!";
        } else {
            results += "    Feedback - You are currently not at a sustainable energy usage. Make sure to apply more sustainable energy practices tomorrow.\n";
        }
        return results;
    }


    public static void main(String[] args) {
        //introduce the program
        JOptionPane.showMessageDialog(null, "Welcome to the environmental impact calculator!", "Environmental Impact Calculator", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "Instructions: \n -Answer the following questions about your day to the best of your ability \n -If the question does not apply to you please enter a 0 \n -Get your total environmental impact from the day \n -Receive some feedback based on your habits to lessen your environmental impact ", "Environmental Impact Calculator", JOptionPane.PLAIN_MESSAGE);


        //Calculate travel emissions
        JOptionPane.showMessageDialog(null, "Part 1. Travel Emissions", "Environmental Impact Calculator", JOptionPane.PLAIN_MESSAGE);


        String carQuestion = JOptionPane.showInputDialog("Enter number of miles travelled today in a car: ");
        int carDistance = Integer.parseInt(carQuestion);

        String busQuestion = JOptionPane.showInputDialog("Enter number of miles travelled today in a bus: ");
        int busDistance = Integer.parseInt(busQuestion);

        String bikeQuestion = JOptionPane.showInputDialog("Enter number of miles travelled today on a bike: ");
        int bikeDistance = Integer.parseInt(bikeQuestion);

        String planeQuestion = JOptionPane.showInputDialog("Enter number of miles travelled today on a plane: ");
        int planeDistance = Integer.parseInt(planeQuestion);

        String walkQuestion = JOptionPane.showInputDialog("Enter number of miles travelled today by walking: ");
        int walkDistance = Integer.parseInt(walkQuestion);

        int totalTravel = totalTravel(carDistance, busDistance, bikeDistance, planeDistance, walkDistance);

        //Calculate water usage
        JOptionPane.showMessageDialog(null, "Part 2. Water Usage", "Environmental Impact Calculator", JOptionPane.PLAIN_MESSAGE);

        String showerQuestion = JOptionPane.showInputDialog("Enter time spent showering today (minutes): ");
        int showerTime = Integer.parseInt(showerQuestion);

        String sinkQuestion = JOptionPane.showInputDialog("Enter time spent using the sink today (minutes): ");
        int sinkTime = Integer.parseInt(showerQuestion);

        String dishQuestion = JOptionPane.showInputDialog("Enter time spent doing the dishes today (minutes): ");
        int dishTime = Integer.parseInt(dishQuestion);

        String laundryQuestion = JOptionPane.showInputDialog("Enter number of laundry loads completed today: ");
        int numLaundryLoads = Integer.parseInt(laundryQuestion);

        double totalWaterUsage = totalWaterUsage(showerTime, sinkTime, dishTime, numLaundryLoads);

        //Calculate electricity usage
        JOptionPane.showMessageDialog(null, "Part 3. Electricity Usage", "Environmental Impact Calculator", JOptionPane.PLAIN_MESSAGE);

        String tvQuestion = JOptionPane.showInputDialog("Enter number of minutes of TV used: ");
        int tvTime = Integer.parseInt(tvQuestion);

        String lightQuestion = JOptionPane.showInputDialog("Enter number of minutes of lights used: ");
        int timeLightUsed = Integer.parseInt(lightQuestion);

        String chargeQuestion = JOptionPane.showInputDialog("Enter number of devices charged today: ");
        int numDevicesCharged = Integer.parseInt(chargeQuestion);

        String fanQuestion = JOptionPane.showInputDialog("Enter number of minutes of ceiling fan used: ");
        int timeFan = Integer.parseInt(fanQuestion);

        int solarEnergyQuestion = JOptionPane.showConfirmDialog(null, "Do you have solar panels/ use solar energy?", "Environmental Impact Calculator", JOptionPane.YES_NO_CANCEL_OPTION);
        boolean solarEnergy = false;
        if (solarEnergyQuestion == 0) {
            solarEnergy = true;
        } else if (solarEnergyQuestion == 1) {
            solarEnergy = false;
        }

        double totalElectricityUsage = totalElectricityUsage(tvTime, timeLightUsed, numDevicesCharged, timeFan, solarEnergy);

        //Results
        System.out.println(printResults(totalTravel, totalWaterUsage, totalElectricityUsage));
    }
}