public class Customer {
    private String name;
    private String address;
    private int rewardPoints;

    public Customer(String name, String address, int rewardPoints) {
        this.name = name;
        this.address = address;
        this.rewardPoints = rewardPoints;

    }

    public String toString() {
        String sentence = "Customer name: " + name + ". Customer address: " + address + "Customer reward points: " + rewardPoints;
        return sentence;
    }

    public boolean equals(Customer other) {
        if (this.name.equals(other.name) && this.address.equals(other.address) && this.rewardPoints == other.rewardPoints) {
            return true;
        }
        return false;
    }

    public int boostPoints(double percentage) {
        double realPerc = percentage / 100;
       double firstPoints = realPerc * rewardPoints;
 



    }



}