

public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;


    }

    public Dog(){
        this.name = "Nick";
        this.ownerName = "Zayra";
        this.age = 15;
        this.dogId = 453;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        String output = name + " is a good dog. They are " + age + " years old and belong to " + ownerName + ".";
        if(!stillInFacility) {
            output += " They are not currently in our facility. ";
        }
        else {
            output += " They are currently in our facility. ";
        }

        output += "For employee. use only: DogTag is " + dogTag;
        return output;
    }

    // dog char, dog tag, still in facility

    public boolean equals(Dog other) {
        if (this.name.equals(other.name) && this.age == other.age && this.ownerName.equals(ownerName) && this.dogId == other.dogId
         && this.dogChar == other.dogChar && this.dogTag.equals(other.dogTag) && this.stillInFacility == other.stillInFacility) {
            return true;
        }
        return false; }
    
        // Returns a string that concatenates (combines) the values of `dogId` and `dogChar`.
        
        public String generateDogTag() {

            String output = "Dog ID: " + dogId + " Dog Char: " + dogChar;
            return output;
        }

        public char generateDogChar() {
        int firstInt = dogId % 10;
        int secondInt = firstInt % 10;
        int thirdInt = secondInt % 10;
        char dogChar = (char) ('F' + ((firstInt + secondInt + thirdInt) % 10));
        return dogChar;
        
        }


}