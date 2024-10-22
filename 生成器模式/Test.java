public class Test {
    public static void main(String[] args) {
        RichHouseBuilder richHouseBuilder = new RichHouseBuilder();
        Direct direct = new Direct(richHouseBuilder);
        direct.construct();
//        richHouseBuilder.build().showHouse();
        System.out.println();
        PoorHouseBuilder poorHouseBuilder = new PoorHouseBuilder();
        direct.setBuilder(poorHouseBuilder);
        direct.construct();
//        poorHouseBuilder.build().showHouse();
    }
}
