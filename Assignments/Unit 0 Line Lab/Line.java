public class Line {
    // instance variables
    private int a;
    private int b;
    private int c;

    // constructors
    public Line(int a, int b, int c) {
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
        double slope = (double) -a / b;
        return slope;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if ((a * x) + (b * y) + c == 0) {
            return true;
        } else {
            return false;
        }

    }

    public String toString() {
        String equation = a + "x" + " + " + b + "y"  + c + "= 0";
        return equation;
    }


}
