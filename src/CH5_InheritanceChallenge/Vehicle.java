package CH5_InheritanceChallenge;

public class Vehicle {

    private String color;
    private double weight;
    private double speed;
    private int direction;

    public Vehicle(String color, double weight) {
        this(color, weight,0);
    }

    public Vehicle(String color, double weight, double speed) {
        this.color = color;
        this.weight = weight;
        this.speed = speed;
        this.direction = 0;
    }

    public void changeSpeed (double speed) {
        this.speed += speed;
    }

    public void move(){
        System.out.println("You moved with " + speed + " km/h");
    }

    public void turnRight (){
        this.direction = (this.direction + 90 + 360) % 360;
    }

    public void turnLeft (){
        this.direction = (this.direction - 90 + 360) % 360;
    }
}
