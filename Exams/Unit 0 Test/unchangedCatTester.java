public class unchangedCatTester {
    public static void main(String[] args) {
        Cat myCat = Cat("Betsy", "Tabby");
        Cat otherCat = Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());
        "My Cat's Name: " + myCat.getName());

        return "Are the cat's equal?" + myCat.equals(otherCat);

        print("Is my cat hungry? " + myCat.getIsHungry());

        String firstName = "Tiger";
        String lastName == "Beast";
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}