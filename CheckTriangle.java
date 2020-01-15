public class CheckTriangle{


    public static void main (String []args){
        Point b = new Point(70,80);
        Point c = new Point(60, 40);
        Point d = new Point (30, 50);

        Triangle triangleW = new Triangle(b,c,d);
        
        System.out.println(b.distance(d));
        System.out.println(triangleW.area());
    }
}