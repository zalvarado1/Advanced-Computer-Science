

public class Demo{

    private int hello;
    private int world;
    private String goodbye;

    public int getHello() {
        return hello;
    }

    public void setHello(int hello) {
        this.hello = hello;
    }

    public int getWorld() {
        return world;
    }

    public void setWorld(int world) {
        this.world = world;
    }

    public String getGoodbye() {
        return goodbye;
    }
 
    public void setGoodbye(String goodbye) {
        this.goodbye = goodbye;
    }
    public static void main(String args[]) {
        //AND - ALL CONDITIONS NEED TO BE TRUE
        int age = 20;

        boolean isFelon = false;

        if ((age >= 18 && age >= 35) && !isFelon) {
            System.out.println("You can run for presidency");
        }

        age = 15;
        if(age < 35 || !isFelon || age > 101) {
            System.out.println("This person is not eligible for presidency.");
        }

        if (!(age > 18 || isFelon)) {
            System.out.println("pirnt me");
        }

        // READABILITY IS IMPORTANT

        boolean isRegistered = true;
        boolean isCitizen = true;
        String country = "USA";

        //READABILITY IS IMPORTANT - This is messy and difficult to read.

        if(isRegistered){
            if(age >= 18){
                if(isCitizen){
                    if (country.equals("USA")){
                        System.out.println("You can vote!");
                    }

                }
            }
        }

        //Guarding If Statements, This is easier to read.
        if(!isRegistered){
            return;
        }
        if(age < 18){
            return;
        }
        if(!isCitizen){
            return;
        }
        if(!country.equals("USA")){
            return;
        }
        System.out.println("You can vote!");
    }
}