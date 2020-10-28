package CH7.OOPChallenge;

public class Hamburger {
    private String breadRollType;
    private String meat;
    private double basePrice;
    private double additionsTotalPrice;
    private Addition chips;
    private Addition drink;
    private Addition bacon;
    private Addition lettuce;


    public Hamburger(String breadRollType, String meat, double basePrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.additionsTotalPrice = 0;
        this.chips = new Addition();
        this.drink = new Addition();
        this.bacon = new Addition();
        this.lettuce = new Addition();
    }

    protected void manageAddition(Addition addition, boolean isOrdered){
        addition.setOrdered(isOrdered);
        if (isOrdered) {
            this.additionsTotalPrice += addition.getPrice();
        }
    }

    protected void chooseBasicAdditions(boolean chips, boolean drink, boolean bacon, boolean lettuce) {
        this.additionsTotalPrice = 0;
        manageAddition(this.chips, chips);
        manageAddition(this.drink, drink);
        manageAddition(this.bacon, bacon);
        manageAddition(this.lettuce, lettuce);
    }

    protected void chooseAdditions(boolean chips, boolean drink, boolean bacon, boolean lettuce) {
        this.chooseBasicAdditions(chips, drink, bacon, lettuce);
    }

    public void showTotalPrice() {
        double total =  basePrice + additionsTotalPrice;
        System.out.println("You have added to your burger: \n"
                + (this.breadRollType) + " bread \n"
                + (this.meat) + " meat \n"
                + (this.chips.isOrdered() ? "chips + " + this.chips.getPrice() + "\n": "")
                + (this.drink.isOrdered() ? "drink + " + this.drink.getPrice() + "\n": "")
                + (this.bacon.isOrdered() ? "bacon + " + this.bacon.getPrice() + "\n": "")
                + (this.lettuce.isOrdered() ? "lettuce + " + this.lettuce.getPrice() + "\n": "")
                + "Total price is: " + total + "\n");
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getAdditionsTotalPrice() {
        return additionsTotalPrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public Addition getChips() {
        return chips;
    }

    public Addition getDrink() {
        return drink;
    }

    public Addition getBacon() {
        return bacon;
    }

    public Addition getLettuce() {
        return lettuce;
    }
}
