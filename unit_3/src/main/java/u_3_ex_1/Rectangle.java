package u_3_ex_1;

public class Rectangle extends Figure implements Drawable{
    public double sideA;
    public double sideB;

    public Rectangle(Point point, double sideA, double sideB) {
        super(point);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return this.sideA * this.sideB;
    }

    @Override
    public double perimeter() {
        return 2d* this.sideA + 2d * this.sideB;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован ПРЯМОУГОЛЬНИК с кординатами (" + this.point.x + ", " + this.point.y + ")");
    }

    @Override
    public void draw(Color color) {
        System.out.println("Нарисован ПРЯМОУГОЛЬНИК с кординатами (" + this.point.x + ", " + this.point.y + ") и цветом  " + color);
    }
}