public class circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public String toString() {
        return "Circle[radius=" + this.radius + ", color=" + this.color + "]";
    }
}