import House.House;

public class RichHouseBuilder implements HouseBuilder{

    private House house;

    public RichHouseBuilder() {
        this.house = new House();
    }

    public House build() {
        return house;
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("豪华地基");
        System.out.println("建造豪华地基");
    }

    @Override
    public void buildDoor() {
        house.setDoor("豪华门");
        System.out.println("建造豪华门");
    }

    @Override
    public void buildWindow() {
        house.setWindow("豪华落地窗");
        System.out.println("建造豪华落地窗");
    }

    @Override
    public void buildRoof() {
        house.setRoof("大气上档次屋顶");
        System.out.println("建造大气上档次屋顶");
    }

    @Override
    public void buildGarden() {
        house.setGarden("美丽花园");
    }

    @Override
    public void buildGarage() {
        house.setGarage("豪华车库");
        System.out.println("建造豪华车库");
    }

    @Override
    public void buildPool() {
        house.setPool("豪华泳池");
        System.out.println("建造豪华泳池");
    }

}
