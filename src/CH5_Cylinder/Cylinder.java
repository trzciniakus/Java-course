package CH5_Cylinder;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getVolume (){
        return getArea() * getHeight();
    }

    public double getHeight() {
        return height;
    }
}
