package CH7.CompositionChallenge;

public class Room {

    private int width;
    private int length;
    private int height;
    private Table table;
    private TelevisionSet televisionSet;

    public Room(int width, int length, int height, Table table, TelevisionSet televisionSet) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.table = table;
        this.televisionSet = televisionSet;
    }

    public void moveTable(int positionX, int positionY){

        if (((positionX + this.table.getLength()) > this.length)
                || ((positionY + this.table.getWidth()) > this.width)) {
            System.out.println("You cannot move table to that position");
        } else {
            this.table.changePosition(positionX,positionY);
            System.out.println("Your table has been moved to " + positionX + ", " + positionY);
        }

    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    private Table getTable() {
        return table;
    }

    public TelevisionSet getTelevisionSet() {
        return televisionSet;
    }
}
