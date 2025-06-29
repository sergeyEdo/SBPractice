package u_2_ex_2;

public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return 3.14d * this.radius * this.radius;
    }

    public double perimeter() {
        return 2d * 3.14d * this.radius;
    }

    @Override
    public String toString() {
        return this.radius + " " + this.color + " " + this.area() + " " + this.perimeter();
    }
}