public class conditionalhallenge {
    public static void main(String[] args) {
        // Your code will go here
        double Temperature = 20;
        System.out.println("Initial Temperature: " + Temperature);
        boolean isCold = true;
        

        
        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        if (isCold = true) {
            System.out.println("isCold: " + isCold);
            double NewTemperature = 5;
            System.out.println("New Temperature: " + NewTemperature);
        }
        // Part 2: Grade Calculator
        System.out.println("--- Part 2: Grade Checker ---");
        int Score = 90;
        System.out.println("Score: " + Score);
        if (Score >= 70); {
        System.out.println("Passed");
        }

        
        // Part 3
        System.out.println("--- Part 3: Season Determiner ---");
        int SeasonTemperature = 45;
        if (SeasonTemperature < 59 || SeasonTemperature > 40); {
            System.out.println("Fall.");
        }


        
        // Part 4
        System.out.println("--- Part 4: Number Classifier ---");
        int Number = 34;
        if (Number > 0 || Number < 100)
        System.out.println("Positive.");
    }
}
