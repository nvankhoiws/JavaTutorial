package core.com.udemy.timbuchalka.section11_generic.challenge;

import core.com.udemy.timbuchalka.section11_generic.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League <T extends Team> {

    List<T> teamlist;

    public League() {
        this.teamlist = new ArrayList<>();
    }

    public void addTeam(T team){
        this.teamlist.add(team);
    }

    public void printLeageTeamList(){
        Collections.sort(this.teamlist);
        for (int i = 0, length = this.teamlist.size(); i < length; i++) {
            System.out.println(""+ (i+1) + " team is " +
                    this.teamlist.get(i).getName() + " with point of " +
                    this.teamlist.get(i).ranking() + " point.");
        }
    }

    public List<T> getTeamlist() {
        return teamlist;
    }
}