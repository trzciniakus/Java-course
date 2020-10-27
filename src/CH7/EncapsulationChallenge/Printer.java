package CH7.EncapsulationChallenge;

public class Printer {

    private int tonerLevel;
    private int printedPages;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel >= 0 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.printedPages = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(int fillUpAmount){
        if ((this.tonerLevel + fillUpAmount) <= 100){
            this.tonerLevel += fillUpAmount;
        }else{
            this.tonerLevel = 100;
        }
        System.out.println("Current toner level is " + this.tonerLevel);
    }

    public void printPage(){
        this.tonerLevel--;
        this.printedPages++;
        System.out.println("You have printed a page");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
