// camelCase -> a way to wrtie variable names, and it's a standard
// keep the first letter lowercase if it is a variable name or a method
// otherwise keep it capital for class names

// a class is just a blueprint for a new data type
// -> it's not the object itself, but rather a plan

public class Spaceship {

    // instance variables
    private String description;
    private double size;
    private int passengerCount; 
    private double fuelLevel; 
    private boolean shieldsActive;


    // constructors
    public Spaceship(String inputDescription, int inputPassengerCount, double inputFuelLevel, boolean inputShieldsActive) {
        description = inputDescription;
        passengerCount = inputPassengerCount;
        fuelLevel = inputFuelLevel;
        shieldsActive = inputShieldsActive;
    }

    // methods
    // getters
    public String getDescription() {
        return description;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean getShieldsActivate() {
        return shieldsActive;
    }

    // setters
    public void setDescription(String input) {
        description = input;
    }

    public void setPassengerCount(int input) {
        passengerCount = input;
    }

    public void setFuelLevel(double input) {
        fuelLevel = input;
    }
    
    public void setShieldsActive(boolean input) {
        shieldsActive = input;
    }


}