// A class is a collection of related attributes and behaviors


public class HelloWorld {


    // main -> an entrypoint for your computer to start running code
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("my name is Zayra");

        System.out.print("My favorite pizza topping is pepperoni.");
        System.out.print("My favorite caffienated drink are matcha lattes.");

        // 8 primitive data types
        int number = 5; // interger
        char letter = 'a';// character
        boolean isTrue = true; // true or false
        float decimal = 50.0f; // 32 bit decimal
        double bigdecimal = 0.6; // 64 bit decimal number

        // INT ALTERNATIVES (can ignore)
        byte age = 25;
        short population = 3200;
        long bigInterger = 10000;

        String myName = "Zayra"; // String is a CLASS not a primitive data type
        // a collection of PRIMITIVE characters to describe text

        // print out the length of the string using the length() method
        System.out.println(myName.length());

        // conditional statements
        // if this happens then that happens
        // conditions are always true or false, or booleans
        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        // ex 2
        boolean isCompSciFun = true;

        if (isCompSciFun == false) {
            System.out.println("Comp Sci Sucks");
        } else if (isCompSciFun == true) {
            System.out.println("Comp Sci is fun!");
        }


        if (isCompSciFun) {
            System.out.println("Comp Sci is really fun!");
        } else {
            System.out.println("Comp Sci stresses me out!");
        }

        // Challenge: Write a conditional if-else statement where you do something if you ate 5
        // apples vs 10, it should print something if neither condition is true.

        int appleCount = 3;
        if (appleCount == 5 || appleCount == 10) {
            System.out.println("You ate 5 apples!");
        } else if (appleCount == 10) {
            System.out.println("You ate 10 apples!");
        } else {
            System.out.println("You ate a different amount of apples.");
            // == equal
            // >= greater than or equal to
            // <= less than or equal to
        }
    }
}


