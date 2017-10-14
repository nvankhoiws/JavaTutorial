package core.com.udemy.timbuchalka.composition;

public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlot;
    private int cardSlot;

    public MotherBoard(String model, String manufacturer, int ramSlot, int cardSlot) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
    }

    public void loadProgram(){
        System.out.println("MotherBoard.loadProgram()...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlot() {
        return cardSlot;
    }
}
