import House.House;

public class PoorHouseBuilder implements HouseBuilder{

    private House house;

    public PoorHouseBuilder() {
        this.house = new House();
    }

    public House build() {
        return house;
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("破烂的地基");
        System.out.println("建造破烂的地基");
    }

    @Override
    public void buildDoor() {
        house.setDoor("摇摇欲坠的木门");
        System.out.println("建造摇摇欲坠的木门");
    }

    @Override
    public void buildWindow() {
        house.setWindow("破洞的窗户");
        System.out.println("建造破洞的窗户");
    }

    @Override
    public void buildRoof() {

    }

    @Override
    public void buildGarden() {

    }

    @Override
    public void buildGarage() {

    }

    @Override
    public void buildPool() {

    }
}
