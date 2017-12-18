package core.com.udemy.timbuchalka.section10_interface_abstract_inner.interfaces.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Monster implements Savable {

    private String name;

    private Double power;

    private String ability;

    public Monster(String name, Double power, String ability) {
        this.name = name;
        this.power = power;
        this.ability = ability;
    }

    @Override
    public Map save() {
        Map<String, Object> m = new HashMap();
        m.put("name", name);
        m.put("power", power);
        m.put("ability", ability);
        System.out.println(this.toString());
        return m;
    }

    @Override
    public Monster load(Map map) {
        return new Monster((String)map.get("name"), (Double)map.get("power"), (String)map.get("ability"));
    }

    @Override
    public String toString() {
        return "Name: " + name + "\t" + "Power: " + power + "\t" + "Ability: " + ability + "\t";
    }
}
