public abstract class Shape implements CloneEnable<Shape> {
    private String color;

    private Integer area;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", area=" + area;
    }
}
