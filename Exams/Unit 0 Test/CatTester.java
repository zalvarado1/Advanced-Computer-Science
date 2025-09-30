public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); // 1. added keyword 'new'
        Cat otherCat = new Cat("Tiger Beast", "Tabby"); // 2. added keyword 'new'
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); // 3. added sout method and deleted extra parentheses at end.

        System.out.println("Are the cat's equal? " + myCat.equals(otherCat)); // 4. changed return into sout method

        System.out.println("Is my cat hungry? " + myCat.getIsHungry()); // 5. changed print into sout method

        String firstName = "Tiger";
        String lastName = "Beast"; // 6. removed one parenthesis since we arent comparing variables
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}