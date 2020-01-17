public class Square {

    private Point bottomLeftCorner;
    private int sidelength;


    // Constructor
    public Square(Point bottomLeftCorner, int sidelength) {

        this.bottomLeftCorner = bottomLeftCorner;
        this.sidelength = sidelength;

    }

    public int area() {
        return this.sidelength * this.sidelength;
    }

    public int perimeter() {
        return this.sidelength * 4;
    }

}