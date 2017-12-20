package core.com.udemy.timbuchalka.section11_generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/20/20171:14 PM.
 */
public class Team <T extends Player & Comparable<T>> {

    private String name;

    private int played = 0;

    private int won = 0;

    private int lost = 0;

    private int tied = 0;

    List<T> list;

    public Team(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    public void addPlayer(T player) {
        if (list.contains(player)){
            System.out.println(((Player) player).getName() + " alreadt in the team");
        } else {
            list.add(player);
            System.out.println(((Player) player).getName() + " added to the team");
        }
    }

    public void matchResult(Team<T> opponent, int ourscore, int theirscore){
        played++;
        String message = "";
        if (ourscore == theirscore) {
            tied++;
            message = " tied with ";
        } else if (ourscore > theirscore){
            won++;
            message = " won to ";
        } else {
            lost++;
            message = " loose before ";
        }

        if (opponent != null) {
            System.out.println(getName() + message + opponent.getName());
            matchResult(null, theirscore, ourscore);
        }
    }

    public int ranking(){
        return won * 3 + tied * 1;
    }

    public int size(){
        return list.size();
    }

    public String getName() {
        return name;
    }
}
