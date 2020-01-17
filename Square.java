public class Square {

    private Point bottomLeftCorner;
    private int sidelength;

    private Point bottomRightCorner;
    private Point topLeftCorner;
    private Point topRightCorner;

    // Constructor
    public Square(Point bottomLeftCorner, int sidelength) {

        this.bottomLeftCorner = bottomLeftCorner;
        this.sidelength = sidelength;

        this.bottomRightCorner = new Point(bottomLeftCorner.getX() + sidelength, bottomLeftCorner.getY());
        this.topLeftCorner = new Point(bottomLeftCorner.getX(), bottomLeftCorner.getY() + sidelength);
        this.topRightCorner = new Point(bottomLeftCorner.getX() + sidelength, bottomLeftCorner.getY() + sidelength);

    }

    // Getters

    public Point[] getCoordinates() {

        Point[] points = new Point[4];

        points[0] = this.bottomLeftCorner;
        points[1] = this.bottomRightCorner;
        points[2] = this.topLeftCorner;
        points[3] = this.topRightCorner;

        return points;

    }

    public Point getBottomLeft() {
        return this.bottomLeftCorner;
    }

    public int getSideLength() {
        return this.sidelength;
    }


    public int area() {
        return this.sidelength * this.sidelength;
    }

    public int perimeter() {
        return this.sidelength * 4;
    }

    public static boolean collision(Square a, Square b) {

        Point[] aCoordinates = a.getCoordinates();

        for (int i = 0; i < aCoordinates.length; i++) {

            if (Square.intersect(aCoordinates[i], b)) {
                return true;
            }

        }

        return false;

    }

    private static boolean intersect(Point a, Square b) {

        if (a.getX() < b.getBottomLeft().getX() + b.getSideLength() && a.getX() > b.getBottomLeft().getX()) {
            if (a.getY() < b.getBottomLeft().getY() + b.getSideLength() && a.getY() > b.getBottomLeft().getY()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

}