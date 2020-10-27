package CH6_InheritanceChallenge;

public class Fiesta extends Car{

    private String radioText;

    public Fiesta(String color) {
        super(color, 1450,"Ford Fiesta", 5, 5);
        this.radioText = "Hello";
    }

    public void setRadioText(String radioText) {
        this.radioText = radioText;
    }

    public void playRadioText() {
        System.out.println(radioText);
    }
}
