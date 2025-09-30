public class Squid {
    // instance variable (squid variables)
    private int tentacleCount;
    private double inkMeter;
    private String funFact;

    // constructor (how to make new squid)
    // default constructor
    public Squid() {
        tentacleCount = 10;
        inkMeter = 100.0;
        funFact = "you can use pieces of squid as fish bait!";
    }

    public int getTentacleCount() {
        return tentacleCount;
    
    }

    public void setTentacleCount(int value) {
        tentacleCount = value;
    }

    public String toString(){
        return "This is a squid. It has " + tentacleCount + " tentacles, and it's current is level is "  + inkMeter + ". Also, did you know that " + funFact + "?";
    }

    public boolean equals(Squid other) {
        if (tentacleCount == other.tentacleCount && inkMeter == other.inkMeter && funFact  == other.funFact){
            return true;
        }
        return false;
    }
    }

