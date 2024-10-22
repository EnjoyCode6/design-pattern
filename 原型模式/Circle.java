public class Circle extends Shape{

    private Integer perimeter;

    public Circle() {};

    public Circle(Circle origin) {
        this.perimeter = origin.perimeter;
        this.setArea(origin.getArea());
        this.setColor(origin.getColor());
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public Integer getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(Integer perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "perimeter=" + perimeter + " " + super.toString() +
                '}';
    }
}
