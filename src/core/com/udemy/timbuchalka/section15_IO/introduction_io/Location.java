package core.com.udemy.timbuchalka.section15_IO.introduction_io;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dev on 8/12/2015.
 * We are trying to create an immutable class
 */
public final class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null) {
            this.exits = new HashMap<String, Integer>(exits);
        } else {
            // prevent NullPointerException
            this.exits = new HashMap<String, Integer>();
        }
        // the map cannot user "new" keyword because it is final
//        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    // I would like to make this class is immutable, so I commented out this method
//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
