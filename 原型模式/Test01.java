import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();
        Circle circle1 = new Circle();
        circle1.setColor("yellow");
        circle1.setArea(100);
        circle1.setPerimeter(10);
        Circle circle2 = new Circle();
        circle2.setColor("blue");
        circle2.setArea(200);
        circle2.setPerimeter(15);
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("red");
        rectangle.setArea(300);
        rectangle.setLength(30);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle);
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }
        for (Shape shape : shapesCopy) {
            System.out.println(shape.toString());
        }
    }
}
