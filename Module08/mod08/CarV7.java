package Module08.mod08;

/**
 * Project title: 08.07 Constructing Multiple Objects
 *
 * Purpose of Project: Calculates the gas mileage on an example car.
 *
 * @version 2/10/2015
 *
 * @author Omar Rahman
 *
 * *********** PMR ***********
 * (+) Understood OOP more.
 *
 * (-) Need more practice with OOP.
 * ***************************
 *
 * In the future: Practice.
 */

public class CarV7 {

    private String carType;
    private int endMiles;
    private int startMiles;
    private double gallonsUsed;
    private double pricePerGallon;
    private double costOfTrip;
    private double milesPerGallon;
    private double gallonsPerMile;

    public CarV7(String type, int endMi, int startMi, double galUsed, double pricePerGal, double costOfGals, double milesPerGal, double galsPerMile) {
        carType = type;
        endMiles = endMi;
        startMiles = startMi;
        gallonsUsed = galUsed;
        pricePerGallon = pricePerGal;
        costOfTrip = costOfGals;
        milesPerGallon = milesPerGal;
        gallonsPerMile = galsPerMile;
    }

    public int calcDistance() {
        return endMiles - startMiles;
    }

    public String getType() {
        return carType;
    }

    public int getStartMiles() {
        return startMiles;
    }

    public int getEndMiles() {
        return endMiles;
    }

    public double getGallonsUsed() {
        return gallonsUsed;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public double calcMPG() {
        return ((double)calcDistance()) / gallonsUsed;
    }

    public double calcGPM() {
        return gallonsUsed / calcDistance();
    }

    public double calcCost() {
        double cost = (gallonsUsed * pricePerGallon);
        return cost;
    }

}