package core.com.udemy.timbuchalka.composition.theRoom;

import core.com.udemy.timbuchalka.composition.thePC.Dimension;

public class Main {
    public static void main(String[] args) {

        Blanket blanket = new Blanket("Blanket", "HoaPhatBlanket", "Hoa Phat", "Pink", "Cotton",
                        new Dimension(180, 10, 200), 0);

        HoaPhatBed hoaPhatBed = new HoaPhatBed("White", new Dimension(180, 50, 200));

        Desk desk = new Desk(new Dimension(160, 75, 60), "Wood", 4, "White");

        Lamp lamp = new Lamp(null, 120, "Black", true);

        Picture picture = new Picture(null, "Plastic", "Family's Picture", 2016);

        PowerSwitch powerSwitch = new PowerSwitch("Green", 4, "Plastic",1, true);

        int hourInDay = 19;

        TheRoom theRoom = new TheRoom(hoaPhatBed, desk, lamp, picture, powerSwitch, hourInDay);

        theRoom.lampOnAutomatically();

        theRoom.getBed().isPeopleSleeping();

        theRoom.getBed().setPeopleNumberOnBed(4);

        theRoom.getBed().isPeopleSleeping();

        System.out.println("Get the material of the bed\n");
        theRoom.getBed().getMaterial();

    }
}
