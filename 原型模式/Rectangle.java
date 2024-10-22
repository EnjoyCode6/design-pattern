public class Rectangle extends Shape{

    private Integer length;

    public Rectangle(){};

    public Rectangle(Rectangle origin) {
        this.length = origin.length;
        this.setArea(origin.getArea());
        this.setColor(origin.getColor());
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length + " " + super.toString() +
                '}';
    }
}
