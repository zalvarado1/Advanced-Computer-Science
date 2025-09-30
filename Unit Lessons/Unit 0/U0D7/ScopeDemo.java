public class ScopeDemo {
    private String world = "World"; // instance variable are global
    public static void main(String[] args) {
        
    }

    public String method2 () {
        String goodbye = "";
        var hello = "Hello";

        if (true) {
            goodbye = "Goodbye";
            System.out.println(goodbye);
        }
        return hello;

    }
    public String method1() {
        return hello + world;
    }
}