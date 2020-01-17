public class CheckTriangle{


    public static void main (String []args){
        Point b = new Point(70,80);
        Point c = new Point(60, 40);
        Point d = new Point (30, 50);
        Point e = new Point (80, 90);

        Triangle triangleW = new Triangle(b,c,d);
        
        System.out.println(b.distance(d));
        System.out.println(triangleW.area());

        Point squareACorner = new Point(0, 0);
        Square squareA = new Square(squareACorner, 10);

        Point squareBCorner = new Point(5, 5);
        Square squareB = new Square(squareBCorner, 10);

        Point squareCCorner = new Point(-10, -10);
        Square squareC = new Square(squareCCorner, 5);

        System.out.println(Square.collision(squareA, squareB));
        System.out.println(Square.collision(squareA, squareC));

    }
}