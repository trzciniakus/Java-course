package CH9.AbstractionTraining;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not good at that, can I go swim instead?");
    }
}
