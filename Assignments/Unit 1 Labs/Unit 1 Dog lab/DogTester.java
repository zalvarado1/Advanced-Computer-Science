public class DogTester {
    public static void main(String[] args) {
        Dog dogOne = new Dog("Snoopy", "Charlie Brown", 8, 818); // dog one
        Dog dogTwo = new Dog(); // dog two
        Dog dogThree = new Dog("Lassie", "Rudd", 12, 567); // dog three
        System.out.println(dogOne.toString()); // First dog to string, printing values
        System.out.println(dogTwo.toString()); // Second dog to string, printing values
        System.out.println(dogThree.toString()); // Third dog to string, printing values
        dogOne.setAge(9); // setting dog one's age to 8
        dogThree.setOwnerName("Joe"); // setting dog three's owner to "Joe"
        System.out.println(dogOne.toString());
        System.out.println(dogThree.toString());
    }
}