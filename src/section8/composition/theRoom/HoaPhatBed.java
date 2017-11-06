package core.com.udemy.timbuchalka.section8.composition.theRoom;

import core.com.udemy.timbuchalka.section8.composition.thePC.Dimension;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/16/201711:54 AM.
 */
public class HoaPhatBed extends Bed {

    public HoaPhatBed(String color, Dimension dimension) {
        super("Bed", "HoaPhatBed", "Hoa Phat", color, "Wood", dimension, 0, null, false, true);
    }

}
