package CH10.GenericsChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already on this league");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " picked for league " + this.name);
            return true;
        }
    }

    public void printRanking(){
        Collections.sort(teams);
        System.out.println("\nRanking:");
        for (Team team:teams) {
            System.out.println(team.getName() + " has " + team.getGainedPoints() + " points ");
        }
    }
}
