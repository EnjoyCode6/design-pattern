public class Direct {

    private HouseBuilder builder;

    public Direct(HouseBuilder houseBuilder) {
        this.builder = houseBuilder;
    }

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildFoundation();
        builder.buildDoor();
        builder.buildGarage();
        builder.buildGarden();
        builder.buildPool();
        builder.buildRoof();
        builder.buildWindow();
    }


}
