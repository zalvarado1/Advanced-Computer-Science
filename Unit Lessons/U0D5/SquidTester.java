public class SquidTester {

    public static void main(String[] args) {
        Squid larry = new Squid();

        System.out.println(larry.getTentacleCount());

        System.out.println(larry.toString());


        String s1 = "hello";
        String s2 = "h";
        String s3 = s2 + "ello";

        System.out.println(s1 == s3);

        // == is comparing the "id", in other words the "refrence address".
        // == does not compare content.

        // if you want to compare content, use the "equals" methof
        System.out.println(s1.equals(s3));


        //Math functions

        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(5, 9));
        System.out.println(Math.abs(-9));

        // SCT Math.sin, Math.tan, Math. cos, Math.pi, approx 3.14159
        // Math.toradians(180) returns radian of degree
    }

    
}