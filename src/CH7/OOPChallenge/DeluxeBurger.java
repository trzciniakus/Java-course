package CH7.OOPChallenge;

public class DeluxeBurger extends  Hamburger{

    public DeluxeBurger(String breadRollType, String meat, double basePrice) {
        super(breadRollType, meat, basePrice);
        super.chooseAdditions(true, true, false, false);
    }

    @Override
    public void chooseAdditions(boolean chips, boolean drink, boolean bacon, boolean lettuce) {
        System.out.println("You cannot choose any addition to deluxe burger");
    }
}
