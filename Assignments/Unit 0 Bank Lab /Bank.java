public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank() {
        numberOfLoanOfficers = 12;
        numberOfTellers = 10;
    }

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    

    public int getNumberOfLoanOfficers() {
        return this.numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return this.numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int newLoanOfficerNumb) {
        numberOfLoanOfficers = newLoanOfficerNumb;
    }

    public void setNumberOfTellers(int newTellerNumb) {
        numberOfLoanOfficers = newTellerNumb;
    }

    public int computeTotalEmployees() {
        int totalEmployees = numberOfLoanOfficers + numberOfTellers;
        return totalEmployees;
    }

    public String toString() {
        String sentence = "This bank has " + numberOfLoanOfficers + " and " 
        + numberOfTellers + " tellers.";
        return sentence;
    }

    public boolean equals(Bank other) {
            if (other.numberOfLoanOfficers == this.numberOfLoanOfficers 
        && other.numberOfTellers == this.numberOfTellers) {
            return true;
        }
        return false;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer == true) {
            numberOfLoanOfficers += numberToHire;
        } else {
            numberOfTellers += numberToHire;
        }
    }
}