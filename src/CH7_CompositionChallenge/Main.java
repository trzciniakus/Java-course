package CH7_CompositionChallenge;

public class Main {

    public static void main(String[] args) {

        Table theTable = new Table(80, 120, "black", 100, 100);
        TelevisionSet theTV = new TelevisionSet(1920,1080);

        Room theRoom = new Room(400, 300, 260, theTable, theTV);

        System.out.println(theRoom.getTelevisionSet().isOn());
        theRoom.getTelevisionSet().pressOnOffButton();
        theRoom.getTelevisionSet().pressOnOffButton();

        theRoom.moveTable(1000,2000);
        theRoom.moveTable(100,20);

    }
}
