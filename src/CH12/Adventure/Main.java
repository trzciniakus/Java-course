package CH12.Adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "In front of computer",null));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "At the end of the road", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "At the top of a hill", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "Inside a building", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "In a valley", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "In a forest", tempExit));

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescriptions());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits: ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = "";
            String[] validDirections = {"Q", "S", "E", "N", "W", "QUIT", "WEST", "EAST", "SOUTH", "NORTH"};
            String[] userChoiceWords = scanner.nextLine().toUpperCase().split(" ");
            for (String word : userChoiceWords) {
                for (String dir : validDirections) {
                    if (word.equals(dir)) {
                        direction = word.split("")[0];
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go there");
            }

        }

    }

}
