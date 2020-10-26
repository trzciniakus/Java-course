package CH5_Point;

public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point) {

        return Math.sqrt((this.getX() - point.getX()) * (this.getX() - point.getX())
                + (this.getY() - point.getY()) * (this.getY() - point.getY()));
    }

    public double distance (){

        Point point = new Point(0,0);
        return this.distance(point);
    }

    public double distance(int x, int y){

        Point point = new Point(x,y);
        return this.distance(point);
    }
}
