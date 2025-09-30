public class Rectangle {
    // instance variables ( or the features of the square)
    private int length;
    private int width;

    // constructor

    public Rectangle() {
        length = 6;
        width = 7;
        
    }

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }
    
    // getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // setters
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }
    // methods
    
    public int calculateArea() {
        return (length * width);
    }

    public boolean equals(Rectangle other) {
        if (length == other.length && width == other.width) {
            return true;
        } else {
            return false;
        }
    }

    public int calculatePerimeter() {
        return (length + length + width + width);
    }

    public double calculateDiagonal() {
        int a = length * length;
        int b = width * width;
        int c = a + b;
        double diagonal = Math.sqrt(c);
        return diagonal;

    
    }

    public String toString() {
        int area = length * width;
        return "This rectangle has a length of " + length + " and a width of " + width
            + ". Its area is " + area;
    }

    
    


}

    

