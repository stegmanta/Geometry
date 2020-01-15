public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    // Constructor
    public Triangle(Point pointA, Point pointB, Point pointC) {

        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

    }

    public double perimeter() {

        return  pointA.distance(pointB) + 
                pointA.distance(pointC) + 
                pointB.distance(pointC);

    }

    public double area() {

        double sideA = pointA.distance(pointB);
        double sideB = pointA.distance(pointC);
        double sideC = pointB.distance(pointC);
        double semiPerimeter = perimeter() / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA)
                        * (semiPerimeter - sideB)
                        * (semiPerimeter - sideC));

    }


}