package CH7.OOPChallenge;

public class Main {

    public static void main(String[] args) {

        Hamburger theBurger = new Hamburger("white", "beef", 5);
        theBurger.chooseAdditions(true, false, false, true);
        theBurger.chooseAdditions(false, false, false, true);
        theBurger.showTotalPrice();

        DeluxeBurger theDelBurger = new DeluxeBurger("white", "beef", 8);
        theDelBurger.chooseAdditions(true, false, false, true);
        theDelBurger.chooseAdditions(false, false, false, true);
        theDelBurger.showTotalPrice();

        HealthyBurger theHealBurger = new HealthyBurger ( "chicken", 8);
        theHealBurger.chooseAdditions(true, false, false, true,true,false);
        theHealBurger.chooseAdditions(false, false, false, true, false, true);
        theHealBurger.showTotalPrice();
    }
}
