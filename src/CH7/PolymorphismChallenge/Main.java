package CH7.PolymorphismChallenge;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.speed = 0;
    }

    public void startEngine() {
        if (!engine) {
            engine = true;
        }
        System.out.println("Car.startEngine() called");
    }

    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println("Car.accelerate() called. Current speed is: " + this.speed);
    }

    public void brake(int speed) {

        if (this.speed - speed <= 0) {
            this.speed = 0;
            engine = false;
        } else {
            this.speed -= speed;
        }
        System.out.println("Car.brake() called. Current speed is: " + this.speed);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }
}


class Ferrari extends Car {
    public Ferrari() {
        super("Ferrari", 8);
    }

    @Override
    public void accelerate(int speed) {
        if (this.getSpeed() + speed > 250) {
            this.setSpeed(250);
            System.out.println("Ferrari.accelerate() called. " +
                    "You have reached maximum speed: " + this.getSpeed());
        } else {
            int newSpeed = this.getSpeed() + speed;
            this.setSpeed(newSpeed);
            System.out.println("Ferrari.accelerate() called. Current speed is: " + this.getSpeed());
        }
    }

}

class Ford extends Car {
    public Ford() {
        super("Ford", 4);
    }

    @Override
    public void startEngine() {
        if (!this.isEngine()) {
            this.setEngine(true);
        }
        System.out.println("Ford.startEngine() called. Radio has been turned on");
    }
}

class Truck extends Car {
    public Truck() {
        super("Truck", 4);
    }
}

public class Main {


    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i +
                    " : " + car.getName() + "\n");
            car.startEngine();
            car.accelerate(300);
            car.brake(200);
            car.brake(200);
            //System.out.println(car.getClass().getName());
            //System.out.println(car.getClass().getSimpleName());
        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("\n" + "Random number: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Ferrari();
            case 2:
                return new Ford();
            case 3:
                return new Truck();
            default:
                return null;
        }
    }
}
