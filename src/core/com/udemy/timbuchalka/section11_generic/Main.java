package core.com.udemy.timbuchalka.section11_generic;

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
        Team<String> brokenTeam = new Team<>("broken-team");
//        brokenTeam.addPlayer("NguyenVanKhoi");

        // Implement the matchResult method in Team class ?
        Team<FootballPlayer> ximangHaiphong = new Team<>("Xi mang Hai Phong");
        ximangHaiphong.matchResult(hanoiTT, 4, 2);

        // How to a football team fight with a basket ball team ? How to prevent that
        Team<BasketBallPlayer> basketBallTeam = new Team<>("Buffulo");
        basketBallTeam.matchResult(ximangHaiphong, 7, 2);

    }


}
