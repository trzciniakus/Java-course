package CH10.GenericsChallenge;

public class Main {

    public static void main(String[] args) {
        League<FootballTeam> premierLeague = new League<FootballTeam>("Premier League");
        FootballTeam manCity = new FootballTeam("Manchester City", 12);
        premierLeague.addTeam(manCity);
        FootballTeam manUtd = new FootballTeam("Manchester United", 17);
        premierLeague.addTeam(manUtd);
        FootballTeam liverpoolFC = new FootballTeam("Liverpool FC", 11);
        premierLeague.addTeam(liverpoolFC);
        FootballTeam arsenal = new FootballTeam("Arsenal", 14);
        premierLeague.addTeam(arsenal);
        BasketballTeam orlandoMagic = new BasketballTeam("Orlando Magic", 26);
//        premierLeague.addTeam(orlandoMagic);

        premierLeague.printRanking();
    }
}
