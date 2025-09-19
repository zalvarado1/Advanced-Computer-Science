public class Line{
    // instance variables
    private int a;
    private int b;
    private int c;

    // constructors
    public Line(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    // getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    // setters
    public void setA(int newA) {
        a = newA;
    }
    public void setB(int newB) {
        a = newB;
    }
    public void setC(int newC) {
        c = newC;
    }

    // methods
    // calculate and return the slope of the line using the instace variables
    public double calculateSlope() {
        double slope = (double) -a/b;
        return slope;
    }


    // determine if a given point lies on the line. returns true if the line = 0 when the equation is substituted, returns false otherwise
    // parameters: two int variables representing x and y coordinates
    // return: a boolean value
    public boolean isCoordinateOnLine(int x, int y) {
        if ((a*x) + (b*y) + c == 0){
            return true;
        } else{
            return false;
        }

    }

    public String toString(){
        string equation = a + "x" + " + " + b + "y"  + c + "= 0";
    }


}
