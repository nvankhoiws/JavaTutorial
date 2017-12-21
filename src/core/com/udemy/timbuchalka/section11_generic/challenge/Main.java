package core.com.udemy.timbuchalka.section11_generic.challenge;

import core.com.udemy.timbuchalka.section11_generic.BasketBallPlayer;
import core.com.udemy.timbuchalka.section11_generic.FootballPlayer;
import core.com.udemy.timbuchalka.section11_generic.Team;

public class Main {
    public static void main(String[] args) {
        Team<FootballPlayer> hanoiTT = new Team<FootballPlayer>("HanoiTT");

        Team<BasketBallPlayer> goldenBuffulo = new Team<>("Golden Buffulo");
        Team<BasketBallPlayer> childFomVillage = new Team<>("Child from Village");
        Team<BasketBallPlayer> boyNhaNgheo = new Team<>("Boy nha ngheo");

        League<Team<BasketBallPlayer>> league = new League<>();
        league.addTeam(goldenBuffulo);
        league.addTeam(boyNhaNgheo);
        league.addTeam(childFomVillage);

        goldenBuffulo.matchResult(boyNhaNgheo, 5, 4);
        goldenBuffulo.matchResult(childFomVillage, 5, 5);
//        boyNhaNgheo.matchResult(boyNhaNgheo, 7, 2);

        for (int i = 0, length = league.getTeamlist().size(); i < length; i++) {
            Team team = (Team) league.getTeamlist().get(i);
            System.out.println(team.getName() + " has point of "+ team.ranking());
        }

        league.printLeageTeamList();

    }
}
