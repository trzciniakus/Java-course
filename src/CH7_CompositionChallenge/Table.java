package CH7_CompositionChallenge;

public class Table {

    private int width;
    private int length;
    private String color;
    private int positionX;
    private int positionY;

    public Table(int width, int length, String color, int positionX, int positionY) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void changePosition(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }


}
