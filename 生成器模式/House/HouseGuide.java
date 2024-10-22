package House;

import java.lang.reflect.Field;

public class HouseGuide {

    private String doorGuide;

    private String windowGuide;

    private String foundationGuide;

    private String roofGuide;

    private String gardenGuide;

    private String garageGuide;

    private String poolGuide;

    public void showHouse() {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true); // Allow access to private fields
            try {
                Object value = field.get(this);
                if (value != null) {
                    System.out.println(field.getName() + ": " + value);
                }
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
