package CH7.OOPChallenge;

public class HealthyBurger extends Hamburger{
    private Addition tomato;
    private Addition cucumber;

    public HealthyBurger(String meat, double basePrice) {
        super("brown rye", meat, basePrice);
        this.tomato = new Addition();
        this.cucumber = new Addition();
    }


    public void chooseAdditions(boolean chips, boolean drink, boolean bacon,
                                boolean lettuce, boolean tomato, boolean cucumber) {
        super.chooseBasicAdditions(chips, drink, bacon, lettuce);
        manageAddition(this.tomato, tomato);
        manageAddition(this.cucumber, cucumber);
    }

    @Override
    public void showTotalPrice() {
        double total =  getBasePrice() + getAdditionsTotalPrice();
        System.out.println("You have added to your burger: \n"
                + (this.getBreadRollType()) + " bread \n"
                + (this.getMeat()) + " meat \n"
                + (this.getChips().isOrdered() ? "chips + " + this.getChips().getPrice() + "\n": "")
                + (this.getDrink().isOrdered() ? "drink + " + this.getDrink().getPrice() + "\n": "")
                + (this.getBacon().isOrdered() ? "bacon + " + this.getBacon().getPrice() + "\n": "")
                + (this.getLettuce().isOrdered() ? "lettuce + " + this.getLettuce().getPrice() + "\n": "")
                + (this.tomato.isOrdered() ? "tomato + " + this.tomato.getPrice() + "\n": "")
                + (this.cucumber.isOrdered() ? "cucumber + " + this.cucumber.getPrice() + "\n": "")
                + "Total price is: " + total + "\n");
    }
}
