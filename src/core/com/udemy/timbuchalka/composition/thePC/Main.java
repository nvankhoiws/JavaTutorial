package core.com.udemy.timbuchalka.composition.thePC;

public class Main {
    public static void main(String[] args) {
        Monitor theMonitor = new Monitor("Samsung 743NX",
                "Samsung",
                new Resolution(1280, 1024));

        Case theCase = new Case("Logitek 450W",
                "Logitek",
                new Dimension(400, 500, 300));

        MotherBoard theMotherBoard = new MotherBoard("Foxcon 456",
                "Foxcon",
                4,
                6);

        PC pc = new PC(theMonitor, theCase, theMotherBoard, "Hanoi Computer");
        pc.turnOn();
        int width = pc.getTheMonitor().getResolution().getWidth();
        int height = pc.getTheMonitor().getResolution().getHeight();
        System.out.println("pc monitor dimension: width " + width + " height " + height);
    }
}
