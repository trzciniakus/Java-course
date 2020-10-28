package CH7.OOPChallenge;

public class Addition {

    private boolean isOrdered;
    private double price;


    public Addition() {
        this.isOrdered = false;
        this.price = 1.00;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }
}
