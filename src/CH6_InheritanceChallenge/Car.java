package CH6_InheritanceChallenge;

public class Car extends Vehicle {

    private String make;
    private int seats;
    private int gears;
    private int currentGear;

    public Car(String color, double weight, String make, int seats, int gears) {
        super(color, weight);
        this.make = make;
        this.seats = seats;
        this.gears = gears;
        this.currentGear = 0;
    }

    public void gearUp(){
        if (currentGear < gears){
            this.currentGear +=1;
        }
    }

    public void gearDown(){
        if (currentGear > 0){
            this.currentGear -=1;
        }
    }
}
