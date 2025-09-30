public class SpaceTester {
    public static void main(String[] args) {
        // 1. instantiate a spaceship object
        Spaceship ship = new Spaceship("red", 30, 90.0, true);
        // the new keyword creates a new object

        // 2. invoke a method
        String shipDescription = ship.getDescription();

        int shipPassengerCount = ship.getPassengerCount();

        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);

        // 3. manipulate the data

        ship.setDescription("blue");
        ship.setPassengerCount(15);
        ship.setFuelLevel(65.5);
        ship.setShieldsActive(false);
        System.out.println(ship.getDescription());
        System.out.println(ship.getPassengerCount());
        System.out.println(ship.getFuelLevel());
        System.err.println(ship.getShieldsActivate());



    }
}
