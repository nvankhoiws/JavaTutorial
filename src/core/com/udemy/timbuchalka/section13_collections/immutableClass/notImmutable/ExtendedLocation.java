package core.com.udemy.timbuchalka.section13_collections.immutableClass.notImmutable;

import java.util.Map;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 1/5/20183:53 PM.
 */
public class ExtendedLocation extends Location {

    public ExtendedLocation(int locationID, String description, Map<String, Integer> exits) {
        super(locationID, description, null);
    }

    @Override
    public Map<String, Integer> getExits() {
        System.out.println("Override successfully! ");
        return null;
    }
}
