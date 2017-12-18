package core.com.udemy.timbuchalka.section10_interface_abstract_inner.interfaces.challenge;

import java.util.HashMap;
import java.util.Map;

public class Player implements Savable{
    private String name;

    private Double power;

    private Double defend;

    private String weapon;

    public Player() {

    }

    public Player(String name, Double power, Double defend, String weapon) {
        this.name = name;
        this.power = power;
        this.defend = defend;
        this.weapon = weapon;
    }

    @Override
    public Map save() {
        Map<String, Object> m = new HashMap();
        m.put("name", name);
        m.put("power", power);
        m.put("defend", defend);
        m.put("weapon", weapon);
        System.out.println(this.toString());
        return m;
    }

    @Override
    public Player load(Map map) {
        return new Player((String)map.get("name"), (Double)map.get("power"), (Double)map.get("defend"), (String)map.get("weapon"));
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t" + "Power: " + power + "\t" + "Defend: " + defend + "\t"
                + "Weapon: " + weapon ;
    }
}
