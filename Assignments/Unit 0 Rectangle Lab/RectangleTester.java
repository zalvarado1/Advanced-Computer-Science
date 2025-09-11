public class RectangleTester {

    public static void main(String[] args) {
        Rectangle one = new Rectangle(8, 9);

        Rectangle two = new Rectangle(9, 6);

        System.out.println("Rectangle one (length: 8, width: 9): " + one.toString());
        System.out.println("Rectangle two (length: 9, width: 6): " + two.toString());
        one.setLength(9);
        two.setWidth(4);
        System.out.println("Updated rectangle one (length: 9, width: 9): " + one);
        System.out.println("Updated rectangle two (length: 9, width: 4): " + two);
        System.out.println("Checking if rectangle one equals rectangle two: " + one.equals(two));
        System.out.println("Calculating diagonal of rectangle one: " + one.calculateDiagonal());
        System.out.println("Calculating diagonal of rectangle two: " + two.calculateDiagonal());

        

    
    }

    
}