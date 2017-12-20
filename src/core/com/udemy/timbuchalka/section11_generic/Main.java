package core.com.udemy.timbuchalka.section11_generic;

public class Main {

    public static void main(String[] args) {
        Team<FootballPlayer> hanoiTT = new Team<>("HanoiTT");

        FootballPlayer congPhuong = new FootballPlayer("Cong Phuong");
        VolleyBallPlayer vanKieu = new VolleyBallPlayer("Van Kieu");
        BasketBallPlayer caoKeu = new BasketBallPlayer("Cao Keu");

        hanoiTT.addPlayer(congPhuong);
        hanoiTT.addPlayer(vanKieu);
        hanoiTT.addPlayer(caoKeu);

        // What problem when we use any kind of data like this Team<String> ?

        // Implement the matchResult method in Team class ?

        // How to a football team fight with a basket ball team ? How to prevent that

    }


}
