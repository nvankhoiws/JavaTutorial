package core.com.udemy.timbuchalka.section10_interface_abstract_inner.interfaces.challenge;

import java.util.Map;

public class GameApp {
    public static void main(String[] args) {
        Savable player = new Player("Khoi", 100.0, 70.0, "Sword");
        Map store = player.save();

        Player loadedPlayer = new Player().load(store);
        System.out.println(loadedPlayer.toString());
    }
}
