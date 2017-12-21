package core.com.udemy.timbuchalka.section11_generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FootballPlayer congPhuong = new FootballPlayer("Cong Phuong");
        VolleyBallPlayer vanKieu = new VolleyBallPlayer("Van Kieu");
        BasketBallPlayer caoKeu = new BasketBallPlayer("Cao Keu");

        Team<FootballPlayer> hanoiTT = new Team<FootballPlayer>("HanoiTT");

        hanoiTT.addPlayer(congPhuong);
//        hanoiTT.addPlayer(vanKieu);
//        hanoiTT.addPlayer(caoKeu);

        // What problem when we use any kind of data like this Team<String> ?
//        Team<String> brokenTeam = new Team<>("broken-team");
//        brokenTeam.addPlayer("NguyenVanKhoi");

        // Implement the matchResult method in Team class ?
        Team<FootballPlayer> ximangHaiphong = new Team<>("Xi mang Hai Phong");
        ximangHaiphong.matchResult(hanoiTT, 4, 2);

        // How to a football team fight with a basket ball team ? How to prevent that
        Team<BasketBallPlayer> goldenBuffulo = new Team<>("Golden Buffulo");
//        basketBallTeam.matchResult(ximangHaiphong, 7, 2);
        Team<BasketBallPlayer> childFomVillage = new Team<>("Child from Village");

        goldenBuffulo.matchResult(childFomVillage, 7, 2);

        Team<BasketBallPlayer> boyNhaNgheo = new Team<>("Ngheo qua khong biet lam gi");

        goldenBuffulo.matchResult(boyNhaNgheo, 4, 4);

        System.out.println(goldenBuffulo.getName() + " has got " + goldenBuffulo.ranking());
        System.out.println(childFomVillage.getName() + " has got " + childFomVillage.ranking());
        System.out.println(boyNhaNgheo.getName() + " has got " + boyNhaNgheo.ranking());

        List<Team> teamlist = new ArrayList<>();
        teamlist.add(goldenBuffulo);
        teamlist.add(ximangHaiphong);
        teamlist.add(childFomVillage);

        Collections.sort(teamlist);

        for (int i = 0, length = teamlist.size(); i < length; i++) {
            System.out.println(teamlist.get(i).getName() + " is ranked at " + (i+1) + " " + teamlist.get(i).ranking());
        }
    }
}
