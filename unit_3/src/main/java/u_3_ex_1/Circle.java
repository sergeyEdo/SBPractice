package u_3_ex_1;

public class Circle extends Figure implements Drawable{
    public double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14d * this.radius * this.radius;
    }
    @Override
    public double perimeter() {
        return 2d * 3.14d * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован КРУГ с кординатами (" + this.point.x + ", " + this.point.y + ")");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован КРУГ с кординатами (" + this.point.x + ", " + this.point.y + ") и цветом  " + color);
    }
}