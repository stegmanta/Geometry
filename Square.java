    
public class Square {

    private Point bottomLeftCorner;
    private int sidelength;

    // Determined based on bottom left corner given.
    private Point bottomRightCorner;
    private Point topLeftCorner;
    private Point topRightCorner;

    // Constructor
    public Square(Point bottomLeftCorner, int sidelength) {

        this.bottomLeftCorner = bottomLeftCorner;
        this.sidelength = sidelength;

        // Sets other points based on bottom left corner.
        /**
         * this.bottomRightCorner = new Point(bottomLeftCorner.getX() + sidelength, bottomLeftCorner.getY());
         * this.topLeftCorner = new Point(bottomLeftCorner.getX(), bottomLeftCorner.getY() + sidelength);
         * this.topRightCorner = new Point(bottomLeftCorner.getX() + sidelength, bottomLeftCorner.getY() + sidelength);
        */
    }

    public int area() {
        return this.sidelength * this.sidelength;
    }

    public int perimeter() {
        return this.sidelength * 4;
    }

}