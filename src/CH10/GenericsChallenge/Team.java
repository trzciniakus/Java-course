package CH10.GenericsChallenge;

public abstract class Team implements Comparable<Team>{
    private String name;
    private int gainedPoints;

    public Team(String name, int gainedPoints) {
        this.name = name;
        this.gainedPoints = gainedPoints;
    }

    public String getName() {
        return name;
    }

    public int getGainedPoints() {
        return gainedPoints;
    }

    @Override
    public int compareTo(Team team) {
        if(this.getGainedPoints() > team.getGainedPoints()){
            return -1;
        } else if (this.getGainedPoints() < team.getGainedPoints()){
            return 1;
        } else {
            return 0;
        }
    }


}
