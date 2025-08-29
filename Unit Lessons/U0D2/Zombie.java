public class Zombie {
    // ATTRIBUTES
    //green
    String skinColor = "Green";
    //rot
    //dead
    boolean isDead = true;

    //shamble about

    //humans eaten count
    int humansEaten = 0;

    public static void main(String[] args) {
        Zombie nick = new Zombie();

        nick.growl();
        System.out.println(nick.growl());

        Zombie charlie = new Zombie();

        charlie.growl();
        System.out.println(charlie.growl());
        charlie.humansConsumed();
        System.out.println("Charlie ate " + charlie.humansConsumed() + "humans.");
    }

    //METHODS
    //walk with arms out
    // eat brains
    
    //growl
    public String growl() {
        return "grashshhnghhhh....";
    }

    //CHALLENGE: make a new method that returns the numbers of humans eaten

    public int humansConsumed() {
        return humansEaten;
    }

}