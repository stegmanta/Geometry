public class Point{

    private int x;
    private int y;


    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point p){
        double xDiff = this.x-p.getX();
        double yDiff = this.y-p.getY();
        double distance = Math.sqrt((xDiff*xDiff) + (yDiff*yDiff));
        return distance;
    }

    public int getX(){

        return this.x;
    }


    public int getY(){

        return this.y;
    }
}