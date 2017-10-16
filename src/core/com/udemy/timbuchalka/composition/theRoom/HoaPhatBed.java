package core.com.udemy.timbuchalka.composition.theRoom;

import core.com.udemy.timbuchalka.composition.thePC.Dimension;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 10/16/201711:54 AM.
 */
public class HoaPhatBed extends Bed {

    public HoaPhatBed(String color, Dimension dimension) {
        super("Bed", "HoaPhatBed", "Hoa Phat", color, "Wood", dimension, 0, null, false, true);
    }

}
