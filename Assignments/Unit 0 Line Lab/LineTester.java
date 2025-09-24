

public class LineTester {
    public static void main(String[] args) {
        // Testing Line 1
        Line line1 = new Line(5, 4, -17);
        double slope1 = line1.calculateSlope(); // slope1 should be -1.25 
        System.out.println("Slope1, should be -1.25: " + slope1);
        boolean onLine1 = line1.isCoordinateOnLine(5, -2);
        System.out.println("Should be true, as 5(5) + 4(-2) + (-17) = 0: " + onLine1);

        // Testing Line 2
        Line line2 = new Line(-25, 40, 30);
        double slope2 = line2.calculateSlope(); // slope2 should be 0.625
        System.out.println("Slope2, should be 0.625" + slope2);
        boolean onLine2 = line2.isCoordinateOnLine(5, -2);
        System.out.println("Should be false, as -25(5) + 40(-2) + 30 != 0: " + onLine2);

    }
}